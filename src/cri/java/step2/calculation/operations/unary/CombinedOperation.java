package cri.java.step2.calculation.operations.unary;

import cri.java.step2.calculation.InputStack;

import java.util.ArrayList;

public class CombinedOperation extends UnaryOperation {
    private ArrayList<UnaryOperation> operations = new ArrayList<>();

    public void addOperation(UnaryOperation operation) {
        operations.add(operation);
    }

    @Override
    public InputStack execute(InputStack inputStack) {
        for (UnaryOperation operation : operations) {
            inputStack = operation.execute(inputStack);
        }
        return inputStack;
    }
}
