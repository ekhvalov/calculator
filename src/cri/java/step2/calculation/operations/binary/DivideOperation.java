package cri.java.step2.calculation.operations.binary;

public class DivideOperation extends BinaryOperation {
    @Override
    public double execute(double left, double right) {
        if (right == 0.0) {
            return left; // TODO: Is it right way?
        }
        return left / right;
    }

    @Override
    public String toString() {
        return "÷"; // TODO: Define it by constructor
    }
}
