package Shapes;

import java.util.Iterator;

/**
 * Klasse Rechteck, mit Verankerungspunkt topLeft und Länge und Breite
 * 
 * @author (Martin Petzold)
 * @version (2.1)
 */
public class Rectangle extends Polygon {

	private double lx;
	private double ly;
	private double phiGlobal = 0;
	private double cx;
	private double cy;

	/**
	 * Konstruktor fuer Objekte der class Rectangle erzeugt ein achsenparalleles
	 * Rechteck
	 * 
	 * @param bottomLeft
	 *            - linker unterer Eckpunkt
	 * @param lx
	 *            - Länge der Seiten in Richtung x-Achse
	 * @param ly
	 *            - Länge der Seiten in Richtung y-Achse
	 */
	public Rectangle(Point bottomLeft, double lx, double ly) {
		this.lx = lx;
		this.ly = ly;
	//	this.points.add(new Point(bottomLeft.getX(), bottomLeft.getY()));
		cx =  (bottomLeft.getX() + lx / 2);
		cy =  (bottomLeft.getY() + ly / 2);
		this.points.add(new Point(cx, cy));
	}

	/**
	 * zeichnet das Rechteck auf dem Whiteboard
	 */
	public void draw() {
		super.getWhiteBoard().removeShape(representation);
		// double cx = points.get(0).getX() + lx / 2;
		// double cy = points.get(0).getY() + ly / 2;
		representation = getWhiteBoard().drawRectangle(
				this.points.get(0).getX(), this.points.get(0).getY(), lx / 2,
				ly / 2, getColor(), isSolid(), this.getPhiGlobal());
	}

	public boolean equals(Rectangle obj) {
		if (obj instanceof Rectangle) {
			Rectangle VRectangele = (Rectangle) obj;

			if (VRectangele.getColor() == this.getColor()
					&& VRectangele.getPoints().equals(this.getPoints())) {
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

	public Drawable rotate(Point center, double phi) {
		 Iterator<Point> it = points.iterator();
		 while (it.hasNext()) {
		 it.next().rotate(center, phi);
		 }
		this.setPhiGlobal(this.getPhiGlobal() + (-Math.toRadians(phi)));
		this.draw();
		return this;

	}

	private double getPhiGlobal() {
		return phiGlobal;
	}

	private void setPhiGlobal(double phiGlobal) {
		this.phiGlobal = phiGlobal;
	}

}
