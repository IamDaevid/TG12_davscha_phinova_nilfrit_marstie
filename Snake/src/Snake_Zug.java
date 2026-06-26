import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;

public class Snake_Zug {
    private int anzKoerperZellen; //Körperzellen der Snake
    private int speed;//Schnelligkeit der Snake
    private int size;
    //create Integer ArrayList
    private ArrayList<Zelle> zelle = new ArrayList<>();
    Zelle kopf = zelle.get(0);
    //Steuering
    Steuerung steuerung = new Steuerung();

    Snake_Zug(int speed, int anzKoerperZellen) { //Konstruktor
        this.speed = speed;
        this.anzKoerperZellen = anzKoerperZellen;
        for(int i = 0; i < 3; i++) zelle.add(new Zelle(50 - i, 50 - i));
    }

    void laufen(Steuerung steuerung) {
        for (Zelle value : zelle) {
            value.setPreviousX(value.getX());
            value.setPreviousY(value.getY());
        }

        switch(steuerung.getRichtung()){
            case KeyEvent.VK_LEFT:
                for(int i = 0; i < zelle.size() - 1; i++){

                }
                break;

            case KeyEvent.VK_RIGHT:
                // nach rechts bewegen
                break;

            case KeyEvent.VK_UP:
                // nach oben bewegen
                break;

            case KeyEvent.VK_DOWN:
                // nach unten bewegen
                break;
        }
    }

    public void addBodyPart() {
        zelle.add(new Zelle(zelle.getLast().getPreviousX(), zelle.getLast().getPreviousY()));
    }

    public void resetBodyParts(){
        if (zelle.size() >= 4) zelle.subList(3, zelle.size()).clear();
    }
}
