package Shapes;

public class ShapesMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Rectangle  a2 = new Rectangle(new Point(1,1), 100, 200);
//		a2.setSolid(true);
//		a2.draw();
//		Rectangle  a1 = new Rectangle(new Point(1,1), 100, 200);
//		a1.rotate(new Point(0,0),90);
//		a1.setSolid(true);
//		a1.draw();
		
		Figure Schneemann = Figure.snowMan();
		Schneemann.draw();
		long millisToWait = 200;
		long millis = System.currentTimeMillis();
		while ((System.currentTimeMillis() - millis) < millisToWait) {
		}
		Schneemann.move(100, 100);
		Schneemann.draw();
		long millisToWait2 = 1000;
		long millis2 = System.currentTimeMillis();
		while ((System.currentTimeMillis() - millis2) < millisToWait2) {
		}
		Schneemann.rotate(new Point(20, 20), 45);
		Schneemann.draw();
		long millisToWait3 = 1000;
		long millis3 = System.currentTimeMillis();
		while ((System.currentTimeMillis() - millis3) < millisToWait3) {
		}
		Schneemann.rotate(new Point(20, 20), 45);
		Schneemann.draw();
		long millisToWait4 = 1000;
		long millis4 = System.currentTimeMillis();
		while ((System.currentTimeMillis() - millis4) < millisToWait4) {
		}
		Schneemann.rotate(new Point(20, 20), 45);
		Schneemann.draw();
		long millisToWait5 = 1000;
		long millis5 = System.currentTimeMillis();
		while ((System.currentTimeMillis() - millis5) < millisToWait5) {
		}
		Schneemann.rotate(new Point(20, 20), 45);
		Schneemann.draw();
		
		long millisToWait6 = 1000;
		long millis6 = System.currentTimeMillis();
		while ((System.currentTimeMillis() - millis6) < millisToWait6) {
		}
		Schneemann.rotate(new Point(20, 20), 180);
		Schneemann.draw();
	}

}
