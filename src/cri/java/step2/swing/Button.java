package cri.java.step2.swing;

import cri.java.step2.commands.Command;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.JButton;

class Button extends JButton {

    private Command command;

    Button(String text, Command command) {
        this.command = command;
        setText(text);
        setPreferredSize(new Dimension(80, 80));
        setFont(new Font("MS UI Gothic", Font.PLAIN, 35));
        setMargin(new Insets(0, 0, 0, 0));
    }

    Command getCommand() {
        return this.command;
    }
}
