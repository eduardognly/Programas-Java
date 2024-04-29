/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package galeria_imagenes;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 *
 * @author besker
 */
public class GaleriaImagenes extends JFrame implements ActionListener {

    JButton btnatras, btnadelante;
    JPanel pb;
    PanelImagenes pi;

    public GaleriaImagenes() {
        setTitle("Galeria Imagenes");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        pi = new PanelImagenes();
        pi.setActualI(2);
        //pi.variableestatica=3;

        btnatras = new JButton("anterior");
        btnadelante = new JButton("siguiente");

        btnatras.addActionListener(this);
        btnadelante.addActionListener(this);

        add(pi, BorderLayout.CENTER);
        pb = new JPanel();
        pb.add(btnatras);
        pb.add(btnadelante);
        add(pb, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btnadelante)) {
            pi.setActualI((pi.getActualI() + 1) % 4);
        }
        if (e.getSource().equals(btnatras)) {
            pi.setActualI((pi.getActualI() - 1 + 4) % 4);
        }
        pi.repaint();
    }

    public static void main(String[] args) {
        GaleriaImagenes gi = new GaleriaImagenes();
        gi.setVisible(true);
    }

}