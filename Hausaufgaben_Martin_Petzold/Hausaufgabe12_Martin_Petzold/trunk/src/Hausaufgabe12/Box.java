package Hausaufgabe12;

//Die Klasse die einen Karton erzeugt
public class Box {
	private double width;// Die Breite des Kartons
	private double height;// Die Höhe des Kartons
	private double length;// DIe Länge des Kartons

	/*
	 * Konstruktor zum erstellen eines Kartons
	 */
	public Box(double width, double heigth, double length) {
		this.width = width;
		this.height = heigth;
		this.length = length;
	}

	/*
	 * Konstruktor zur erstellung eines Würfelförmigen Kartons
	 */
	public Box(double side) {
		this.width = this.height = this.length = side;
	}

	public Box(Box oldBox) {
		this.width = oldBox.getWidth();
		this.height = oldBox.getHeight();
		this.length = oldBox.getLength();
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double calculateVolume() {
		return (width * height * length);
	}

	public double calculateSurfaceArea() {
		return (2 * (width * height + width * length + height * length));
	}

	public Box getBiggerBox() {
		Box biggerBox = new Box(this);
		double faktor = 1.25;
		biggerBox.setHeight(this.getHeight() * faktor);
		biggerBox.setLength(this.getLength() * faktor);
		biggerBox.setWidth(this.getWidth() * faktor);
		return biggerBox;
	}

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
