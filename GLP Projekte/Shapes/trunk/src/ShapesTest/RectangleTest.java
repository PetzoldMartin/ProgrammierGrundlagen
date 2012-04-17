package ShapesTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Shapes.Point;
import Shapes.Rectangle;

public class RectangleTest {
	Rectangle x,y;
	@Before
	public void setUp() throws Exception {
		x=new Rectangle(new Point(1, 1), 1, 1);
		y=new Rectangle(new Point(1, 1), 1, 1);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue("Die equals Methode testet nicht auf Reflexivität",x.equals(x));
		assertTrue("Die equals Methode testet nicht auf Symetrie",x.equals(y)&&y.equals(x));
	}

}
