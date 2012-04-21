package Hausaufgabe12_Martin_Petzold;

//Die Klasse die einen Karton erzeugt
public class Box {
	private double width;// Die Breite des Kartons
	private double height;// Die H�he des Kartons
	private double length;// Die L�nge des Kartons

	/*
	 * Konstruktor zum erstellen eines Kartons
	 */
	/**
	 * @param width  Die zu �bergebende Breite des Kartons
	 * @param heigth Die zu �bergebende H�he des Kartons
	 * @param length Die zu �bergebende L�nge des Kartons
	 */
	public Box(double width, double heigth, double length) {
		this.width = width;
		this.height = heigth;
		this.length = length;
	}

	/*
	 * Konstruktor zur erstellung eines W�rfelf�rmigen Kartons
	 */
	/**
	 * @param side Die zu �bergebende Seitenl�nge des W�rfelf�rmigen Kartons
	 */
	public Box(double side) {
		this.width = this.height = this.length = side;
	}

	/**
	 * @param oldBox Der zu �bergebende Karton
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
	 * @return die H�he
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height die neue H�he
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * @return die L�nge
	 */
	public double getLength() {
		return length;
	}

	/**
	 * @param length die neue L�nge
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
	 * @return der errechnete Oberfl�cheninhalt des Kartons
	 */
	public double calculateSurfaceArea() {
		return (2 * (width * height + width * length + height * length));
	}

	/**
	 * @return der um 25% vergr��erte Karton
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
