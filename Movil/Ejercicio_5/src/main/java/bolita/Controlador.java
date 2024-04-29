/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bolita;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author besker
 */
public class Controlador extends JFrame {

    JPanel pBolita, pControl;

    public Controlador() {
        setTite("Mover");
        setSize(400, 400);
        SetDefaultCloseOporation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1));
        setResizable(false);
        Bolita b = new Bolita();
        pBolita = new JPanel();
        pControl = new Control();
        pBolita.add(b);
        Control control = new Control(b);
        pControl.add(control);
        add(pBolita);
        add(pControl);
    }

    private void setTite(String mover) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void SetDefaultCloseOporation(int EXIT_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
