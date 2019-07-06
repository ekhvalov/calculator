package cri.java.step2.calculation;

import cri.java.step2.swing.NumericSymbol;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class InputStack {
    private String value = "0";
    private int stackSize;
    private NumberFormat formatter;

    InputStack(int stackSize) {
        this.stackSize = stackSize;
        String decimalPart = new String(new char[stackSize - 2]).replace('\0', '0');
        formatter = new DecimalFormat("0.".concat("0".concat(decimalPart)));
    }

    public void pushNumeric(NumericSymbol symbol) {
        if (value.length() == stackSize) {
            return;
        }
        if (value.equals(NumericSymbol.ZERO.toString())) {
            if (symbol == NumericSymbol.ZERO) {
                return;
            }
            value = symbol.toString();
            return;
        }
        value = value.concat(symbol.toString());
    }

    public void pushPoint() {
        if (value.length() == stackSize) {
            return;
        }
        if (!value.contains(".")) {
            value = value.concat(".");
        }
    }

    public void pop() {
        value = value.substring(0, value.length() - 1);
        if (this.isEmpty(value)) {
            this.clear();
        }
    }

    public String toString() {
        return value;
    }

    void clear() {
        value = NumericSymbol.ZERO.toString();
    }

    void setValue(double newValue) {
        if (newValue == (long) newValue) {
            value = String.valueOf((long) newValue);
        } else {
            value = String.valueOf(this.trimTailZeroes(formatter.format(newValue)));
        }
    }

    double getValue() {
        return Double.valueOf(value);
    }

    private boolean isEmpty(String value) {
        return (value.length() == 0) || value.equals("-");
    }

    private String trimTailZeroes(String value) {
        while (value.charAt(value.length() - 1) == '0') {
            value = value.substring(0, value.length() - 1);
        }
        return value;
    }
}
