/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author besker
 */
public class Calculadora extends JFrame implements ActionListener {

    String temp;
    int op1, op2;
    boolean opSuma, opResta, opMul, opDiv;
    JPanel pp, pb;
    JTextField p;
    JButton b[];
    String bt[] = new String[]{"7", "8", "9", "+",
        "4", "5", "6", "-",
        "1", "2", "3", "*",
        "0", ".", "=", "/"};

    public Calculadora() {
        setTitle("Calculadora");
        setSize(190, 170);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1));
        setLayout(new BorderLayout());
        pp = new JPanel();
        pb = new JPanel();
        p = new JTextField(20);
        b = new JButton[16];
        pb.setLayout(new GridLayout(4, 4));
        pp.add(p);
        add(pp);
        add(BorderLayout.NORTH, pp);
        for (int i = 0; i < 16; i++) {
            b[i] = new JButton(bt[i]);
            pb.add(b[i]);
            b[i].addActionListener((ActionListener) this);
        }

        add(pb);
        add(BorderLayout.SOUTH, pb);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(b[0])) {
            temp = p.getText();
            temp = temp + "7";
            p.setText(temp);
        }
        // b[1], b[2],b[4], b[5], b[6],b[8], b[9], b[10], b[12];
        if (e.getSource().equals(b[3])) {
            opSuma = true;
            opResta = false;
            opMul = false;
            opDiv = false;
            op1 = integerParseInt(p.getText());
            p.setText(" ");
        }
        if(e.getSource().equals(b[14])){
            if(opSuma){
                op2 =integerParseInt(p.getText());
                int res = op1+op2;
                p.setText(String.valueOf(res));
            }
        }
    }

    private int integerParseInt(String text) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}