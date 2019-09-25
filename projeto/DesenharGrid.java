/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author cesar
 */
public class DesenharGrid extends JFrame{
 
    
    public DesenharGrid(){
        this.setSize(800, 600);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        
        Board board = new Board();
        this.setContentPane(board);
     
        Mover mover = new Mover();
        this.addMouseMotionListener(mover);

        Click click = new Click();
        this.addMouseListener(click);
        
    }
    
    public class Board extends JPanel{
        public void paintComponent(Graphics g){
            g.setColor(Color.GRAY);
            g.fillRect(0, 0, 800, 600);
            g.setColor(Color.YELLOW);
            //x y comprimento largura
            
            for (int i = 100; i <= 400; i+=100) {
                g.drawRect(100, i, 100, 100);
                g.drawRect(100, i, 100, 100);
                g.drawRect(100, i, 100, 100);
                g.drawRect(100, i, 100, 100);
            }
            
            g.setColor(Color.YELLOW);
            for (int i = 100; i <= 400; i+=100) {
                g.drawRect(200, i, 100, 100);
                g.drawRect(200, i, 100, 100);
                g.drawRect(200, i, 100, 100);
                g.drawRect(200, i, 100, 100);
            }
            g.setColor(Color.YELLOW);
            for (int i = 100; i <= 400; i+=100) {
                g.drawRect(300, i, 100, 100);
                g.drawRect(300, i, 100, 100);
                g.drawRect(300, i, 100, 100);
                g.drawRect(300, i, 100, 100);
            }
            g.setColor(Color.YELLOW);
            for (int i = 100; i <= 400; i+=100) {    
                g.drawRect(400, i, 100, 100);
                g.drawRect(400, i, 100, 100);
                g.drawRect(400, i, 100, 100);
                g.drawRect(400, i, 100, 100);
            }
            
             
        }
    }
    
    public class Mover implements java.awt.event.MouseMotionListener{

        @Override
        public void mouseDragged(MouseEvent me) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseMoved(MouseEvent me) {
            System.out.println("Mouse moved");
        }
    
    }
    
    public class Click implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent me) {
            System.out.println("Mouse clicked");

        }

        @Override
        public void mousePressed(MouseEvent me) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseReleased(MouseEvent me) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseEntered(MouseEvent me) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseExited(MouseEvent me) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
    
}
