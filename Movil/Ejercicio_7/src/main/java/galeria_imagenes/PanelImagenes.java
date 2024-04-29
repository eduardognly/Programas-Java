/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package galeria_imagenes;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author besker
 */
public class PanelImagenes extends JPanel {

    private String[] arregloI = {"imagen01.png", "imagen02.jpg", "imagen03.jpg", "imagen04.jpg"};
    private int actualI;
    //static int variableestatica;

    public int getActualI() {
        return actualI;
    }

    public void setActualI(int actualI) {
        this.actualI = actualI;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            BufferedImage i = ImageIO.read(new File(arregloI[actualI]));
            g.drawImage(i, 0, 0, getWidth(), getHeight(), null);
        } catch (Exception e) {
        }
    }

}