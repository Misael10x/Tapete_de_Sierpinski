
package mainapp;


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;


public class MainApp extends JPanel {
   
    int nivel_de_recursividad = 4;

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        drawSierpinski(g, nivel_de_recursividad, 50, 50, 300, 300);
    }

