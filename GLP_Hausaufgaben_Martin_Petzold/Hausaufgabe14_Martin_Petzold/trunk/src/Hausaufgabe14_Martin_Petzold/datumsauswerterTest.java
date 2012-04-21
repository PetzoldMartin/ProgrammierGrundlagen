package Hausaufgabe14_Martin_Petzold;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class datumsauswerterTest {

	private String[] testObjecte;
	@Before
	public void setUp() throws Exception {
		testObjecte = new String[9];
		testObjecte[1]="Test";
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testParseDate() {
		assertTrue(datumsauswerter.parseDate("19.04.2012"));
		assertFalse(datumsauswerter.parseDate("das ist kein Datum"));
	}
	@Test (expected  = ArrayIndexOutOfBoundsException.class)
	public void testaccessObjectInArrey(){
	
		assertTrue(datumsauswerter.accessObjectInArrey(testObjecte, 1)=="Test");
		assertTrue(datumsauswerter.accessObjectInArrey(testObjecte,2)==null);
		assertTrue(datumsauswerter.accessObjectInArrey(testObjecte, 10)=="Test");

	
	}
}
