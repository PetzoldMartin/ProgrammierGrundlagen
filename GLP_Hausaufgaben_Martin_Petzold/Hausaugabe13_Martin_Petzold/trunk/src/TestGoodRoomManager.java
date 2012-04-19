import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestGoodRoomManager {
	RoomManager rm1,rm2,rm3,rm4,rm5,rm6,rm7;
	Room R1,R2,R3,R4,R5,R6,R7;
	ArrayList<Room> S1,S2,S3,S4,S5,S6,S7;
	@Before
	public void setUp() throws Exception {
		rm1= new GoodRoomManager();
		rm2= new GoodRoomManager();
		rm3= new GoodRoomManager();
		rm4= new GoodRoomManager();
		rm5= new GoodRoomManager();
		rm6= new GoodRoomManager();
		rm7= new GoodRoomManager();
		R1 = new Room("100",true,16,true,"R",16);
		R2 = new Room("100",false,16,true,"R",16);
		R3 = new Room("100",true,17,true,"R",16);
		R4 = new Room("100",true,16,false,"R",16);
		R5 = new Room("100",true,16,true,"T",16);
		R6 = new Room("100",true,16,true,"R",17);
		R7 = null;
		S1=new ArrayList<Room>();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testregisterRoom() {
		assertFalse("Die RoomManager sind nicht voneinander Unabhängig",rm1.equals(rm2));
		rm1.registerRoom(null);
		rm1.registerRoom(new Room("100",true,16,true,"R",16));
		for(Integer i=2;i<=1000;i++)
		{
			
			try {
				rm1.registerRoom(new Room(i.toString(),true,16,true,"R",16));

			} catch (ArrayIndexOutOfBoundsException expected) {

				fail("Der Room Manager kann nur " + i + " Rooms fassen");
			}
		}
	
	}
	@Test
	public void testgetMatchingRooms() {
		rm1.registerRoom(R1);
		rm2.registerRoom(R2);
		rm3.registerRoom(R3);
		rm4.registerRoom(R4);
		rm5.registerRoom(R5);
		rm6.registerRoom(R6);
		rm7.registerRoom(R7);
		S1.add(R1);
		rm1.getMatchingRooms(true, 16);
        assertEquals(rm1.getMatchingRooms(true, 16),S1);
		
	}


	@Test
	public void testgetMatchingComputerPools() {
		fail("Not yet implemented");
	}

	@Test
	public void testgetMatchingRoomInABuilding() {
		fail("Not yet implemented");
	}
	@Test
	public void testdeleteRoom() {
		fail("Not yet implemented");
	}

	

}
