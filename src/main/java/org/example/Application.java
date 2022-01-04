package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Application {

    public static void main(String[] args)  {
        JFrame frame = new JFrame("Frame of the application");
        JPanel panel = new JPanel();
        // FlowLayout will automatically choose the location of the elements based on the rules of the FlowLayout.
        // There are other layouts like card, box etc
        panel.setLayout(new FlowLayout());
        // setLayout(null) will let you choose the location by using setBounds.
        //panel.setLayout(null);
        JButton buttonMessage = new JButton();
        JButton buttonLogin = new JButton();
        JButton buttonRegister = new JButton();
        //buttonMessage.setBounds(100,160,200,40);

        frame.add(panel);
        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        buttonMessage.setText("Click here");
        buttonLogin.setText("Login Page");
        buttonRegister.setText("Register");
        panel.add(buttonMessage);
        panel.add(buttonLogin);
        panel.add(buttonRegister);


        buttonMessage.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)            {
                // Here goes the action you want to execute when clicked
                System.out.println("You clicked the button");
                buttonMessage.setText("Clicked");
            }
        });

        buttonLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)            {
                if(e.getSource() == buttonLogin){
                    frame.dispose();
                    Login loginPage = new Login();
                }
            }
        });

        buttonRegister.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)            {
                if(e.getSource() == buttonRegister){
                    frame.dispose();
                    Register registerPage = new Register();
                }
            }
        });
    }

}
