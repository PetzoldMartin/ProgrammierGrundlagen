package de.fh_zwickau.se;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Aismael
 * 
 */
public class MengeTest {

	Menge testMenge1;
	Menge testMenge2;
	int x, y, z, u, v;

	/**
	 * @throws Exception
	 *             Initialisiert 2 Mengen un5 variablen von 1 bis 5
	 */
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

	/**
	 * @throws Exception
	 *             Setzt die Mengen Null
	 */
	@After
	public void tearDown() throws Exception {
		testMenge1 = null;
		testMenge2 = null;
	}

	/**
	 * Testet ob der Konstruktor die Mengen korrekt initialisiert
	 */
	@Test
	public void testMenge() {
		assertNotNull("Die TestMenge1 wurde nicht angelegt ", testMenge1);
		assertNotNull("Die TestMenge1 wurde nicht angelegt ", testMenge2);

	}

	/**
	 * testet ob die addmethode die Elemente korrekt Hinzufügt
	 */
	@Test
	public void testAdd() {
		testMenge1.add(x);
		assertFalse("Die Methode add Fügt kein Element hinzu",
				testMenge1.isEmpty());

	}

	/**
	 * Testet ob die is Empty Methode Korrekt arbeitet
	 */
	@Test
	public void testIsEmpty() {
		assertTrue("die is empty Methode ist Fehlerhaft", testMenge1.isEmpty());
		assertTrue("die is empty Methode ist Fehlerhaft", testMenge2.isEmpty());
	}

	/**
	 * testet ob die Ellementzahl korrekt Wiedergegeben wird und ob beim adden
	 * des selben Elements nur eins geschrieben wird
	 */
	@Test
	public void testElementezahl() {
		testMenge1.add(x);
		assertEquals(
				"Die Elementanzahl wird bei einem Element Falsch berechnet",
				testMenge1.elementezahl(), 1);
		testMenge1.add(y);
		assertEquals(
				"Die Elementanzahl wird bei mehreren Elementen Falsch berechnet",
				testMenge1.elementezahl(), 2);
		testMenge1.add(x);
		assertEquals(
				"Die Elementanzahl wird Falsch berechnet:bei zweimal Gleicher Werteingabe",
				2, testMenge1.elementezahl());
	}

	/**
	 * Testet ob Elemente Korrekt gelöscht werden und ob bei löschen eines nicht
	 * vorhandenen Elements ein Fehler Auftritt
	 */
	@Test
	public void testDeleteElement() {
		testMenge1.add(x);
		testMenge1.deleteElement(x);
		assertTrue("Elemente können nicht gelöscht werden",
				testMenge1.isEmpty());
		testMenge1.add(x);
		testMenge1.deleteElement(y);
		assertEquals(
				"Das Löschen eines in der Menge nicht vorhandenen Objektes ist Fehlerhaft",
				1, testMenge1.elementezahl());

	}

	/**
	 * Testet ob eingegebene Elemente Korrekt auf vorhandensein geprüft werden
	 */
	@Test
	public void testIsElement() {
		testMenge1.add(x);
		assertTrue(testMenge1.isElement(x));

	}

	/**
	 * Testet ob die Summenberechnung aller Elemente Korrekt ist
	 */
	@Test
	public void testSumme() {
		assertEquals("Die Summenberechnung für 0 Element ist Fehlerhaft", 0,
				testMenge1.summe());
		testMenge1.add(x);
		assertEquals("Die Summenberechnung für 1 Element ist Fehlerhaft", 1,
				testMenge1.summe());
		testMenge1.add(y);
		assertEquals("Die Summenberechnung für 2 Element ist Fehlerhaft", 3,
				testMenge1.summe());
		testMenge1.add(z);
		assertEquals("Die Summenberechnung für 3 Element ist Fehlerhaft", 6,
				testMenge1.summe());
		testMenge1.add(u);
		assertEquals("Die Summenberechnung für 4 Element ist Fehlerhaft", 10,
				testMenge1.summe());
		testMenge1.add(v);
		assertEquals("Die Summenberechnung für 5 Element ist Fehlerhaft", 15,
				testMenge1.summe());
	}

