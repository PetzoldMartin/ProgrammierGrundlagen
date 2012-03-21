package Shapes;
import java.util.*;



/**
 * Basisklasse für Polygone, die die Eckpunkte verwaltet
 * 
 * @author (Martin Petzold) 
 * @version (2.1)
 */
public class Polygon extends Shape
{
    protected ArrayList<Point> points=new ArrayList<Point>();
    private double turn=0;
     /**
     * Konstruktor der Klasse Polygon.
     */
    public Polygon()
    {
       
    }
    /**
     * zeichnet das Polygon auf das Whiteboard
     */
    public void draw()
    {
        int i=0;
        getWhiteBoard().removeShape(representation);
        double[] x = new double[points.size()]; 
        double[] y = new double[points.size()];
        for(Point point:points)
        {
            x[i]=point.getX();
            y[i]=point.getY();
            i++;
        }
        representation = getWhiteBoard().drawPolygon(x,y,getColor(),isSolid(),turn);
        
    }
    /**
     * Zugriff auf die Punkte der Form
     * @returns points - nicht veraenderbare Liste der Punkte
     */
    public ArrayList<Point> getPoints()
    {
        return points;
    }
    /**
     * bewege das Polygon um dx, dy
     * @param dx - Distanz in x
     * @param dy - Distanz in y
     * @return das Polygon
     */
    public Polygon move(int dx, int dy)
    {
        Iterator<Point> it = points.iterator();
        while(it.hasNext())
        {
            it.next().move(dx,dy);  
        }
        draw();
      return this;  
    }
    
    /**
     * setze die Eckpunkte des Polygons
     * @param p liste der Punkte
     */
    public void setPoints(ArrayList<Point> p)
    {
        points=p;
    }
    /**
     * setze den wert um den das polygon gedreht wird
     * @param turn  die Drehung in Bogenmass
     */
    public void setTurn(double turn)
    {
        this.turn=turn;
    }
}
