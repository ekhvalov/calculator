package cri.java.step2.swing;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

class InputPanel extends JPanel {

    InputPanel() {
        GridLayout calendarLayout = new GridLayout(5, 4);
        setLayout(calendarLayout);
        setPreferredSize(new Dimension(320, 400));
        EmptyBorder margin = new EmptyBorder(0, 20, 20, 20);
        setBorder(margin);
    }
}
