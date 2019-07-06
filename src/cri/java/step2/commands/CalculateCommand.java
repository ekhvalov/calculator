package cri.java.step2.commands;

import cri.java.step2.calculation.CalculationStack;

public class CalculateCommand extends Command {
    @Override
    public CalculationStack execute(CalculationStack calculationStack) {
        calculationStack.calculate();
        return calculationStack;
    }
}
