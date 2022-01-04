package org.example;

import javax.swing.*;
import java.awt.*;

public class Login {
    JFrame frame = new JFrame("Login Page");
    JPanel panel = new JPanel(new GridBagLayout()); //it's recommended to write this that way
    JLabel labelUsername = new JLabel("Enter login:");
    JTextField fieldUsername = new JTextField(15);
    JLabel labelPassword = new JLabel("Enter password:");
    JPasswordField fieldPassword = new JPasswordField(15);

    Login(){
        panel.add(labelUsername);
        panel.add(fieldUsername);
        panel.add(labelPassword);
        panel.add(fieldPassword);

        frame.add(panel);
        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}
