package de.fh_zwickau.se;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MengeTest {

	Menge testMenge1;
	Menge testMenge2;
	int x, y, z, u, v;

	@Before
	public void setUp() throws Exception {
		testMenge1 = new Menge();
		testMenge2 = new Menge();
		x = 1;
		y = 2;
		z = 3;
		u = 4;
		v = 5;
	}

	@After
	public void tearDown() throws Exception {
		testMenge1 = null;
		testMenge2 = null;
	}

	@Test
	public void testMenge() {
		assertNotNull("Die TestMenge1 wurde nicht angelegt ", testMenge1);
		assertNotNull("Die TestMenge1 wurde nicht angelegt ", testMenge2);

	}

	@Test
	public void testAdd() {
		testMenge1.add(x);
		assertFalse("Die Methode add F�gt kein Element hinzu",
				testMenge1.isEmpty());

	}

	@Test
	public void testIsEmpty() {
		assertTrue("die is empty Methode ist Fehlerhaft", testMenge1.isEmpty());
		assertTrue("die is empty Methode ist Fehlerhaft", testMenge2.isEmpty());
	}

	@Test
	public void testElementezahl() {
		testMenge1.add(x);
		assertEquals("Die Elementanzahl wird Falsch berechnet",
				testMenge1.elementezahl(), 1);
		testMenge1.add(x);
		assertEquals(
				"Die Elementanzahl wird Falsch berechnet:bei zweimal Gleicher Werteingabe",1,
				testMenge1.elementezahl());
	}

	@Test
	public void testDeleteElement() {
		testMenge1.add(x);
		testMenge1.deleteElement(x);
		assertTrue("Elemente k�nnen nicht gel�scht werden",
				testMenge1.isEmpty());
		testMenge1.add(x);
		testMenge1.deleteElement(y);
		assertEquals(
				"Das L�schen eines in der Menge nicht vorhandenen Objektes ist Fehlerhaft",
				1, testMenge1.elementezahl());

	}

	@Test
	public void testIsElement() {
		testMenge1.add(x);
		assertTrue(testMenge1.isElement(x));

	}

	@Test
	public void testSumme() {
		assertEquals("Die Summenberechnung f�r 0 Element ist Fehlerhaft", 0,
				testMenge1.summe());
		testMenge1.add(x);
		assertEquals("Die Summenberechnung f�r 1 Element ist Fehlerhaft", 1,
				testMenge1.summe());
		testMenge1.add(y);
		assertEquals("Die Summenberechnung f�r 2 Element ist Fehlerhaft", 3,
				testMenge1.summe());
		testMenge1.add(z);
		assertEquals("Die Summenberechnung f�r 3 Element ist Fehlerhaft", 6,
				testMenge1.summe());
		testMenge1.add(u);
		assertEquals("Die Summenberechnung f�r 4 Element ist Fehlerhaft", 10,
				testMenge1.summe());
		testMenge1.add(v);
		assertEquals("Die Summenberechnung f�r 5 Element ist Fehlerhaft", 15,
				testMenge1.summe());
	}

	@Test
	public void testDurchschnittswert() {
		testMenge1.add(x);
		testMenge1.add(y);
		assertTrue(
				"Die Durchschnittswertberechnung f�r eine nichtgerade Mengensumme ist Fehlerhaft",
				testMenge1.durchschnittswert() == 1.5);
		testMenge1.deleteElement(x);
		testMenge1.deleteElement(y);
		testMenge1.add(x);
		assertEquals(
				"Die Durchschnittswertberechnung f�r 1 Element ist Fehlerhaft",
				(testMenge1.summe() / 2), testMenge1.durchschnittswert());
		testMenge1.add(y);
		assertEquals(
				"Die Durchschnittswertberechnung f�r 2 Element ist Fehlerhaft",
				(testMenge1.summe() / 2), testMenge1.durchschnittswert());
		testMenge1.add(z);
		assertEquals(
				"Die Durchschnittswertberechnung f�r 3 Element ist Fehlerhaft",
				(testMenge1.summe() / 2), testMenge1.durchschnittswert());
		testMenge1.add(u);
		assertEquals(
				"Die Durchschnittswertberechnung f�r 3 Element ist Fehlerhaft",
				(testMenge1.summe() / 2), testMenge1.durchschnittswert());
		testMenge1.add(v);
		assertEquals(
				"Die Durchschnittswertberechnung f�r 5 Element ist Fehlerhaft",
				(testMenge1.summe() / 2), testMenge1.durchschnittswert());
	}

	@Test
	public void testDurchschnittswertBeiLeererMenge() {
		try {
			// testMenge1.add(x);
			testMenge1.durchschnittswert();
			fail("die Durchschnittswertberechnung f�r Leere Mengen ist fehlerhaft ");

		} catch (MengeIstLeerException expected) {

		}

	}

	@Test
	public void testZaehle_elemente_mit_bestimmter_eigenschaft() {
		testMenge1.add(x);
		testMenge1.add(y);
		testMenge1.add(z);
		testMenge1.add(u);
		testMenge1.add(v);
		Bewerter bew = new Bewerter() {

			@Override
			public boolean bewerte(int arg0) {
				return arg0 > 3;
			}
		};
		assertEquals(
				"Die Z�hlung von Elementen mit bestimmten eigenschaffte ist falsch",
				2,testMenge1.zaehle_elemente_mit_bestimmter_eigenschaft(bew));

	}

	@Test
	public void Grenzwerte() {
		testMenge1.add(0);
		assertEquals("der Wert 0 Kann nicht eingetragen werden", 1,
				testMenge1.elementezahl());
		assertTrue("der Wert 0 Kann nicht eingetragen werden",
				testMenge1.isElement(0));
		testMenge1.add(-1);
		assertEquals("negative Werte k�nnen nicht eingetragen werden", 2,
				testMenge1.elementezahl());
		assertTrue("negative Werte k�nnen nicht eingetragen werden",
				testMenge1.isElement(-1));
		for (int i = 0; i < 100; i++) {
			try {
				testMenge2.add(i);

			} catch (ArrayIndexOutOfBoundsException expected) {

				fail("Die Menge kann nur " + i + " Elemente fassen");
			}

		}

	}

	@Test
	public void testBewerteObGroesserdrei() {
		Bewerter bew = new BewerteObGroesserDrei();
		assertFalse(
				"der Bewerter Groesser Drei ist Fehlerhaft weil er vergleicht groe�ergleich drei",
				bew.bewerte(3));
	}
}
