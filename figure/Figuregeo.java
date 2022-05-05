package figure;

import java.awt.*;

public abstract class  Figuregeo {

    private Point centre;


    public Figuregeo() {
        this( new Point( 0, 0 ) );
    }

    public Figuregeo( Point centre ) {
        this.setCentre( centre );
    }



    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
                this.centre = centre;
    }

    public  abstract double perimetre() ;

    public abstract double aire ();

}
