package org.example;

import javax.swing.*;
import java.awt.*;

public class Register {
    JFrame frame = new JFrame("Registration Page");
    JPanel panel = new JPanel(new FlowLayout());
    JLabel labelUsername = new JLabel("Enter login:");
    JTextField fieldUsername = new JTextField(15);
    JLabel labelPassword = new JLabel("Enter password:");
    JPasswordField fieldPassword = new JPasswordField(15);
    JLabel labelPasswordRepeat = new JLabel("Repeat password:");
    JPasswordField fieldPasswordRepeat = new JPasswordField(15);
    JLabel labelConsents = new JLabel("Accept the rules:");
    JCheckBox checkBoxConsents  = new JCheckBox("Accept");


    Register(){
        panel.add(labelUsername);
        panel.add(fieldUsername);
        panel.add(labelPassword);
        panel.add(fieldPassword);
        panel.add(labelPasswordRepeat);
        panel.add(fieldPasswordRepeat);
        panel.add(labelConsents);
        panel.add(checkBoxConsents);


        frame.add(panel);
        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