	/**
	 * Testet ob der Durchschnittswert Korrekt berechnet wird
	 */
	@Test
	public void testDurchschnittswert() {
		testMenge1.add(x);
		testMenge1.add(y);
		assertTrue(
				"Die Durchschnittswertberechnung für eine nichtgerade Mengensumme ist Fehlerhaft",
				testMenge1.durchschnittswert() == 1.5);
		testMenge1.deleteElement(x);
		testMenge1.deleteElement(y);
		testMenge1.add(x);
		assertEquals(
				"Die Durchschnittswertberechnung für 1 Element ist Fehlerhaft",
				(testMenge1.summe() / 2), testMenge1.durchschnittswert());
		testMenge1.add(y);
		assertEquals(
				"Die Durchschnittswertberechnung für 2 Element ist Fehlerhaft",
				(testMenge1.summe() / 2), testMenge1.durchschnittswert());
		testMenge1.add(z);
		assertEquals(
				"Die Durchschnittswertberechnung für 3 Element ist Fehlerhaft",
				(testMenge1.summe() / 2), testMenge1.durchschnittswert());
		testMenge1.add(u);
		assertEquals(
				"Die Durchschnittswertberechnung für 3 Element ist Fehlerhaft",
				(testMenge1.summe() / 2), testMenge1.durchschnittswert());
		testMenge1.add(v);
		assertEquals(
				"Die Durchschnittswertberechnung für 5 Element ist Fehlerhaft",
				(testMenge1.summe() / 2), testMenge1.durchschnittswert());
	}

	/**
	 * Testet ob die Durchscnittsberechnung die Richtige Exeption Wirft und sich
	 * danach erholt
	 */
	@Test
	public void testDurchschnittswertBeiLeererMenge() {
		try {
			// testMenge1.add(x);
			testMenge1.durchschnittswert();
			fail("die Durchschnittswertberechnung für Leere Mengen ist fehlerhaft :MengeIstLeerException löst nicht aus");

		} catch (MengeIstLeerException expected) {

		}
		try {
			testMenge1.add(x);
			assertEquals(
					"die Durchschnittswertberechnung erholt sich nicht nach MengeIstLeerException ",
					1, testMenge1.durchschnittswert());

		} catch (MengeIstLeerException expected) {
			fail("die Durchschnittswertberechnung erholt sich nicht nach MengeIstLeerException ");

		}

	}

	/**
	 * Testet ob Elemente Mit Bestimmter eigenschafft korrekt gezählt werden
	 */
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
				"Die Zählung von Elementen mit bestimmten eigenschaffte ist falsch",
				2, testMenge1.zaehle_elemente_mit_bestimmter_eigenschaft(bew));

	}

	/**
	 * Testet Grenzwerrte und die Größe des Arreys bis 100
	 */
	@Test
	public void Grenzwerte() {
		testMenge1.add(0);
		assertEquals("der Wert 0 Kann nicht eingetragen werden", 1,
				testMenge1.elementezahl());
		assertTrue("der Wert 0 Kann nicht eingetragen werden",
				testMenge1.isElement(0));
		testMenge1.add(-1);
		assertEquals("negative Werte können nicht eingetragen werden", 2,
				testMenge1.elementezahl());
		assertTrue("negative Werte können nicht eingetragen werden",
				testMenge1.isElement(-1));
		for (int i = 0; i < 100; i++) {
			try {
				testMenge2.add(i);

			} catch (ArrayIndexOutOfBoundsException expected) {

				fail("Die Menge kann nur " + i + " Elemente fassen");
			}

		}

	}

	/**
	 * Testet das Interface BewerteObGroesserdrei
	 */
	@Test
	public void testBewerteObGroesserdrei() {
		Bewerter bew = new BewerteObGroesserDrei();
		assertFalse(
				"der Bewerter Groesser Drei ist Fehlerhaft bei Werten unter Drei",
				bew.bewerte(2));
		assertTrue(
				"der Bewerter Groesser Drei ist Fehlerhaft Bei Werten über Drei",
				bew.bewerte(4));
		assertFalse(
				"der Bewerter Groesser Drei ist Fehlerhaft weil er vergleicht groeßergleich drei",
				bew.bewerte(3));
	}
}
