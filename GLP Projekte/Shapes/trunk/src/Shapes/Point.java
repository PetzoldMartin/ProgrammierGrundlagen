package Shapes;

/**
 * Ein Punkt in einem 2-dim. Koordinatensystem
 * 
 * @author (Martin Petzold)
 * @version (2.1)
 */
public class Point {
	// instance variables - replace the example below with your own
	private double x;
	private double y;

	/**
	 * Konstruktor für Objekt der Klasse Point
	 * 
	 * @param x
	 *            - x-Koordinate
	 * @param y
	 *            - y-Koordinate
	 */
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Zugriff auf x
	 * 
	 * @return aktuellen Wert fuer x
	 */
	public double getX() {
		return x;
	}

	/**
	 * Zugriff auf y
	 * 
	 * @return aktuellen Wert fuer y
	 */
	public double getY() {
		return y;
	}

	/**
	 * bewege den Punkt um dx, dy
	 * 
	 * @param dx
	 *            - Distanz in x
	 * @param dy
	 *            - Distanz in y
	 * @return den Punkt
	 */
	public Point move(double dx, double dy) {
		this.x = this.x + dx;
		this.y = this.y + dy;
		return this;
	}

	public Point copy() {
		Point CPoint = new Point(this.x, this.y);
		return CPoint;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			Point VPoint = (Point) obj;

			if (VPoint.getX() == this.getX() && VPoint.getY() == this.getY()) {
				return true;
			} else
				return false;
		} else
			return false;
	}
	public void rotate(Point center, double phi)
	{
		double X= this.getX();
		double Y= this.getY();
		double X1 = X-center.getX();
		double Y1 = Y-center.getY();
		double X2 = (X1*Math.cos(Math.toRadians(phi)))+(Y1*Math.sin(Math.toRadians(phi)));
		double Y2 = (-X1*Math.sin(Math.toRadians(phi)))+(Y1*Math.cos(Math.toRadians(phi)));
		double X3= X2+center.getX();
		double Y3= Y2+center.getY();
		this.setX(X3);
		this.setY(Y3);
		
		
	}

	private void setX(double x) {
		this.x = x;
	}

	private void setY(double y) {
		this.y = y;
	}
}
