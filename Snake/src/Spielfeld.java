import javax.swing.*;
import java.awt.*;

public class Spielfeld extends JFrame {

    public final int breite = 800;
    public final int hoehe = 600;

    public Spielfeld() {
        setTitle("Zug Snake");
        setSize(breite, hoehe);
        setLocationRelativeTo(null); // Fenster mittig anzeigen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Hintergrund-Panel setzen
        setContentPane(new MyPanel());

        setVisible(true);
    }

    // Panel für den Hintergrund
    static class MyPanel extends JPanel {

        private final Image bg;

        public MyPanel() {
            ImageIcon icon = new ImageIcon(
                    MyPanel.class.getResource("background.png")
            );
            bg = icon.getImage();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            if (bg != null) {
                g.drawImage(bg, 100, 100, getWidth(), getHeight(), this);
            } else {
                g.setColor(Color.RED);
                g.drawString("Bild 'background.png' nicht gefunden!", 20, 20);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Spielfeld::new);
    }
}
