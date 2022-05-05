package figure;

import java.awt.*;
import java.util.Scanner;

public class Carre extends Figuregeo {

    private double cote;
    private double p;
    private double s;
    Scanner sc = new Scanner(System.in);


    public Carre() {
        super();
        this.setCote(1);
    }

    public Carre(Point center, double cote ) {
        super( center );
        this.setCote( cote );
    }

    public double getCote() {
        return cote = sc.nextDouble();
    }

    public void setCote(double cote) {
        this.cote = cote;
    }

    @Override
    public double perimetre() {
        return  p = this.cote * 4 ;
    }

    @Override
    public double aire() {
        return s= this.cote * this.cote;
    }

    @Override
    public String toString() {
       return  " le périmètre du carré est " +p + " et sa surface est " + s;
    }

    //    @Override
//    public void draw() {
//        System.out.println( "Un carré positionné en " + this.getCenter() + " et de longueur " + this.length );
//    }

}
