import javax.swing.*;
import java.awt.*;

public class Spielfeld extends JFrame {
    public final int breite = 800;
    public final int hoehe = 600;

    Verspätung verspätung = new Verspätung();

    Spielfeld(String string) {
        System.out.println("Hallo");
        JFrame frame = new JFrame();
        frame.setSize(breite, hoehe);
        frame.setTitle("Zug Snake");
        frame.setLocation(400, 300);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //background
        frame.getContentPane().setBackground(Color.RED);
        frame.setContentPane(new MyPanel());
        frame.setVisible(true);

        //Verspätungen spawnen
        verspätung.verspätungErstellen();

    }


    protected void paintCombonent(Graphics graphics){
        graphics.setColor(Color.BLUE);
        graphics.fillOval((int) verspätung.x, (int) verspätung.y, breite, hoehe);
    }


    //background
    public class MyPanel extends JPanel {

        Image bg = new ImageIcon("/images/background.png").getImage();

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
        }
    }



    Spielfeld() {

    }


}

