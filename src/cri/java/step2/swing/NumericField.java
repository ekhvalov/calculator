package cri.java.step2.swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class NumericField extends JTextField{
	NumericField(){
		setHorizontalAlignment(JTextField.RIGHT);
		setFont(new Font("MS UI Gothic", Font.PLAIN, 60));
		setEditable(false);
		setPreferredSize(new Dimension(320,80));
        LineBorder border = new LineBorder(Color.DARK_GRAY, 1);
        setBorder(border);
	}
}
