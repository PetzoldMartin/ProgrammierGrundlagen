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
		assertTrue(s1.squirrelPlay(70, false));
		assertFalse(s1.squirrelPlay(95, false));
		assertTrue(s1.squirrelPlay(95, true));
	}
	@Test
	public void testluckySum() {
		assertEquals(s1.luckySum(1, 2, 3), 6);
		assertEquals(s1.luckySum(1, 2, 13), 3);
		assertEquals(s1.luckySum(1, 13, 3), 1);
	}

}
