package ShapesTest;

import static org.junit.Assert.*;

import java.awt.Color;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Shapes.Point;
import Shapes.Polygon;

public class PolygonTest {
	Polygon P1, P2, P3;

	@Before
	public void setUp() throws Exception {
		P1 = new Polygon();
		ArrayList<Point> A1 = new ArrayList<Point>();
		A1.add(new Point(20, -35));
		A1.add(new Point(20, -45));
		A1.add(new Point(40, -30));
		A1.add(new Point(40, -20));
		P1.setPoints(A1);
		P1.setSolid(true);
		P1.setColor(Color.RED);

		P2 = new Polygon();
		ArrayList<Point> A2 = new ArrayList<Point>();
		A2.add(new Point(20, -35));
		A2.add(new Point(20, -45));
		A2.add(new Point(40, -30));
		A2.add(new Point(40, -20));
		P2.setPoints(A2);
		P2.setSolid(true);
		P2.setColor(Color.RED);

		P3 = new Polygon();
		ArrayList<Point> A3 = new ArrayList<Point>();
		A3.add(new Point(20, -35));
		A3.add(new Point(20, -45));
		A3.add(new Point(40, -30));
		A3.add(new Point(40, -20));
		P3.setPoints(A3);
		P3.setSolid(true);
		P3.setColor(Color.RED);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDraw() {
		fail("Not yet implemented");
	}

	@Test
	public void testPolygon() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPoints() {
		fail("Not yet implemented");
	}

	@Test
	public void testMoveIntInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetPoints() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetTurn() {
		fail("Not yet implemented");
	}

	@Test
	public void testEqualsPolygon() {
		assertTrue("Die equals Methode testet nicht auf Reflexivität", P1.equals(P1));
		assertTrue("Die equals Methode testet nicht auf Symetrie",P1.equals(P2)&&P2.equals(P1));
	    assertTrue("Die equals Methode testet nicht auf Transitivität",P1.equals(P2)&&P2.equals(P3)&&P1.equals(P3));
	    ArrayList<Point> A4 = new ArrayList<Point>();
		A4.add(new Point(0, 0));
		P3.setPoints(A4);
		P3.setSolid(true);
		P3.setColor(Color.BLUE);
		assertFalse("Die equals Methode testet nicht auf Konsistenz",P1.equals(P3));
		assertFalse(P1.equals(null));
		System.out.println(P3.getPoints().size());
		
	}

}
