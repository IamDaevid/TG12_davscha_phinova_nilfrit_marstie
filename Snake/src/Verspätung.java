import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Verspätung {
    public boolean Baustelle;
    public double x;
    public double y;
    Random random = new Random();
    double schritteBreite = 53.333;
    double schritteHoehe = 50;

    Spielfeld spielfeld = new Spielfeld();

    void verspätungErstellen(){
        x = random.nextDouble(spielfeld.breite/schritteBreite) * schritteBreite;
        y = random.nextDouble(spielfeld.hoehe/schritteHoehe) * schritteHoehe;

    }

   /* Verspätung(boolean Baustelle, int x, int y){
        this.Baustelle=Baustelle;
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }*/

}
