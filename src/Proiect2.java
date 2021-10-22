import javax.swing.*;
import Calculator.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Proiect2 {
    private JTextField val1;
    private JTextField val2;
    private JTextField result;
    private JButton btnCalc;
    private JButton btnmult;
    private JButton btndif;
    private JButton btnsum;
    private JButton btnInput;
    private JPanel rootPanel;


    Calculator calc = new Calculator();
    private double resultVal;

    public Proiect2() {

        btnInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = val1.getText();
                double val;
                if(!str.isEmpty()) {
                    try {
                        val = Double.parseDouble(str);
                        int result = JOptionPane.showConfirmDialog(null, "Are you sure, that you want to change the 1st value?",
                                "Question",
                                JOptionPane.YES_NO_CANCEL_OPTION,
                                JOptionPane.QUESTION_MESSAGE);
                        if (result == JOptionPane.YES_OPTION) {
                            calc.setVal1(val);
                        }
                    } catch (NumberFormatException nfe) {
                        calc.setVal1(Calculator.DEBUG_VALUE_1);
                        JOptionPane.showConfirmDialog(null, "The 1st value is not a double!\nThe value will remain the last valid input",
                                "Error",
                                JOptionPane.DEFAULT_OPTION,
                                JOptionPane.ERROR_MESSAGE);
                        System.out.println("Not double!!!");
                    }
                }
                str = val2.getText();
                if(!str.isEmpty()) {
                    try {
                        val = Double.parseDouble(str);
                        int result = JOptionPane.showConfirmDialog(null, "Are you sure, that you want to change the 2nd value?",
                                "Question",
                                JOptionPane.YES_NO_CANCEL_OPTION,
                                JOptionPane.QUESTION_MESSAGE);
                        if (result == JOptionPane.YES_OPTION) {
                            calc.setVal2(val);
                        }
                    } catch (NumberFormatException nfe) {
                        calc.setVal2(Calculator.DEBUG_VALUE_2);
                        JOptionPane.showConfirmDialog(null, "The 2nd value is not a double!\nThe value will remain the last valid input",
                                "Error",
                                JOptionPane.DEFAULT_OPTION,
                                JOptionPane.ERROR_MESSAGE);
                        System.out.println("Not double!!!");
                    }
                }
            }
        });
        btnsum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultVal = calc.sum(calc.getVala(),calc.getValb());
                JOptionPane.showConfirmDialog(null, "You added the two numbers",
                        "Info",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
        btndif.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultVal = calc.dif(calc.getVala(),calc.getValb());
                JOptionPane.showConfirmDialog(null, "You subtracted the two numbers",
                        "Info",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
        btnmult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultVal = calc.mult(calc.getVala(),calc.getValb());
                JOptionPane.showConfirmDialog(null, "You multiplicated the two numbers",
                        "Info",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
        btnCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result.setText(calc.toString() + resultVal);
            }
        });
    }

    //MAIN

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new Proiect2().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
