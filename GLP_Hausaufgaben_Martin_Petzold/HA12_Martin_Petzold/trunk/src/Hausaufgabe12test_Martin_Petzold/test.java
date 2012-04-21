package Hausaufgabe12test_Martin_Petzold;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import Hausaufgabe12_Martin_Petzold.Box;
import org.junit.After;

public class test {

	private Box testbox;
	/**
	 * @throws Exception initialisiert einen Testkarton
	 */
	@Before
	public void setUp() throws Exception {
		
		testbox = new Box(2,5,7);
	}
	
	/**
	 * Setzt den Testkarton auf null
	 */
	@After
	public void tearDown()
	{
		testbox = null;
	}
	/**
	 * Testet den Konstruktor für einen Würfelfürmigen Karton
	 */
	@Test
	public void testWuerfelKarton() {
		double i = 10;
		Box Wuerfel=new Box (i);
		assertEquals("Die Übergabe für einen Würfelförmigen Karton im Wert Höhe ist nicht Korrekt",i, Wuerfel.getHeight(),0);
		assertEquals("Die Übergabe für einen Würfelförmigen Karton im Wert Länge ist nicht Korrekt",i, Wuerfel.getLength(),0);
		assertEquals("Die Übergabe für einen Würfelförmigen Karton im Wert Breite ist nicht Korrekt",i, Wuerfel.getWidth(),0);
	}
	/**
	 * Testet ob die Methode der Volumenberechnung für Kartons Korrekt funktioniert
	 */
	@Test
	public void testCalculateVolume() {
		assertTrue("Die Volumenberechnung ist Fehlerhaft",testbox.calculateVolume()==70);
	}

	/**
	 * Testet ob die Methode der Oberflächenberechnung für Kartons Korrekt funktioniert
	 */
	@Test
	public void testCalculateSurfaceArea() {
		assertTrue("Die Oberflächenberechnung ist Fehlerhaft",testbox.calculateSurfaceArea()==118);
	}

	/**
	 * Testet ob der Karton korrekt vergrößert wird
	 */
	@Test
	public void testGetBiggerBox() {
		assertFalse("Es wurde keine Größere Box erstellt",testbox.getBiggerBox()==testbox);
		assertTrue("Die Höhe wurde falsch verlängert",testbox.getBiggerBox().getHeight()==testbox.getHeight()*1.25);
		assertTrue("Die Länge wurde falsch verlängert",testbox.getBiggerBox().getLength()==testbox.getLength()*1.25);
		assertTrue("Die Breite wurde falsch verlängert",testbox.getBiggerBox().getWidth()==testbox.getWidth()*1.25);
	}

	/**
	 * Testet ob ein Karton in einen Anderen Passt und wann nicht
	 */
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
		assertFalse("Die FitsIn Methode ist im Höhenvergleich Fehlerhaft",testbox.FitsIn(testbox2));
		testbox2.setHeight(testbox.getHeight()+1);
		testbox2.setLength(testbox.getLength());
		testbox2.setWidth(testbox.getWidth()+1);
		assertFalse("Die FitsIn Methode ist im Längenvergleich Fehlerhaft",testbox.FitsIn(testbox2));
		testbox2.setHeight(testbox.getHeight()+1);
		testbox2.setLength(testbox.getLength()+1);
		testbox2.setWidth(testbox.getWidth());
		assertFalse("Die FitsIn Methode ist im Breitenvergleich Fehlerhaft",testbox.FitsIn(testbox2));
	}
	/**
	 * Testet ob der Konstruktor mit einen Übergebenen Karton funktioniert
	 */
	public void testBoxUebergabe()
	{
		Box testbox2 = new Box(testbox);
		assertFalse("Die neue Box ist kein eigenständiges Objekt",testbox==(testbox2));
		assertEquals("Die Höhe wurde an den neuen Karton fehlehaft übergeben",testbox.getHeight(), testbox2.getHeight(),0);
		assertEquals("Die Länge wurde an den neuen Karton fehlehaft übergeben",testbox.getLength(), testbox2.getLength(),0);
		assertEquals("Die Breite wurde an den neuen Karton fehlehaft übergeben",testbox.getWidth(), testbox2.getWidth(),0);
		testbox2.setHeight(1);
		testbox2.setLength(1);
		testbox2.setWidth(1);
		assertFalse("Die Höhe des alten und neuen Kartons sind nicht voneinander unabhängig",testbox.getHeight()==testbox2.getHeight());
		assertFalse("Die Länge des alten und neuen Kartons sind nicht voneinander unabhängig",testbox.getLength()==testbox2.getLength());
		assertFalse("Die Breite des alten und neuen Kartons sind nicht voneinander unabhängig",testbox.getWidth()==testbox2.getWidth());
		
	}
}
