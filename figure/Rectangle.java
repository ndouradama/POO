package figure;

import java.awt.*;
import java.util.Scanner;

public class Rectangle extends Figuregeo {
    private double lon;
    private double lar;
    private double p;
    private double s;
    Scanner sc = new Scanner(System.in);

    public Rectangle() {
        super();
        this.setLar(1);
        this.setLon(1);
    }

    public Rectangle(Point centre, double lon, double lar) {
        super(centre);
        this.setLon(lon);
        this.setLar(lar);
    }

    public double getLon() {
        return lon = sc.nextDouble();
    }
    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLar() {
        return lar=sc.nextDouble();
    }

    public void setLar(double lar) {
        this.lar = lar;
    }

    @Override
    public double perimetre() {
        return p= 2 * ( lar + lon);
    }

    @Override
    public double aire() {
        return s= lar * lon;
    }

    @Override
    public String toString() {
        return "Un rectangle positionné en " + this.getCentre() +  "a pour périmètre " +p + " et pour surface  " + s;
    }
}
