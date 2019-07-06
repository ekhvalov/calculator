package cri.java.step2.commands;

import cri.java.step2.calculation.CalculationStack;
import cri.java.step2.calculation.operations.unary.UnaryOperation;

public class UnaryOperationCommand extends Command {
    private UnaryOperation operation;

    public UnaryOperationCommand(UnaryOperation operation) {
        this.operation = operation;
    }

    @Override
    public CalculationStack execute(CalculationStack calculationStack) {
        calculationStack.pushUnaryOperation(operation);
        return calculationStack;
    }
}
