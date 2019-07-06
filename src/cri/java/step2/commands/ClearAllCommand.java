package cri.java.step2.commands;

import cri.java.step2.calculation.CalculationStack;

public class ClearAllCommand extends Command {
    @Override
    public CalculationStack execute(CalculationStack calculationStack) {
        calculationStack.clearAll();
        return calculationStack;
    }
}
