import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestGoodRoomManager {
	RoomManager rm1,rm2;
	@Before
	public void setUp() throws Exception {
		rm1 = new GoodRoomManager();
		rm2 = new GoodRoomManager();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testregisterRoom() {
		assertFalse("Die RoomManager sind nicht voneinander Unabhängig",rm1.equals(rm2));
		rm1.registerRoom(null);
		rm1.registerRoom(new Room("100",true,16,true,"R",16));
	
	}

	@Test
	public void testdeleteRoom() {
		fail("Not yet implemented");
	}

	@Test
	public void testgetMatchingRooms() {
		fail("Not yet implemented");
	}

	@Test
	public void testgetMatchingComputerPools() {
		fail("Not yet implemented");
	}

	@Test
	public void testgetMatchingRoomInABuilding() {
		fail("Not yet implemented");
	}

}
