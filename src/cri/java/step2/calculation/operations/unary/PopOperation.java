package cri.java.step2.calculation.operations.unary;

import cri.java.step2.calculation.InputStack;

public class PopOperation extends UnaryOperation {
    @Override
    public InputStack execute(InputStack inputStack) {
        inputStack.pop();
        return inputStack;
    }
}
