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
	private Double cx;
	private Double cy;

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
	public Rectangle(Point bottomLeft, int lx, int ly) {
		this.lx = lx;
		this.ly = ly;
		this.points.add(new Point(bottomLeft.getX(), bottomLeft.getY()));
		cx = (double) (points.get(0).getX() + lx / 2);
		cy = (double) (points.get(0).getY() + ly / 2);
		this.points.add(new Point(cx.intValue(), cy.intValue()));
	}

	/**
	 * zeichnet das Rechteck auf dem Whiteboard
	 */
	public void draw() {
		super.getWhiteBoard().removeShape(representation);
		// double cx = points.get(0).getX() + lx / 2;
		// double cy = points.get(0).getY() + ly / 2;
		representation = getWhiteBoard().drawRectangle(
				this.points.get(1).getX(), this.points.get(1).getY(), lx / 2,
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
		// Double X=this.getLx();
		// Double Y=this.getLy();
		// Iterator<Point> it2 = points.iterator();
		// while (it2.hasNext()) {
		// it2.next().move(-X.intValue()/4,-Y.intValue()/4);
		// }
		// Double X=points.get(0).getX() + lx / 2;
		// Double Y=points.get(0).getY() + ly / 2;
		// Point Berechnung = new Point (X.intValue(),Y.intValue());
		// Berechnung.rotate(new Point(1+X.intValue(),1+Y.intValue()), phi);
		// this.setLx(Berechnung.getX());
		// this.setLy(Berechnung.getY());

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
