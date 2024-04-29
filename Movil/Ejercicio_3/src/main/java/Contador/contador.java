/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contador;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author besker
 */
public class contador extends JFrame implements Runnable, ActionListener {

    JLabel num;
    int i = 0;
    boolean contar = true;
    JButton ini, stp;
    Thread hilo;

    public contador() {
        setTitle("contador");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));
        num = new JLabel(i + "");
        add(num);
        hilo = new Thread(this);
        ini = new JButton("Iniciar");
        stp = new JButton("Detener");
        ini.addActionListener(this);
        stp.addActionListener(this);
        add(ini);
        add(stp);

    }

    public static void main(String[] args) {
        // TODO code application logic here
        contador e = new contador();
        e.setVisible(true);

    }

    @Override
    public void run() {
        while (contar) {

            try {
                i++;
                num.setText(i + "");
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("No funciona");
            }

        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(ini)) {
            contar = true;
            System.out.println("Funciona");
            hilo.start();
        }
        if (e.getSource().equals(stp)) {
            contar = false;
            System.out.println("ZZZZZZZZ");
        }

    }
}