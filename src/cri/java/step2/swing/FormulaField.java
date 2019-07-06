package cri.java.step2.swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.border.LineBorder;

class FormulaField extends JTextField{
	FormulaField(){
		setHorizontalAlignment(JTextField.RIGHT);
		setFont(new Font("MS UI Gothic", Font.PLAIN, 30));
		setEditable(false);
		setPreferredSize(new Dimension(335,40));
        LineBorder border = new LineBorder(Color.DARK_GRAY, 1);
        setBorder(border);
	}
}
