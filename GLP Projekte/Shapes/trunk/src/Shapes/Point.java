package Shapes;


/**
 * Ein Punkt in einem 2-dim. Koordinatensystem
 * 
 * @author (Martin Petzold) 
 * @version (2.1)
 */
public class Point
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;

    /**
     * Konstruktor für Objekt der Klasse Point
     * @param x - x-Koordinate
     * @param y - y-Koordinate
     */
    public Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    /**
     * Zugriff auf x
     * @return aktuellen Wert fuer x
     */
    public int getX()
    {
        return x;
    }
     /**
     * Zugriff auf y
     * @return aktuellen Wert fuer y
     */
    public int getY()
    {
        return y;
    }
    /**
     * bewege den Punkt um dx, dy
     * @param dx - Distanz in x
     * @param dy - Distanz in y
     * @return den Punkt
     */
    public Point move(int dx, int dy)
    {
        this.x=this.x+dx;
        this.y=this.y+dy;
        return this;
    }
    public Point copy()
    {
    	Point CPoint = new Point(this.x,this.y);
    	return CPoint;
    }
    
    public boolean equals(Point VPoint)
    {
    	if (VPoint.getX()==this.getX()&&VPoint.getY()==this.getY())
    	{
    		return true;
    	}
    	else return false;
    }
}
