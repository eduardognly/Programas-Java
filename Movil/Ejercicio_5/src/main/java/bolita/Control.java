/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bolita;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author besker
 */
public class Control extends JPanel implements ActionListener {

    JButton btnIzq, btnDer, btnArriba, btnAbajo;
    Bolita bolita;

    public Control() {
    }

    public Control(Bolita b) {

        setLayout(new BorderLayout());
        btnIzq = new JButton("Izquierda ");
        btnDer = new JButton("Derecha ");
        btnArriba = new JButton("Arriba ");
        btnAbajo = new JButton("Abajo ");

        btnIzq.addActionListener(this);
        btnDer.addActionListener(this);
        btnArriba.addActionListener(this);
        btnAbajo.addActionListener(this);

        bolita = new Bolita();
        bolita = b;

        add(btnIzq, BorderLayout.WEST);
        add(btnDer, BorderLayout.EAST);
        add(btnAbajo, BorderLayout.NORTH);
        add(btnArriba, BorderLayout.SOUTH);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btnIzq)) {
            bolita.setMoverX(bolita.getMoverX() - 5);
        }
        if (e.getSource().equals(btnDer)) {
            bolita.setMoverX(bolita.getMoverX() + 5);
        }
        bolita.repaint();
    }
}