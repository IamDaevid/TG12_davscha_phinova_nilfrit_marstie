ArrayList<Zelle> zelle = new ArrayList<Zelle>();
PImage bild;
 
float x = 100;
float y = 300;
float speed = 5;
 
void setup(){
  size(800, 600);
  bild = loadImage("backround snake.png");  // Bild laden
  zelle.add(new Zelle(50, 50));
  zelle.add(new Zelle(51, 50));
  zelle.add(new Zelle(52, 50));
}

void draw(){
}

void loop(){
  Steuerung.updateKey();
    //background
  background(200);
  image(bild, 1, 1, 800, 600); // Bild anzeigen
  //spieler
   fill(255, 0, 0);
  rect(x, y, 25, 15);
  //steuerung
  if (keyPressed) {
    if (keyCode == LEFT)  x -= speed;
    if (keyCode == RIGHT) x += speed;
    if (keyCode == UP)    y -= speed;
    if (keyCode == DOWN)  y += speed;
  }
}

class Zelle{
    private int x;
    private int y;
    private int previousX;
    private int previousY;

    Zelle(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getPreviousX() {
        return previousX;
    }

    public void setPreviousX(int previousX) {
        this.previousX = previousX;
    }

    public int getPreviousY() {
        return previousY;
    }

    public void setPreviousY(int previousY) {
        this.previousY = previousY;
    }
}

class Steuerung{
  static private int knopfGedrueckt = keyCode;
  
  static public void updateKey(){
     knopfGedrueckt = keyCode; 
  }
  
  static public int getKey(){
    return knopfGedrueckt;
}
