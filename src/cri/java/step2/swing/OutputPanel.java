package cri.java.step2.swing;

import com.sun.istack.internal.Nullable;
import cri.java.step2.calculation.operations.binary.BinaryOperation;

import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

class OutputPanel extends JPanel {
    private FormulaField formula = new FormulaField();
    private NumericField numeric;

    OutputPanel(int inputFieldSize) {
        BoxLayout calcLayout = new BoxLayout(this, BoxLayout.Y_AXIS);
        setLayout(calcLayout);
        setPreferredSize(new Dimension(340, 120));
        EmptyBorder margin = new EmptyBorder(20, 20, 20, 20);
        setBorder(margin);
        add(formula);
         numeric = new NumericField(inputFieldSize);
        add(numeric);
        numeric.setText("0");
    }

    void updateNumericField(String value) {
        numeric.setText(value);
    }

    void updateFormulaField(@Nullable Double value, @Nullable BinaryOperation operation) {
        if ((value != null) && (operation != null)) {
            this.formula.setText(this.doubleToString(value).concat(" ").concat(operation.toString()));
        } else {
            this.formula.setText("");
        }
    }

    private String doubleToString(double value) {
        if (value == (long) value) {
            return String.valueOf((long) value);
        }
        return String.valueOf(value);
    }
}
