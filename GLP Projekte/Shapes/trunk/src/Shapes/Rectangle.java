package Shapes;


/**
 * Klasse Rechteck, mit Verankerungspunkt topLeft und Länge und Breite
 * 
 * @author (Martin Petzold) 
 * @version (2.1)
 */
public class Rectangle extends Polygon
{
    
    private double lx;
    private double ly;
    /**
     * Konstruktor fuer Objekte der class Rectangle 
     * erzeugt ein achsenparalleles Rechteck
     * @param bottomLeft - linker unterer Eckpunkt
     * @param lx - Länge der Seiten in Richtung x-Achse
     * @param ly - Länge der Seiten in Richtung y-Achse
     */
    public Rectangle(Point bottomLeft, int lx, int ly)
    {
       this.lx=lx;
       this.ly=ly;
       this.points.add(new Point(bottomLeft.getX(),bottomLeft.getY()));
    }
    /**
     * zeichnet das Rechteck auf dem Whiteboard
     */
    public void draw()
    {
        super.getWhiteBoard().removeShape(representation);
        double cx = points.get(0).getX()+lx/2;
        double cy = points.get(0).getY()+ly/2;
        representation = getWhiteBoard().drawRectangle(cx ,cy ,lx/2 , ly/2 ,
                                                           getColor() ,isSolid(), 0);
    }
    public boolean equals(Rectangle obj) {
		if (obj instanceof Rectangle) {
			Rectangle VRectangele = (Rectangle) obj;

			if (VRectangele.getColor() == this.getColor()&&VRectangele.getPoints().equals(this.getPoints())) {
				return true;
			} else
				return false;
		} else
			return false;
	}
	public double getLx() {
		return lx;
	}
	public double getLy() {
		return ly;
	}

   
}
