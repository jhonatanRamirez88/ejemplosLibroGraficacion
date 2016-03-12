
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
public class ClippingPath extends JFrame{    
    public ClippingPath(){
        super("Ejemplo de Clipping Path");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        this.setSize(250,250);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        ClippingPath v = new ClippingPath();
    }
    
   
   //ejemplo de clipping path 
    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        //primera parte del ejemplo
        int ancho = this.getSize().width;
        int largo = this.getSize().height;
        Ellipse2D e = new Ellipse2D.Float(ancho/4.0f, largo/4.0f, ancho/2.0f, largo/2.0f);
        g2.setClip(e);
        g2.setColor(Color.cyan);
        g2.fill(new Rectangle2D.Float(0.0f, 0.0f, ancho, largo));
        
        //segunda parte del ejemplo
        
        Rectangle2D r2 = new Rectangle2D.Float(ancho/4.0f+10.0f, largo/4.0f+10.0f, ancho/2.0f-20.0f, largo/2.0f-20.f);
        g2.clip(r2);
        g2.setColor(Color.white);
        g2.fill(new Rectangle2D.Float(0.0f, 0.0f, ancho, largo));
        
    }
    
    
    
}
