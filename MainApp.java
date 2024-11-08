
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

    private void drawSierpinski(Graphics g, int nivel, int x, int y, int width, int height) {
        if (nivel == 0) {
          
            g.fillRect(x, y, width, height);
        } else {
         
            int newWidth = width / 3;
            int newHeight = height / 3;

           
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                   
                    if (i == 1 && j == 1) {
                        continue;
                    }
                   
                    drawSierpinski(g, nivel - 1, x + i * newWidth, y + j * newHeight, newWidth, newHeight);
                }
            }
        }
    }

   
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Tapete de Sierpinski");
        MainApp panel = new MainApp();

        
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel); 
        frame.setVisible(true); 
    }
}
