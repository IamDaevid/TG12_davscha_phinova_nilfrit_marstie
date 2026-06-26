import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Steuerung extends KeyAdapter {

    private int richtung = KeyEvent.VK_RIGHT; // Start nach rechts

    @Override
    public void keyPressed(KeyEvent e) {
        richtung = e.getKeyCode();
    }

    public int getRichtung() {
        return richtung;
    }
}