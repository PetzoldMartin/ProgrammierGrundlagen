package Shapes;

import ShapeExceptions.PolygoneShapeException;

public class ShapesMain {

	/**
	 * @param args
	 * @throws PolygoneShapeException 
	 */
	public static void main(String[] args) throws PolygoneShapeException {
		Rectangle  a2 = new Rectangle(new Point(-250,-250), 600, 600);
		a2.setSolid(false);
		a2.draw();
//		Rectangle  a1 = new Rectangle(new Point(1,1), 100, 200);
//		a1.rotate(new Point(0,0),90);
//		a1.setSolid(true);
//		a1.draw();
		Point p1 = new Point(0,100);
		long millisToWaitx = 1000;
		long millisx = System.currentTimeMillis();
		while ((System.currentTimeMillis() - millisx) < millisToWaitx) {
		}
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
		Schneemann.rotate(p1, 45);
		Schneemann.draw();
		long millisToWait3 = 1000;
		long millis3 = System.currentTimeMillis();
		while ((System.currentTimeMillis() - millis3) < millisToWait3) {
		}
		Schneemann.rotate(p1, 45);
		Schneemann.draw();
		long millisToWait4 = 1000;
		long millis4 = System.currentTimeMillis();
		while ((System.currentTimeMillis() - millis4) < millisToWait4) {
		}
		Schneemann.rotate(p1, 45);
		Schneemann.draw();
		long millisToWait5 = 1000;
		long millis5 = System.currentTimeMillis();
		while ((System.currentTimeMillis() - millis5) < millisToWait5) {
		}
		Schneemann.rotate(p1, 45);
		Schneemann.draw();
		
		long millisToWait6 = 1000;
		long millis6 = System.currentTimeMillis();
		while ((System.currentTimeMillis() - millis6) < millisToWait6) {
		}
		Schneemann.rotate(p1, 180);
		Schneemann.draw();
		for(int i=1;i<=360*10;i++)
		{
			long millisToWait7 = 10;
			long millis7 = System.currentTimeMillis();
			while ((System.currentTimeMillis() - millis7) < millisToWait7) {
			}
			Schneemann.rotate(p1, 1).draw();
		}
		
//		Schneemann.draw();
	}
	

}
