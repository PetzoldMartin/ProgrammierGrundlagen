package Hausaufgabe12_Martin_Petzold;

//Die Klasse die einen Karton erzeugt
public class Box {
	private double width;// Die Breite des Kartons
	private double height;// Die Höhe des Kartons
	private double length;// Die Länge des Kartons

	/*
	 * Konstruktor zum erstellen eines Kartons
	 */
	/**
	 * @param width  Die zu Übergebende Breite des Kartons
	 * @param heigth Die zu Übergebende Höhe des Kartons
	 * @param length Die zu Übergebende Länge des Kartons
	 */
	public Box(double width, double heigth, double length) {
		this.width = width;
		this.height = heigth;
		this.length = length;
	}

	/*
	 * Konstruktor zur erstellung eines Würfelförmigen Kartons
	 */
	/**
	 * @param side Die zu Übergebende Seitenlänge des Würfelförmigen Kartons
	 */
	public Box(double side) {
		this.width = this.height = this.length = side;
	}

	/**
	 * @param oldBox Der zu Übergebende Karton
	 */
	public Box(Box oldBox) {
		this.width = oldBox.getWidth();
		this.height = oldBox.getHeight();
		this.length = oldBox.getLength();
	}

	/**
	 * @return die Breite
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @param width die neue Breite
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	/**
	 * @return die Höhe
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height die neue Höhe
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * @return die Länge
	 */
	public double getLength() {
		return length;
	}

	/**
	 * @param length die neue Länge
	 */
	public void setLength(double length) {
		this.length = length;
	}

	/**
	 * @return das errechnete Volumen des Kartons
	 */
	public double calculateVolume() {
		return (width * height * length);
	}

	/**
	 * @return der errechnete Oberflächeninhalt des Kartons
	 */
	public double calculateSurfaceArea() {
		return (2 * (width * height + width * length + height * length));
	}

	/**
	 * @return der um 25% vergrößerte Karton
	 */
	public Box getBiggerBox() {
		Box biggerBox = new Box(this);
		double faktor = 1.25;
		biggerBox.setHeight(this.getHeight() * faktor);
		biggerBox.setLength(this.getLength() * faktor);
		biggerBox.setWidth(this.getWidth() * faktor);
		return biggerBox;
	}

	/**
	 * @param otherbox der Karton in dem dieser Karton Eingesetzt wird
	 * @return true wenn der Karton ungedreht in den anderen hineinpasst
	 */
	public boolean FitsIn(Box otherbox) {
		if (otherbox.getHeight() > this.getHeight()) {
			if (otherbox.getLength() > this.getLength()) {
				if (otherbox.getWidth() > this.getWidth()) {
					return true;
				}
			}
		}
		return false;
	}
}
