package Shapes;
import java.awt.Color;

/**
 * Klasse Kreis, definiert über Mittelpunkt und Radius
 * 
 * @author (Martin Petzold) 
 * @version (2.1)
 */
public class Circle extends Shape
{
    private Point center;
    private int radius;
    /** Konstruktor für Objekte der Klasse Circle
     * @param center - Mittelpunkt des Kreises
     * @param radius - Radius des Kreises
     */
    public Circle(int radius, Point center)
    {
     this.center=center;
     this.radius=radius;
    }
    /**
     * zeichnet den Kreis auf der Zeichenfläche
     */
    public void draw()
    {
        if(isSolid() == true)
       {
        draw(getColor(), isSolid());
        
        }
       else
       {
           getWhiteBoard().removeShape(representation);
        representation = getWhiteBoard().drawCircle(center.getX(),center.getY(),radius);
       }
    
    }
    /**
     * zeichnet den Kreis farbig ggf. ausgefüllt auf der Zeichenfläche
     * @param color - Farbe
     * @param solid - wenn true, dann wird die Fläche farbig ausgefüllt
     */
    public void draw(Color color, boolean solid)
    {
        super.getWhiteBoard().removeShape(representation);
        representation = getWhiteBoard().drawCircle(center.getX(),center.getY(),radius,color,solid);
    }
    /**
     * bewege den Kreis um dx, dy
     * @param dx - distanz in x
     * @param dy - distanz in y
     * @return the circle
     */
    public Drawable move(int dx,int dy)
    {
        center.move(dx,dy);
        draw();
        return this;
    }
	public Point getCenter() {
		return center;
	}
	public int getRadius() {
		return radius;
	}
	
	
	public boolean equals(Object obj) {
		if (obj instanceof Circle) {
			Circle VCircle = (Circle) obj;

			Point point1 =VCircle.getCenter();
			Point point2 =this.getCenter();
			if (point1.equals(point2)&& VCircle.getRadius() == this.getRadius()&&VCircle.getColor() == this.getColor()) {
				return true;
			} else
				return false;
		} else
			return false;
	}
	@Override
	public Drawable rotate(Point center, double phi) {
		this.center.rotate(center, phi);
		draw();
		return this;
	}
}
