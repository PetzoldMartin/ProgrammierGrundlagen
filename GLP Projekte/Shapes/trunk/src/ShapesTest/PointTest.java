/**
 * 
 */
package ShapesTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Shapes.Point;

/**
 * @author Aismael
 *
 */
public class PointTest {

	private Point x;
	private Point y;
	private Point z;
	@Before
	public void setUp() throws Exception {
		x =new Point(1,1);
		y =new Point(1,1);
		z =new Point(1,1);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link Shapes.Point#Point(int, int)}.
	 */
	@Test
	public void testPoint() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link Shapes.Point#move(int, int)}.
	 */
	@Test
	public void testMove() {
		assertTrue("Vortest vor move Fehlgeschlagen",x.equals(z));
		assertEquals("Die X Koordinate wird falsch übergeben",z.getX(), 1);
		assertEquals("Die Y Koordinate wird falsch übergeben",z.getY(), 1);
		z.move(10, 10);
		assertEquals("Die X Koordinate wird falsch verschoben",z.getX(), 11);
		assertEquals("Die Y Koordinate wird falsch verschoben",z.getY(), 11);
		assertEquals("der punkt wird falsch verschoben",z, new Point(11,11));
		assertFalse("Die punkte sind nicht unabhängig",x.equals(z));
		
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
