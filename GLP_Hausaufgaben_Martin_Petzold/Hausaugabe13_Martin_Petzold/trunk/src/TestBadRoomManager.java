import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestBadRoomManager {
	RoomManager rm1, rm2, rm3, rm4, rm5, rm6, rm7, rm8;
	Room R1, R2, R3, R4, R5, R6, R7, R8;
	ArrayList<Room> S1, S2, S3, S4, S5, S6, S7, S8;
	/*
	 * Test get Matching Rooms
	 * !!!Fehler Nummer 1 Wenn ein Beamer vorhanden ist aber keiner gew�nsht wird wird der raum nicht Angezeigt!!
	 * !!!Fehler Nummer 2 Wenn ein Raum ohne Beamer Erfragt wird und der Raum keinen hat trotzdem False!!
	 * !!!Fehler Nummer 3 Wenn der Grenzwert eines Raumes erreicht ist wird dieser nicht angezeigt!!
	 * 
	 * Test Get Matching ComputerPools
	 * !!!Fehler 4 Wenn Beamer in Anfrage und raum enthalten falsche Ausgabe!!!
	 * !!!Fehler 5 Wenn Beamer nicht nachgefragt und nicht vorhanden Fehler!!!
	 * !!!Fehler 6 Abfrage des Grenzwertes oberhalb der Computerpoolpl�tze ist falsch!!!
	 *
	 * Test get Matching Room in a building
	 * !!!Fehler 7 wenn kein beamer Vorhanden aber einer gefragt wird Fehler
	 * !!!Fehler 8 Wenn oberer Grenzwert des Computerpools erreicht!!
	 * 
	 */

	@Before
	public void setUp() throws Exception {
		rm1 = new BadRoomManager();
		rm2 = new BadRoomManager();
		rm3 = new BadRoomManager();
		rm4 = new BadRoomManager();
		rm5 = new BadRoomManager();
		rm6 = new BadRoomManager();
		rm7 = null;
		R1 = new Room("100", true, 16, true, "R", 16);
		R2 = new Room("100", false, 16, true, "R", 16);
		R3 = new Room("100", true, 1, true, "R", 16);
		R4 = new Room("100", true, 16, false, "R", 16);
		R5 = new Room("100", true, 16, true, "T", 16);
		R6 = new Room("100", true, 16, true, "R", 1);
		R7 = null;
		S1 = new ArrayList<Room>();
		S2 = new ArrayList<Room>();
		S3 = new ArrayList<Room>();
		S4 = new ArrayList<Room>();
		S5 = new ArrayList<Room>();
		S6 = new ArrayList<Room>();
		S7 = null;
		rm1.registerRoom(R1);
		rm2.registerRoom(R2);
		rm3.registerRoom(R3);
		rm4.registerRoom(R4);
		rm5.registerRoom(R5);
		rm6.registerRoom(R6);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testregisterRoom() {
		assertFalse("Die RoomManager sind nicht voneinander Unabh�ngig",
				rm1.equals(rm2));
		rm1.registerRoom(null);
		rm1.registerRoom(R1);
		for (Integer i = 2; i <= 1000; i++) {

			try {
				rm1.registerRoom(new Room(i.toString(), true, 16, true, "R", 16));

			} catch (ArrayIndexOutOfBoundsException expected) {

				fail("Der Room Manager kann nur " + i + " Rooms fassen");
			}
		}

	}

	@Test
	public void testgetMatchingRooms() {

		S1.add(R1);
		assertNull("Es k�nnen nicht erzeugte RoomManager Abgefragt werden", R7);
		
		// Beamer Abfragen
		
		assertEquals(
				"Raum mit Beamer Abfrage bei vorhandenen Beamer ist nicht korrekt",
				S1, rm1.getMatchingRooms(true, 15));
//		assertEquals(
//				"Raum ohne Beamer Abfrage bei vorhandenen Beamer ist nicht korrekt",
//				S1, rm1.getMatchingRooms(false, 15));//!!!Fehler Nummer 1 Wenn ein Beamer vorhanden ist aber keiner gew�nsht wird wird der raum nicht Angezeigt!!
		assertEquals(
				"Raum mit Beamer Abfrage bei nicht vorhandenen Beamer ist nicht korrekt",
				S3, rm2.getMatchingRooms(true, 15));
		S2.add(R2);
//		assertEquals(
//				"Raum ohne Beamer Abfrage bei nicht vorhandenen Beamer ist nicht korrekt",
//				S2, rm2.getMatchingRooms(false, 15));//!!!Fehler Nummer 2 Wenn ein Raum ohne Beamer Erfragt wird und der Raum keinen hat trotzdem False!!
		
		// Grenzwert Abfragen
//		assertEquals(
//				"Grenzwertabfrage bei Raumgr��e ist im Maximalwert nicht korrekt",
//				S1, rm1.getMatchingRooms(true, 16));//!!!Fehler Nummer 3 Wenn der Grenzwert eines Raumes erreicht ist wird dieser nicht angezeigt!!
		assertEquals(
				"Grenzwertabfrage bei Werten oberhalb der Grenze ist nicht korrekt",
				S3, rm1.getMatchingRooms(true, 17));
		assertEquals("Grenzwertabfrage bei Wert 0 ist nicht korrekt", S1,
				rm1.getMatchingRooms(true, 0));
		assertEquals("Grenzwertabfrage bei Wert -1 ist nicht korrekt", S1,
				rm1.getMatchingRooms(true, -1));// ??? negative Pl�tze ???
		
		// gemischte Abfragen Beamer und oberer Grenzwert
		
//		assertEquals(
//				"Raum mit Beamer Abfrage bei vorhandenen Beamer und oberen Grenzwert ist nicht korrekt",
//				S1, rm1.getMatchingRooms(true, 16));
//		assertEquals(
//				"Raum ohne Beamer Abfrage bei vorhandenen Beamer und oberen Grenzwert ist nicht korrekt",
//				S1, rm1.getMatchingRooms(false, 16));
//		assertEquals(
//				"Raum mit Beamer Abfrage bei nicht vorhandenen Beamer und oberen Grenzwert ist nicht korrekt",
//				S3, rm2.getMatchingRooms(true, 16));
//		assertEquals(
//				"Raum ohne Beamer Abfrage bei nicht vorhandenen Beamer und oberen Grenzwert ist nicht korrekt",
//				S2, rm2.getMatchingRooms(false, 16));
		
		// gemischte Abfragen Beamer und oberhalb des Grenzwertes
		
		assertEquals(
				"Raum mit Beamer Abfrage bei vorhandenen Beamer und oberhalb des Grenzwertes ist nicht korrekt",
				S3, rm1.getMatchingRooms(true, 17));
		assertEquals(
				"Raum ohne Beamer Abfrage bei vorhandenen Beamer und oberhalb des Grenzwertes ist nicht korrekt",
				S3, rm1.getMatchingRooms(false, 17));
		assertEquals(
				"Raum mit Beamer Abfrage bei nicht vorhandenen Beamer und oberhalb des Grenzwertes ist nicht korrekt",
				S3, rm2.getMatchingRooms(true, 17));
		assertEquals(
				"Raum ohne Beamer Abfrage bei nicht vorhandenen Beamer und oberhalb des Grenzwertes ist nicht korrekt",
				S3, rm2.getMatchingRooms(false, 17));

	}

	// @Test
	// public void testdeleteRoom() {
	// rm1.registerRoom(R1);
	// // assertTrue(rm1.deleteRoom(R1));
	// rm1.deleteRoom(R1);
	// assertEquals("Ein vorhandener Raum konnte nicht gel�scht werden",S1,
	// rm1.getMatchingRooms(false, 12));
	//
	// }
	@Test
	public void testgetMatchingComputerPools() {
		S1.add(R1);
		assertNull("Es k�nnen nicht erzeugte RoomManager Abgefragt werden", R7);
		// Beamer Abfragen
//		assertEquals(
//				"Computerpool mit Beamer Abfrage bei vorhandenen Beamer ist nicht korrekt",
//				S1, rm1.getMatchingComputerPools(true, 0, 15));//!!!Fehler 4 Wenn Beamer in anfrage und raum enthalten falsche Ausgabe!!!
//		assertEquals(
//				"Computerpool ohne Beamer Abfrage bei vorhandenen Beamer ist nicht korrekt",
//				S1, rm1.getMatchingComputerPools(false, 0, 15));//!!!Fehler 5 Wenn Beamer nicht nachgefragt und nicht vorhanden Fehler!!!
		assertEquals(
				"Computerpool mit Beamer Abfrage bei nicht vorhandenen Beamer ist nicht korrekt",
				S3, rm2.getMatchingComputerPools(true, 0, 15));
		S2.add(R2);
//		assertEquals(
//				"Computerpool ohne Beamer Abfrage bei nicht vorhandenen Beamer ist nicht korrekt",
//				S2, rm2.getMatchingComputerPools(false, 0, 15));
		// Grenzwert Abfragen
//		assertEquals(
//				"Computerpool Grenzwertabfrage bei Raumgr��e ist im Maximalwert nicht korrekt",
//				S1, rm1.getMatchingComputerPools(true, 0, 16));
		assertEquals(
				"Computerpool Grenzwertabfrage bei Werten oberhalb der Grenze ist nicht korrekt",
				S3, rm1.getMatchingComputerPools(true, 0, 17));
//		assertEquals(
//				"Computerpool Grenzwertabfrage bei Wert 0 ist nicht korrekt",
//				S1, rm1.getMatchingComputerPools(true, 0, 0));
//		assertEquals(
//				"Computerpool Grenzwertabfrage bei Wert -1 ist nicht korrekt",
//				S1, rm1.getMatchingComputerPools(true, -1, -1));// ??? negative
//																// Pl�tze ???
//		// gemischte Abfragen Beamer und oberer Grenzwert
//		assertEquals(
//				"Computerpool  mit Beamer Abfrage bei vorhandenen Beamer und oberen Grenzwert ist nicht korrekt",
//				S1, rm1.getMatchingComputerPools(true, 0, 16));
//		assertEquals(
//				"Computerpool  ohne Beamer Abfrage bei vorhandenen Beamer und oberen Grenzwert ist nicht korrekt",
//				S1, rm1.getMatchingComputerPools(false, 0, 16));
		assertEquals(
				"Computerpool  mit Beamer Abfrage bei nicht vorhandenen Beamer und oberen Grenzwert ist nicht korrekt",
				S3, rm2.getMatchingComputerPools(true, 0, 16));
//		assertEquals(
//				"Computerpool  ohne Beamer Abfrage bei nicht vorhandenen Beamer und oberen Grenzwert ist nicht korrekt",
//				S2, rm2.getMatchingComputerPools(false, 0, 16));
//		// gemischte Abfragen Beamer und oberhalb des Grenzwertes
		assertEquals(
				"Computerpool mit Beamer Abfrage bei vorhandenen Beamer und oberhalb des Grenzwertes ist nicht korrekt",
				S3, rm1.getMatchingComputerPools(true, 0, 17));
		assertEquals(
				"Computerpool ohne Beamer Abfrage bei vorhandenen Beamer und oberhalb des Grenzwertes ist nicht korrekt",
				S3, rm1.getMatchingComputerPools(false, 0, 17));
		assertEquals(
				"Computerpool mit Beamer Abfrage bei nicht vorhandenen Beamer und oberhalb des Grenzwertes ist nicht korrekt",
				S3, rm2.getMatchingComputerPools(true, 0, 17));
		assertEquals(
				"Computerpool ohne Beamer Abfrage bei nicht vorhandenen Beamer und oberhalb des Grenzwertes ist nicht korrekt",
				S3, rm2.getMatchingComputerPools(false, 0, 17));
//		// Abfragen der Vorhandenen PC Pl�tze
//		assertEquals("Computerpool oberer Grenzwert Abfrage ist nicht korrekt",
//				S1, rm1.getMatchingComputerPools(true, 16, 15));
//		assertEquals(
//				"Computerpool oberhalb des Grenzwertes Abfrage ist nicht korrekt",
//				S3, rm1.getMatchingComputerPools(true, 17, 15));//!!!Fehler 6 Abfrage des Grenzwertes oberhalb der Computerpoolpl�tze ist falsch!!!

	}

	@Test
	public void testgetMatchingRoomInABuilding() {
		S1.add(R1);
		assertNull("Es k�nnen nicht erzeugte RoomManager Abgefragt werden", R7);
		// Beamer Abfragen
		assertEquals(
				"Computerpool in einem Geb�ude mit Beamer Abfrage bei vorhandenen Beamer ist nicht korrekt",
				S1, rm1.getMatchingRoomInABuilding(true, 0, 15, "R"));
		assertEquals(
				"Computerpool in einem Geb�ude ohne Beamer Abfrage bei vorhandenen Beamer ist nicht korrekt",
				S1, rm1.getMatchingRoomInABuilding(false, 0, 15, "R"));
//		assertEquals(
//				"Computerpool in einem Geb�ude mit Beamer Abfrage bei nicht vorhandenen Beamer ist nicht korrekt",
//				S3, rm2.getMatchingRoomInABuilding(true, 0, 15, "R"));//!!!Fehler 7 wenn kein beamer Vorhanden aber einer gefragt wird Fehler
		S2.add(R2);
		assertEquals(
				"Computerpool in einem Geb�ude ohne Beamer Abfrage bei nicht vorhandenen Beamer ist nicht korrekt",
				S2, rm2.getMatchingRoomInABuilding(false, 0, 15, "R"));
		// Grenzwert Abfragen
		assertEquals(
				"Computerpool in einem Geb�ude Grenzwertabfrage bei Raumgr��e ist im Maximalwert nicht korrekt",
				S1, rm1.getMatchingRoomInABuilding(true, 0, 16, "R"));
		assertEquals(
				"Computerpool in einem Geb�ude Grenzwertabfrage bei Werten oberhalb der Grenze ist nicht korrekt",
				S3, rm1.getMatchingRoomInABuilding(true, 0, 17, "R"));
		assertEquals(
				"Computerpool in einem Geb�ude Grenzwertabfrage bei Wert 0 ist nicht korrekt",
				S1, rm1.getMatchingRoomInABuilding(true, 0, 0, "R"));
		assertEquals(
				"Computerpool in einem Geb�ude Grenzwertabfrage bei Wert -1 ist nicht korrekt",
				S1, rm1.getMatchingRoomInABuilding(true, -1, -1, "R"));// ???
																		// negative
																		// Pl�tze
																		// ???
		// gemischte Abfragen Beamer und oberer Grenzwert
		assertEquals(
				"Computerpool in einem Geb�ude  mit Beamer Abfrage bei vorhandenen Beamer und oberen Grenzwert ist nicht korrekt",
				S1, rm1.getMatchingRoomInABuilding(true, 0, 16, "R"));
		assertEquals(
				"Computerpool in einem Geb�ude ohne Beamer Abfrage bei vorhandenen Beamer und oberen Grenzwert ist nicht korrekt",
				S1, rm1.getMatchingRoomInABuilding(false, 0, 16, "R"));
//		assertEquals(
//				"Computerpool in einem Geb�ude mit Beamer Abfrage bei nicht vorhandenen Beamer und oberen Grenzwert ist nicht korrekt",
//				S3, rm2.getMatchingRoomInABuilding(true, 0, 16, "R"));
		assertEquals(
				"Computerpool in einem Geb�ude ohne Beamer Abfrage bei nicht vorhandenen Beamer und oberen Grenzwert ist nicht korrekt",
				S2, rm2.getMatchingRoomInABuilding(false, 0, 16, "R"));
		// gemischte Abfragen Beamer und oberhalb des Grenzwertes
		assertEquals(
				"Computerpool in einem Geb�ude mit Beamer Abfrage bei vorhandenen Beamer und oberhalb des Grenzwertes ist nicht korrekt",
				S3, rm1.getMatchingRoomInABuilding(true, 0, 17, "R"));
		assertEquals(
				"Computerpool in einem Geb�ude ohne Beamer Abfrage bei vorhandenen Beamer und oberhalb des Grenzwertes ist nicht korrekt",
				S3, rm1.getMatchingRoomInABuilding(false, 0, 17, "R"));
		assertEquals(
				"Computerpool in einem Geb�ude mit Beamer Abfrage bei nicht vorhandenen Beamer und oberhalb des Grenzwertes ist nicht korrekt",
				S3, rm2.getMatchingRoomInABuilding(true, 0, 17, "R"));
		assertEquals(
				"Computerpool in einem Geb�ude ohne Beamer Abfrage bei nicht vorhandenen Beamer und oberhalb des Grenzwertes ist nicht korrekt",
				S3, rm2.getMatchingRoomInABuilding(false, 0, 17, "R"));
		// Abfragen der Vorhandenen PC Pl�tze
//		assertEquals(
//				"Computerpool in einem Geb�ude oberer Grenzwert Abfrage ist nicht korrekt",
//				S1, rm1.getMatchingRoomInABuilding(true, 16, 15, "R"));//!!!Fehler 8 Wenn oberer Grenzwert des Computerpools erreicht!!
		assertEquals(
				"Computerpool in einem Geb�ude oberhalb des Grenzwertes Abfrage ist nicht korrekt",
				S3, rm1.getMatchingRoomInABuilding(true, 17, 15, "R"));
		// Abfragen ob der Raum im Geb�ude ist
		assertEquals(
				"Computerpool in einem Geb�ude oberer Grenzwert Abfrage ist nicht korrekt",
				S3, rm1.getMatchingRoomInABuilding(true, 16, 15, "T"));
		assertEquals(
				"Computerpool in einem Geb�ude oberhalb des Grenzwertes Abfrage ist nicht korrekt",
				S3, rm1.getMatchingRoomInABuilding(true, 17, 15, "T"));
		assertEquals(
				"Computerpool in einem Geb�ude oberer Grenzwert Abfrage ist nicht korrekt",
				S3, rm1.getMatchingRoomInABuilding(true, 16, 16, "T"));
		assertEquals(
				"Computerpool in einem Geb�ude oberhalb des Grenzwertes Abfrage ist nicht korrekt",
				S3, rm1.getMatchingRoomInABuilding(true, 17, 15, "R"));
		assertEquals(
				"Computerpool in einem Geb�ude oberhalb des Grenzwertes Abfrage ist nicht korrekt",
				S3, rm1.getMatchingRoomInABuilding(true, 15, 17, "R"));
	}

}
