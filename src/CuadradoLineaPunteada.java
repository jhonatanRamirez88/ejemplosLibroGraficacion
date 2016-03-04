import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tonny_jho
 */
public class CuadradoLineaPunteada extends JFrame{
    public CuadradoLineaPunteada(){
        super("Prueba de Ventana");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        this.setSize(250,250);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) {
       CuadradoLineaPunteada  v = new CuadradoLineaPunteada();
    }
    
    
    
    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        Rectangle2D r2 = new Rectangle2D.Float(200,150,100,25);
        float punteo1[] = {10.0f,4.0f};
        BasicStroke pincel1 = new BasicStroke(4.0f,BasicStroke.CAP_ROUND,BasicStroke.JOIN_MITER,3.0f,punteo1,10.0f);
        g2.setStroke(pincel1);
        g2.draw(r2);
        
        Rectangle2D r3 = new Rectangle2D.Float(200, 300, 100, 25);
        float punteo2[] = {10.0f,3.0f,10.0f,4.0f,2.0f,8.0f};
        BasicStroke pincel2 = new BasicStroke(4.0f,BasicStroke.CAP_ROUND,BasicStroke.JOIN_MITER,3.0f,punteo2,10.0f);
        g2.setStroke(pincel2);
        g2.draw(r3);
     
    }
}
