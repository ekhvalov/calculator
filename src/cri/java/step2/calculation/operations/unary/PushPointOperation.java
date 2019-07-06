package cri.java.step2.calculation.operations.unary;

import cri.java.step2.calculation.InputStack;

public class PushPointOperation extends UnaryOperation {
    @Override
    public InputStack execute(InputStack inputStack) {
        inputStack.pushPoint();
        return inputStack;
    }
}
