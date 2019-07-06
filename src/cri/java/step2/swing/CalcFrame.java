package cri.java.step2.swing;

import cri.java.step2.calculation.CalculationStack;
import cri.java.step2.calculation.operations.binary.AddOperation;
import cri.java.step2.calculation.operations.binary.DivideOperation;
import cri.java.step2.calculation.operations.binary.MultiplyOperation;
import cri.java.step2.calculation.operations.binary.SubtractOperation;
import cri.java.step2.calculation.operations.unary.CombinedOperation;
import cri.java.step2.calculation.operations.unary.PopOperation;
import cri.java.step2.calculation.operations.unary.PushNumericOperation;
import cri.java.step2.calculation.operations.unary.PushPointOperation;
import cri.java.step2.commands.*;

import java.awt.Container;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class CalcFrame extends JFrame {

    public CalcFrame() {
        setTitle("電卓");
        setSize(386, 614);//8と34
        setResizable(false);
        setDefaultCloseOperation(CalcFrame.EXIT_ON_CLOSE);
        Container contentPane = this.getContentPane();
        BoxLayout calcLayout = new BoxLayout(contentPane, BoxLayout.Y_AXIS);
        contentPane.setLayout(calcLayout);

        int inputFieldSize = 10;
        OutputPanel outputPanel = new OutputPanel(inputFieldSize);
        add(outputPanel);
        CalculationStack calculationStack = new CalculationStack(inputFieldSize);
        ButtonHandler buttonHandler = new ButtonHandler(outputPanel, calculationStack);
        InputPanel inputPanel = new InputPanel();
        for (Button button : this.getButtons()) {
            button.addActionListener(buttonHandler);
            inputPanel.add(button);
        }
        add(inputPanel);
    }

    private List<Button> getButtons() {
        List<Button> buttons = new ArrayList<>();
        buttons.add(new Button("CA", new ClearAllCommand()));
        buttons.add(new Button("C", new ClearCommand()));
        buttons.add(new Button("←", new UnaryOperationCommand(new PopOperation())));
        buttons.add(new Button("÷", new BinaryOperationCommand(new DivideOperation())));
        buttons.add(new Button("7", new UnaryOperationCommand(new PushNumericOperation(NumericSymbol.SEVEN))));
        buttons.add(new Button("8", new UnaryOperationCommand(new PushNumericOperation(NumericSymbol.EIGHT))));
        buttons.add(new Button("9", new UnaryOperationCommand(new PushNumericOperation(NumericSymbol.NINE))));
        buttons.add(new Button("×", new BinaryOperationCommand(new MultiplyOperation())));
        buttons.add(new Button("4", new UnaryOperationCommand(new PushNumericOperation(NumericSymbol.FOUR))));
        buttons.add(new Button("5", new UnaryOperationCommand(new PushNumericOperation(NumericSymbol.FIVE))));
        buttons.add(new Button("6", new UnaryOperationCommand(new PushNumericOperation(NumericSymbol.SIX))));
        buttons.add(new Button("-", new BinaryOperationCommand(new SubtractOperation())));
        buttons.add(new Button("1", new UnaryOperationCommand(new PushNumericOperation(NumericSymbol.ONE))));
        buttons.add(new Button("2", new UnaryOperationCommand(new PushNumericOperation(NumericSymbol.TWO))));
        buttons.add(new Button("3", new UnaryOperationCommand(new PushNumericOperation(NumericSymbol.THREE))));
        buttons.add(new Button("+", new BinaryOperationCommand(new AddOperation())));
        buttons.add(new Button("0", new UnaryOperationCommand(new PushNumericOperation(NumericSymbol.ZERO))));
        CombinedOperation doubleZero = new CombinedOperation();
        doubleZero.addOperation(new PushNumericOperation(NumericSymbol.ZERO));
        doubleZero.addOperation(new PushNumericOperation(NumericSymbol.ZERO));
        buttons.add(new Button("00", new UnaryOperationCommand(doubleZero)));
        buttons.add(new Button(".", new UnaryOperationCommand(new PushPointOperation())));
        buttons.add(new Button("=", new CalculateCommand()));

        return buttons;
    }
}
