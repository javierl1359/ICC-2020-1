  package ajedrez;

import processing.core.PApplet;

public class Chess extends PApplet {

    public static void main(String[] args) {
        PApplet.main(Chess.class.getName());
    }

    @Override
    public void settings() {
        size(800, 800);
    }

    @Override
    public void setup() {

    }



   @Override
  public void draw() {
      for (int i = 0; i < 8; i ++) {
      for (int j = 0; j < 8; j ++) {
        if ((i + j + 1) % 2 == 0) {
          fill(255, 255, 255);
    }
        else {
           fill(0, 0, 0);
    }
      rect(i * 100, j * 100, (i + 1) * 100, (j + 1) * 100);
     }
    }
   }
 }
