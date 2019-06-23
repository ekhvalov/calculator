package cri.java.step2.swing;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class InputPanel extends JPanel{
	OutputPanel outputPanel = CalcFrame.outputPanel;
	PushButton crearAll = new PushButton("CA", outputPanel);
	PushButton crear = new PushButton("C", outputPanel);
	PushButton backSpace = new PushButton("←", outputPanel);
	PushButton divided = new PushButton("÷", outputPanel);
	PushButton times = new PushButton("×", outputPanel);
	PushButton minus = new PushButton("-", outputPanel);
	PushButton plus = new PushButton("+", outputPanel);
	PushButton equal = new PushButton("=", outputPanel);
	PushButton point = new PushButton(".", outputPanel);

	PushButton one = new PushButton("1", outputPanel);
	PushButton two = new PushButton("2", outputPanel);
	PushButton three = new PushButton("3", outputPanel);
	PushButton four = new PushButton("4", outputPanel);
	PushButton five = new PushButton("5", outputPanel);
	PushButton six = new PushButton("6", outputPanel);
	PushButton seven = new PushButton("7", outputPanel);
	PushButton eight = new PushButton("8", outputPanel);
	PushButton nine = new PushButton("9", outputPanel);
	PushButton zero = new PushButton("0", outputPanel);
	PushButton zero2 = new PushButton("00", outputPanel);

	InputPanel(){
		GridLayout calendarLayout = new GridLayout(5, 4);
        setLayout(calendarLayout);
        setPreferredSize(new Dimension(320, 400));
        EmptyBorder margin = new EmptyBorder(0, 20, 20, 20);
        setBorder(margin);

		add(crearAll);	add(crear);		add(backSpace);	add(divided);
		add(seven);	add(eight);		add(nine);			add(times);
		add(four);		add(five);		add(six);			add(minus);
		add(one);		add(two);		add(three);			add(plus);
		add(zero);		add(zero2);	add(point);			add(equal);
	}
}
