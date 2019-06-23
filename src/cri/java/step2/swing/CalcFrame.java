package cri.java.step2.swing;

import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class CalcFrame extends JFrame{
	public static OutputPanel outputPanel = new OutputPanel();
	private InputPanel inputPanel = new InputPanel();
	CalcFrame() {
		setTitle("電卓");
		setSize(368, 614);//8と34
		setResizable(false);
		setDefaultCloseOperation(CalcFrame.EXIT_ON_CLOSE);
        Container contentPane = this.getContentPane();
        BoxLayout calcLayout = new BoxLayout(contentPane, BoxLayout.Y_AXIS);
        contentPane.setLayout(calcLayout);



        add(outputPanel);
		add(inputPanel);
	}
}
