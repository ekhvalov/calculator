package cri.java.step2.commands;

import cri.java.step2.calculation.CalculationStack;
import cri.java.step2.calculation.operations.binary.BinaryOperation;

public class BinaryOperationCommand extends Command {
    private BinaryOperation operation;

    public BinaryOperationCommand(BinaryOperation operation) {
        this.operation = operation;
    }

    @Override
    public CalculationStack execute(CalculationStack calculationStack) {
        calculationStack.pushBinaryOperation(operation);
        return calculationStack;
    }
}
