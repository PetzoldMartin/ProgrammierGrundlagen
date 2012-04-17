package Shapes;

public class ShapesMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Figure Schneemann = Figure.snowMan();
		Schneemann.draw();
		Schneemann.draw();
		long millisToWait = 1000;
		long millis = System.currentTimeMillis();
		while ((System.currentTimeMillis() - millis) < millisToWait) {
		}
		Schneemann.move(100, 100);
		Schneemann.draw();

	}

}
