package ShapesTest;

import static org.junit.Assert.*;

import Shapes.Point;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PointTest2 {

	private Point x;
	private Point y;
	private Point z;
	@Before
	public void setUp() throws Exception {
		x =new Point(1,1);
		y =new Point(1,1);
		z =new Point(1,1);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testequals() {
		assertTrue("Die equals Methode testet nicht auf Reflexivität",x.equals(x));
		assertTrue("Die equals Methode testet nicht auf Symetrie",x.equals(y)&&y.equals(x));
		assertTrue("Die equals Methode testet nicht auf Transitivität",x.equals(y)&&y.equals(z)&&x.equals(z));
		y = new Point (2,2);
		assertFalse("Die equals Methode testet nicht auf Konsistenz",x.equals(y));
		assertFalse(x.equals(null));
	}

}
