/*import javax.swing.*;
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

   /*
   Verspätung(boolean Baustelle, int x, int y){
        this.Baustelle=Baustelle;
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


}*/
import java.util.Random;
public class Verspätung {
    
    public double x; 
    public double y; 
    private final Random random = new Random();

    private final int breite = 800;
    private final int hoehe = 600;

    private final int feldGroesse = 50;

    public void verspätungErstellen(){

        int maxX = breite / feldGroesse;
        int maxY = hoehe / feldGroesse;

        int feldX = random.nextInt(maxX);
        int feldY = random.nextInt(maxY);

        x = feldX * feldGroesse;
        y = feldY * feldGroesse;

        System.out.println("Verspätung bei: " + x + " / " + y);
    }
}
