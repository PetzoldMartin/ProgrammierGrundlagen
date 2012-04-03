package Hausaufgabe12test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import Hausaufgabe12.Box;
import org.junit.After;

public class test {

	private Box testbox;
	@Before
	public void setUp() throws Exception {
		
		testbox = new Box(2,5,7);
	}
	
	@After
	public void tearDown()
	{
		testbox = null;
	}
	@Test
	public void testWuerfelKarton() {
		double i = 10;
		Box Wuerfel=new Box (i);
		assertEquals("Die �bergabe f�r einen W�rfelf�rmigen Karton im Wert H�he ist nicht Korrekt",i, Wuerfel.getHeight(),0);
		assertEquals("Die �bergabe f�r einen W�rfelf�rmigen Karton im Wert L�nge ist nicht Korrekt",i, Wuerfel.getLength(),0);
		assertEquals("Die �bergabe f�r einen W�rfelf�rmigen Karton im Wert Breite ist nicht Korrekt",i, Wuerfel.getWidth(),0);
	}
	@Test
	public void testCalculateVolume() {
		assertTrue("Die Volumenberechnung ist Fehlerhaft",testbox.calculateVolume()==70);
	}

	@Test
	public void testCalculateSurfaceArea() {
		assertTrue("Die Oberfl�chenberechnung ist Fehlerhaft",testbox.calculateSurfaceArea()==118);
	}

	@Test
	public void testGetBiggerBox() {
		assertFalse("Es wurde keine Gr��ere Box erstellt",testbox.getBiggerBox()==testbox);
		assertTrue("Die H�he wurde falsch verl�ngert",testbox.getBiggerBox().getHeight()==testbox.getHeight()*1.25);
		assertTrue("Die L�nge wurde falsch verl�ngert",testbox.getBiggerBox().getLength()==testbox.getLength()*1.25);
		assertTrue("Die Breite wurde falsch verl�ngert",testbox.getBiggerBox().getWidth()==testbox.getWidth()*1.25);
	}

	@Test
	public void testFitsIn() {
		Box testbox2 = new Box(2,5,7);
		testbox2.setHeight(testbox.getHeight()+1);
		testbox2.setLength(testbox.getLength()+1);
		testbox2.setWidth(testbox.getWidth()+1);
		assertTrue("Die FitsIn Methode ist Fehlerhaft",testbox.FitsIn(testbox2));
		testbox2.setHeight(testbox.getHeight());
		testbox2.setLength(testbox.getLength()+1);
		testbox2.setWidth(testbox.getWidth()+1);
		assertFalse("Die FitsIn Methode ist im H�henvergleich Fehlerhaft",testbox.FitsIn(testbox2));
		testbox2.setHeight(testbox.getHeight()+1);
		testbox2.setLength(testbox.getLength());
		testbox2.setWidth(testbox.getWidth()+1);
		assertFalse("Die FitsIn Methode ist im L�ngenvergleich Fehlerhaft",testbox.FitsIn(testbox2));
		testbox2.setHeight(testbox.getHeight()+1);
		testbox2.setLength(testbox.getLength()+1);
		testbox2.setWidth(testbox.getWidth());
		assertFalse("Die FitsIn Methode ist im Breitenvergleich Fehlerhaft",testbox.FitsIn(testbox2));
	}
	public void testBoxUebergabe()
	{
		Box testbox2 = new Box(testbox);
		assertFalse("Die neue Box ist kein eigenst�ndiges Objekt",testbox==(testbox2));
		assertEquals(testbox.getHeight(), testbox2.getHeight(),0);
		assertEquals(testbox.getLength(), testbox2.getLength(),0);
		assertEquals(testbox.getWidth(), testbox2.getWidth(),0);
		testbox2.setHeight(1);
		testbox2.setLength(1);
		testbox2.setWidth(1);
		assertFalse(testbox.getHeight()==testbox2.getHeight());
		assertFalse(testbox.getLength()==testbox2.getLength());
		assertFalse(testbox.getWidth()==testbox2.getWidth());
		
	}
}
