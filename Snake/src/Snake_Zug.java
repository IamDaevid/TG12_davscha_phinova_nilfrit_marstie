import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;

public class Snake_Zug {
    private int anzKoerperZellen; //Körperzellen der Snake
    private int speed;//Schnelligkeit der Snake
    private int size;
    private int width;
    private int height;
    //create Integer ArrayList
    ArrayList<Zelle> zelle = new ArrayList<>();

    Snake_Zug(int speed, int anzKoerperZellen, int i) { //Konstruktor
        this.speed = speed;
        this.anzKoerperZellen = anzKoerperZellen;
    }

    void laufen() {
        for (Zelle value : zelle) {
            value.setPreviousX(value.getX());
            value.setPreviousY(value.getY());
        }
    }

    public boolean addBodyPart() {

        zelle.add(new Zelle(zelle.getLast().getPreviousX(), zelle.getLast().getPreviousY()));
        return true;
    }



}
