package Shapes;


/**
 * Abstrakte Klasse, die ein Objekt auf einer Zeichenfläche zeichnet und bewegt
 * 
 * @author (Martin petzold)
 * @version (2.1)
 */
public abstract class Drawable
{
    public Drawable()
    {
        
    }
    /**
    * zeichnet ein Objekt auf der Zeichenfläche
    */
    public abstract void draw();
    /**
    * bewegt ein Objekt auf der Zeichenfläche um dx in Richtung x-Achse
    * und um dy in Richtung y-Achse
    * @param dx - distanz in x
    * @param dy - distanz in y
    * 
    */
    public abstract Drawable move (int dx, int dy);
    public abstract Drawable rotate(Point center, double phi);
}
