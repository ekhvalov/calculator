package cri.java.step2.calculation.operations.binary;

public class AddOperation extends BinaryOperation {
    @Override
    public double execute(double left, double right) {
        return left + right;
    }

    @Override
    public String toString() {
        return "+"; // TODO: Define it by constructor
    }
}
