package cri.java.step2.swing;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.JButton;

public class PushButton extends JButton{

	PushButton(String text, OutputPanel listener) {
		setText(text);
		setPreferredSize(new Dimension(80, 80));
		setFont(new Font("MS UI Gothic", Font.PLAIN, 35));
		setMargin(new Insets(0, 0, 0, 0));
		addActionListener(listener);
	}
}
