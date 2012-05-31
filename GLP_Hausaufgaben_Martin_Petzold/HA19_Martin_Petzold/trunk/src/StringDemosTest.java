import static org.junit.Assert.*;

import  org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class StringDemosTest {
	
	private StringDemos StringDemos;
	@Before
	public void setUp() throws Exception {
		
		StringDemos = new StringDemos();
	}
	
@Test
public void testCountHi() {
assertEquals(1, StringDemos.countHi("abc hi ho"));
assertEquals(2, StringDemos.countHi("ABChi hi"));
assertEquals(2, StringDemos.countHi("hihi"));
assertEquals(4, StringDemos.countHi("hihi ho hi la di hi"));
assertEquals(3, StringDemos.countHi("hiririhhihi"));
}


@Test
public void testCountYZ() {
assertEquals(2, StringDemos.countYZ("fez day"));
assertEquals(2, StringDemos.countYZ("day fez"));
assertEquals(2, StringDemos.countYZ("day fyyyz"));
assertEquals(1, StringDemos.countYZ("dayof fyyyzk z"));
}
}