package Shapes;
import java.util.*;

import ShapeExceptions.PolygoneShapeException;



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
    public Polygon move(double dx, double dy)
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
    public void setPoints(ArrayList<Point> p) throws PolygoneShapeException
    {
    	if(p.size()<=2)
    	{
    		throw new PolygoneShapeException("Ein Polygon muss mindestens aus drei Punkten bestehen");
    	}
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
    public boolean equals(Polygon obj) {
		if (obj instanceof Polygon) {
			Polygon VPolygon = (Polygon) obj;

			if (VPolygon.getColor() == this.getColor()&&VPolygon.getPoints().equals(this.getPoints())) {
				return true;
			} else
				return false;
		} else
			return false;
	}
    @Override
	public Drawable rotate(Point center, double phi) {
    	Iterator<Point> it = points.iterator();
        while(it.hasNext())
        {
            it.next().rotate(center, phi);  
        }
        draw();
        return this;
		
		
	}
}
