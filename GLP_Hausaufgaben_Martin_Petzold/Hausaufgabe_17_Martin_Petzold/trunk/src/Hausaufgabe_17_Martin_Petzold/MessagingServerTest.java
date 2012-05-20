package Hausaufgabe_17_Martin_Petzold;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
public class MessagingServerTest {
Message m1;
Message m2;
MessagingServer s;
@Before
public void setUp() throws Exception {
m1 = new Message(MessageType.ADD, "5 4");
m2 = new Message(MessageType.SUB, "8 2");
s = new MessagingServer();
}
@Test
public void testCreateResponse() {
assertEquals("9", s.createResponse(m1));
assertEquals("6", s.createResponse(m2));
}
}