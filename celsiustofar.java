package collegeassignment;

import javax.swing.*;
import java.awt.event.*;

public class celsiustofar {

    public static void main(String[] args) {

        JFrame f = new JFrame("Celsius to Fahrenheit");

        JLabel l1 = new JLabel("Celsius:");
        JLabel l2 = new JLabel("Fahrenheit:");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();

        JButton b = new JButton("Convert");

        // Set positions
        l1.setBounds(30, 30, 100, 30);
        t1.setBounds(150, 30, 120, 30);

        l2.setBounds(30, 80, 100, 30);
        t2.setBounds(150, 80, 120, 30);

        b.setBounds(100, 130, 100, 30);

        // Button action
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double c = Double.parseDouble(t1.getText());
                    double fValue = (c * 9/5) + 32;
                    t2.setText(String.valueOf(fValue));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(f, "Enter valid number!");
                }
            }
        });

        // Add components
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b);

        // Frame settings
        f.setSize(320, 250);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}