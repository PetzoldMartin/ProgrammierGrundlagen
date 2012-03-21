package Shapes;
import teaching.*;
import java.awt.Color;



/**
 * Abstrakte Klasse, die die Zeichenfläche beinhaltet und verwaltet. 
 * @author (Martin Petzold) 
 * @version (2.1)
 */

public abstract class Shape extends Drawable
{
    protected Object representation;
    protected Color color=Color.BLACK;//  Farbe
    protected static WhiteBoard whiteBoard=new WhiteBoard();//Zeichenfläche
    protected boolean solid=false;//Status der Ausfüllung
    
    public Shape()
    {
    }
    /**
     * welche Farbe wird derzeit benutzt
     * @return die Farbe
     */
    public Color getColor()
    {
        return color;
    }
    /**
     * Methode, die die Zeichenfläche zurückgibt
     * @return die Zeichenfläche
     */
    public WhiteBoard getWhiteBoard()
    {
        return whiteBoard;
    }
    /**
     * Gibt an, ob Fläche ausgefüllt wird 
     * @return der Status der Ausfüllung
     */
    public boolean isSolid()
    {
        return solid;
    }
    /**
     * Setzte farbe
     * @param color - die Farbe die Gesetzt werden soll
     */
    public void setColor(Color color)
    {
        this.color=color;
    }
    /**
     * Default-Wert ist false. 
     * Wenn Fläche ausgefüllt werden soll, dann true setzen.
     * @param solid - der Status der Ausfüllung
     */
    public void setSolid(boolean solid)
    {
        this.solid=solid;
    }
}
