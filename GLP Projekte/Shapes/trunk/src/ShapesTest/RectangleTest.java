package ShapesTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Shapes.Point;
import Shapes.Rectangle;

public class RectangleTest {
	Rectangle x,y,z;
	ArrayList<Point> A1;
	@Before
	public void setUp() throws Exception {
		x=new Rectangle(new Point(1, 1), 1, 1);
		y=new Rectangle(new Point(1, 1), 1, 1);
		z=new Rectangle(new Point(1, 1), 1, 1);
		A1 = new ArrayList<Point>();
		A1.add(new Point(1,1));
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue("Die equals Methode testet nicht auf Reflexivität",x.equals(x));
		assertTrue("Die equals Methode testet nicht auf Symetrie",x.equals(y)&&y.equals(x));
	}
	@Test
	public void testMove() {
		assertTrue("Vortest vor move Fehlgeschlagen",x.equals(z));
		assertEquals("Das Punkte Arrey wird falsch übergeben",z.getPoints(),A1);
		assertEquals("die X Länge wurde falsch übergeben",z.getLx(), 1.0,0.0);
		assertEquals("die Y Länge wurde falsch übergeben",z.getLy(), 1,0);
		z.move(10, 10);
		ArrayList<Point> A4 =A1;
		for(Iterator <Point> iterator = A4.iterator(); iterator.hasNext();)
        {
            iterator.next().move(10,10);
        }
		assertEquals("Ein Punkt wurde falsch verschoben",z.getPoints(), A4);
		assertEquals("die X Länge ist inkonsistent",z.getLx(), 1,0);
		assertEquals("die Y Länge ist inkonsistent",z.getLy(), 1,0);
		assertFalse("Die Polygone sind nicht unabhängig",x.equals(z));
		
	}

}
