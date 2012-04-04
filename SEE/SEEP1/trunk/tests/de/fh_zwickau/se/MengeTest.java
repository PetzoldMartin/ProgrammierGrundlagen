package de.fh_zwickau.se;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MengeTest {

	Menge testMenge1;
	Menge testMenge2;
	int x,y,z,u,v;
	
	@Before
	public void setUp() throws Exception {
		testMenge1 = new Menge();
		testMenge2 = new Menge();
		x=1;
		y=2;
		z=3;
		u=4;
		v=5;
	}

	@After
	public void tearDown() throws Exception {
		testMenge1 = null;
		testMenge2 = null;
	}

	@Test
	public void testMenge() {
		assertNotNull("Die TestMenge1 wurde nicht angelegt ",testMenge1);
		assertNotNull("Die TestMenge1 wurde nicht angelegt ",testMenge2);
		
	}

	@Test
	public void testAdd() {
		testMenge1.add(x);
		assertFalse("Die Methode add F�gt kein Element hinzu",testMenge1.isEmpty());
		
	}

	@Test
	public void testIsEmpty() {
		assertTrue("die is empty Methode ist Fehlerhaft",testMenge1.isEmpty());
		assertTrue("die is empty Methode ist Fehlerhaft",testMenge2.isEmpty());
	}

	@Test
	public void testElementezahl() {
		testMenge1.add(x);
		assertEquals("Die Elementanzahl wird Falsch berechnet",testMenge1.elementezahl(),1);
		testMenge1.add(x);
		assertEquals("Die Elementanzahl wird Falsch berechnet:bei zweimal Gleicher Werteingabe",testMenge1.elementezahl(),1);
	}
	
	@Test
	public void testDeleteElement() {
		testMenge1.add(x);
		testMenge1.deleteElement(x);
		assertTrue("Elemente k�nnen nicht gel�scht werden",testMenge1.isEmpty());
	}
	
	@Test
	public void testIsElement() {
		testMenge1.add(x);
		assertTrue(testMenge1.isElement(x));
		
	}
	
	@Test
	public void testSumme() {
		assertEquals("Die Summenberechnung f�r 0 Element ist Fehlerhaft",testMenge1.summe(), 0);
		testMenge1.add(x);
		assertEquals("Die Summenberechnung f�r 1 Element ist Fehlerhaft",testMenge1.summe(), 1);
		testMenge1.add(y);
		assertEquals("Die Summenberechnung f�r 2 Element ist Fehlerhaft",testMenge1.summe(), 3);
		testMenge1.add(z);
		assertEquals("Die Summenberechnung f�r 3 Element ist Fehlerhaft",testMenge1.summe(), 6);
		testMenge1.add(u);
		assertEquals("Die Summenberechnung f�r 4 Element ist Fehlerhaft",testMenge1.summe(), 10);
		testMenge1.add(v);
		assertEquals("Die Summenberechnung f�r 5 Element ist Fehlerhaft",testMenge1.summe(), 15);
	}

    @Test
	public void testDurchschnittswert() {
    	testMenge1.add(x);
		assertEquals("Die Durchschnittswertberechnung f�r 1 Element ist Fehlerhaft",testMenge1.durchschnittswert(), 1);
		testMenge1.add(y);
		assertTrue("Die Durchschnittswertberechnung f�r 2 Element ist Fehlerhaft",testMenge1.durchschnittswert()==1.5);
		testMenge1.add(z);
		assertEquals("Die Durchschnittswertberechnung f�r 3 Element ist Fehlerhaft",testMenge1.durchschnittswert(), 2);
		testMenge1.add(u);
		assertTrue("Die Durchschnittswertberechnung f�r 3 Element ist Fehlerhaft",testMenge1.durchschnittswert()==2.5);
		testMenge1.add(v);
		assertEquals("Die Durchschnittswertberechnung f�r 5 Element ist Fehlerhaft",testMenge1.durchschnittswert(), 3);
	}
    
	@Test
	public void testZaehle_elemente_mit_bestimmter_eigenschaft() {
		
	}
	
	@Test
	public void Grenzwerte() {
		testMenge1.add(0);
	}
	

}
