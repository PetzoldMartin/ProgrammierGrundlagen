package ShapesTest;

import static org.junit.Assert.*;

import Shapes.Point;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PointTest2 {

	private Point p1;
	private Point p2;
	@Before
	public void setUp() throws Exception {
		p1 =new Point(1,1);
		p2 =new Point(1,1);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testequals() {
		assertTrue("Die equals Methode ist Fehlerhaft",p1.equals(p2));
	}

}
