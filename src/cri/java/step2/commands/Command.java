package cri.java.step2.commands;

import cri.java.step2.calculation.CalculationStack;

abstract public class Command {
    abstract public CalculationStack execute(CalculationStack calculationStack);
}
