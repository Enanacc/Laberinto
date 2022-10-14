
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author VANIA
 */
public class juego extends JPanel{
    
    laberinto laberinto=new laberinto();
    Personaje personaje=new Personaje();
    
    public juego(){
        addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                personaje.teclaPresionada(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        });
        setFocusable(true);
    }
    
    @Override
    public void paint(Graphics grafico){
        laberinto.paint(grafico);
        personaje.paint(grafico);
    }
    public static void main(String[] args) {
        JFrame miventana= new JFrame("Mi primer laberinto");
        juego game= new juego();
        miventana.add(game);
        
        miventana.setSize(920,540);
        miventana.setLocation(300,200);
        miventana.setVisible(true);
        
        miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        while(true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(juego.class.getName()).log(Level.SEVERE, null, ex);
            }
            game.repaint();
        }
    
    }

}
