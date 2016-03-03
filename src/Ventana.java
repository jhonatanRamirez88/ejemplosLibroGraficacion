
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tonny_jho
 */
public class Ventana extends JFrame{
    public Ventana(){
        super("Prueba de Ventana");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        this.setSize(250,250);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        Ventana v = new Ventana();
    }
    
    
    //ejemplo del cuadro con linea gruesa
//    public void paint(Graphics g){
//        Graphics2D g2 = (Graphics2D)g;
//        Rectangle2D r2 = new Rectangle2D.Float(75, 50, 100, 25);
//        //se pondra mas gruesa la linea del pincel para dibujarlo
//        Stroke pincel = new BasicStroke(4.0f, BasicStroke.CAP_ROUND,BasicStroke.JOIN_MITER);
//        //se pondra mas gruesa la linea del pincel para dibujarlo
//        g2.setStroke(pincel);
//        g2.draw(r2);
//    }
    
    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.red);
        Rectangle2D r1 = new Rectangle2D.Float(250.0f, 50.0f, 100.0f, 100.0f);
        g2.fill(r1);
        AlphaComposite ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER,0.5f);
        g2.setColor(Color.green);
        g2.setComposite(ac);
        Rectangle2D r2 = new Rectangle2D.Float(200.0f, 100.0f, 100.0f, 100.0f);
        g2.fill(r2);
        ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f);
        g2.setColor(Color.magenta);
        g2.setComposite(ac);
        Rectangle2D r3 = new Rectangle2D.Float(150.0f, 150.0f, 100.0f, 100.0f);
        g2.fill(r3);
        ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, .8f);
        g2.setColor(Color.yellow);
        g2.setComposite(ac);
        Rectangle2D r4 = new Rectangle2D.Float(100.0f, 200.0f, 100.0f, 100.0f);
        g2.fill(r4);
    }
    
    
    
}
