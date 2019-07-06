package cri.java.step2.calculation.operations.unary;

import cri.java.step2.swing.NumericSymbol;
import cri.java.step2.calculation.InputStack;

public class PushNumericOperation extends UnaryOperation {
    private NumericSymbol numericSymbol;

    public PushNumericOperation(NumericSymbol numericSymbol) {
        this.numericSymbol = numericSymbol;
    }

    @Override
    public InputStack execute(InputStack inputStack) {
        inputStack.pushNumeric(numericSymbol);
        return inputStack;
    }
}
