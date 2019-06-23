package cri.java.step2.swing;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class OutputPanel extends JPanel implements ActionListener{
	private FormulaField formula = new FormulaField();
    private NumericField numeric = new NumericField();
    private ReceiveValues receive;

	OutputPanel(){
		BoxLayout calcLayout = new BoxLayout(this, BoxLayout.Y_AXIS);
        setLayout(calcLayout);
        setPreferredSize(new Dimension(320, 120));
        EmptyBorder margin = new EmptyBorder(20, 20, 20, 20);
        setBorder(margin);

        numeric.setText("0");

        add(formula);
        add(numeric);
	}

	public void actionPerformed(ActionEvent e) {
		JButton pushButton = (JButton) e.getSource();
		String buttonValue = pushButton.getText();
		String formulaValue = formula.getText();
		String numericValue = numeric.getText();

		receive = new ReceiveValues(formulaValue, numericValue, buttonValue);
	}

	public void resetValues(String formulaValue, String numericValue) {
		formula.setText(formulaValue);
		numeric.setText(numericValue);
	}
}
