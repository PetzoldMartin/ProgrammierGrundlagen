package Hausaufgabe_18_Martin_Petzold;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LogicDemosTest {

	private LogicDemos s1;

	@Before
	public void setUp() throws Exception {
		s1 = new LogicDemos();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSquirrelPlay() {
		//Sommer Testfälle der Grenzwerte für SquirrelPlay
		assertTrue("obere Temperaturgrenze Sommer",s1.squirrelPlay(99, true));
		assertFalse("über der oberen Temperaturgrenze Sommer",s1.squirrelPlay(100, true));
		assertTrue("untere Temperaturgrenze Sommer",s1.squirrelPlay(61, true));
		assertFalse("unter der unteren Temperaturgrenze Sommer",s1.squirrelPlay(60, true));
		//Winter Testfälle der Grenzwerte für SquirrelPlay
		assertTrue("obere Temperaturgrenze Winter",s1.squirrelPlay(89, false));
		assertFalse("über der oberen Temperaturgrenze Winter",s1.squirrelPlay(90, false));
		assertTrue("untere Temperaturgrenze Winter",s1.squirrelPlay(61, false));
		assertFalse("unter der unteren Temperaturgrenze Winter",s1.squirrelPlay(60, false));
		//AnleitungsTestfälle
		assertTrue("Testfall 1 Anleitung",s1.squirrelPlay(70, false));
		assertFalse("Testfall 2 Anleitung",s1.squirrelPlay(95, false));
		assertTrue("Testfall 3 Anleitung",s1.squirrelPlay(95, true));
	}
	@Test
	public void testluckySum() {
		//Geordnete Testfälle luckySum
		assertEquals("13 an erster Stelle",s1.luckySum(13, 2, 3), 0);
		assertEquals("13 an zweiter Stelle",s1.luckySum(1, 13, 3), 1);
		assertEquals("13 an dritter Stelle",s1.luckySum(1, 2, 13), 3);
		assertEquals("13 an den ersten zwei Stelle",s1.luckySum(13, 13, 3), 0);
		assertEquals("13 an den letzten zwei Stelle",s1.luckySum(1, 13, 13), 1);
		assertEquals("13 an allen drei Stellen",s1.luckySum(13, 13, 13), 0);
		assertEquals("ohne 13",s1.luckySum(1, 2, 3), 6);
		
		//AnleitungsTestfälle
		assertEquals("Testfall 1 Anleitung",s1.luckySum(1, 2, 3), 6);
		assertEquals("Testfall 2 Anleitung",s1.luckySum(1, 2, 13), 3);
		assertEquals("Testfall 3 Anleitung",s1.luckySum(1, 13, 3), 1);
	}

}
