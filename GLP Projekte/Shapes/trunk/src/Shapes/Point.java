package Shapes;

/**
 * Ein Punkt in einem 2-dim. Koordinatensystem
 * 
 * @author (Martin Petzold)
 * @version (2.1)
 */
public class Point {
	// instance variables - replace the example below with your own
	private int x;
	private int y;

	/**
	 * Konstruktor für Objekt der Klasse Point
	 * 
	 * @param x
	 *            - x-Koordinate
	 * @param y
	 *            - y-Koordinate
	 */
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Zugriff auf x
	 * 
	 * @return aktuellen Wert fuer x
	 */
	public int getX() {
		return x;
	}

	/**
	 * Zugriff auf y
	 * 
	 * @return aktuellen Wert fuer y
	 */
	public int getY() {
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
	public Point move(int dx, int dy) {
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
		Double X3= X2+center.getX();
		Double Y3= Y2+center.getY();
		this.setX(X3.intValue());
		this.setY(Y3.intValue());
		
		
	}

	private void setX(int x) {
		this.x = x;
	}

	private void setY(int y) {
		this.y = y;
	}
}
