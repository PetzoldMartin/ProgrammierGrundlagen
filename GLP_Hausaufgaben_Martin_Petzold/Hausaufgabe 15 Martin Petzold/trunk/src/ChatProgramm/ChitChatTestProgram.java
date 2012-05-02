package ChatProgramm;

/**
 * @author Aismael
 *
 */
public class ChitChatTestProgram {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ChatServer CS= new ChatServer();
		ChatClient CC1= new ChatClient( CS, "ChatServerNr1");
		ChatClient CC2= new ChatClient( CS, "ChatServerNr2");
		CC1.start();
		CC2.start();
		
		
		

	}

}
