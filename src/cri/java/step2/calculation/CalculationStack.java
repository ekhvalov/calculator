package cri.java.step2.calculation;

import com.sun.istack.internal.Nullable;
import cri.java.step2.calculation.operations.binary.BinaryOperation;
import cri.java.step2.calculation.operations.unary.UnaryOperation;

public class CalculationStack {
    private InputStack inputStack;
    private Double buffer;
    private BinaryOperation operation;

    public CalculationStack(int inputStackSize) {
        inputStack = new InputStack(inputStackSize);
    }

    public void pushUnaryOperation(UnaryOperation operation) {
        inputStack = operation.execute(inputStack);
    }

    public void pushBinaryOperation(BinaryOperation operation) {
        if (buffer == null) {
            buffer = inputStack.getValue();
        } else {
            buffer = this.operation.execute(buffer, inputStack.getValue());
        }
        inputStack.clear();
        this.operation = operation;
    }

    public void calculate() {
        if (buffer != null) {
            inputStack.setValue(operation.execute(buffer, inputStack.getValue()));
            buffer = null;
            operation = null;
        }
    }

    public void clear() {
        inputStack.clear();
    }

    public void clearAll() {
        inputStack.clear();
        buffer = null;
        operation = null;
    }

    public String getInputStackValue() {
        return inputStack.toString();
    }

    @Nullable
    public Double getBuffer() {
        return buffer;
    }

    @Nullable
    public BinaryOperation getOperation() {
        return operation;
    }
}
