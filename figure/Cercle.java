package figure;

import java.awt.*;
import java.util.Scanner;

public class Cercle extends Figuregeo {
    private double rayon;
    private double p;
    private double s;
    Scanner sc = new Scanner(System.in);

    public Cercle() {
        super();
        this.setRayon(1);
    }

    public Cercle(Point centre, double rayon) {
        super( centre );
        this.setRayon(rayon);
    }


    public double getRayon() {
        return rayon = sc.nextDouble();
    }

    public void setRayon(double rayon) {
        this.rayon = Math.abs( rayon );

    }
    @Override
    public double perimetre() {
        return p = 2 * rayon * Math.PI;
    }


    @Override
    public double aire() {
        //return Math.PI * this.radius * this.radius;			 // πr²
        return s = Math.PI * Math.pow( this.rayon, 2 );
    }

    @Override
    public String toString() {
        return  " le périmètre du cercle est  " +p + " et sa surface est  " + s;
    }
}
