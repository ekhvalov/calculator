package cri.java.step2.swing;

import cri.java.step2.calculation.CalculationStack;
import cri.java.step2.calculation.operations.binary.BinaryOperation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHandler implements ActionListener {
    private OutputPanel outputPanel;
    private CalculationStack calculationStack;

    ButtonHandler(OutputPanel outputPanel, CalculationStack calculationStack) {
        this.outputPanel = outputPanel;
        this.calculationStack = calculationStack;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Button button = this.getButton(actionEvent);
        calculationStack = button.getCommand().execute(calculationStack);
        this.updateOutputPanel(outputPanel, calculationStack);
    }

    private Button getButton(ActionEvent event) {
        return (Button) event.getSource();
    }

    private void updateOutputPanel(OutputPanel outputPanel, CalculationStack calculationStack) {
        outputPanel.updateNumericField(calculationStack.getInputStackValue());
        Double bufferValue = calculationStack.getBuffer();
        BinaryOperation operation = calculationStack.getOperation();
        outputPanel.updateFormulaField(bufferValue, operation);
    }
}
