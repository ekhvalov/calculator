package cri.java.step2.commands;

import cri.java.step2.calculation.CalculationStack;

public class ClearCommand extends Command {
    @Override
    public CalculationStack execute(CalculationStack calculationStack) {
        calculationStack.clear();
        return calculationStack;
    }
}
