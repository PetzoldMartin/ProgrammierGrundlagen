package ChatProgramm;

/**
 * @author Martin Petzold
 * Die Klasse die die ChatClients simuliert
 * Erbt von der Klasse Thread und kann deren Methoden nutzen
 * implementiert das Interface Runnable
 *
 */

public class ChatClient extends Thread implements Runnable {
	/**
	 * Die Auszugebende Nachricht
	 */

	private String message;
	/**
	 * Der ChatServer den der Chat Client benutzt
	 */
	
	private ChatServer CS;

	/**
	 * Der Konstruktor des Chat Clients 
	 * der die Auszugebende Nachricht annimmt und den zu benutzenden Chatserver
	 * @param CS Die Auszugebende Nachricht
	 * @param message Der ChatServer den der Chat Client benutzt
	 */
	/**
	 * @param CS
	 * @param message
	 */
	public ChatClient(ChatServer CS, String message) {
		this.CS = CS;
		this.message = message;
	}

	/* 
	 * Definiert die runmethode des Interfaces Runnable
	 */
	@Override
	 
	public void run() {
		for (int i = 1; i <= 15; i++) {
			try {
					CS.printMessage(message);
				
				long i2 = (long) Math.random() * 3;
				sleep(i2);

			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}

		}

	}

}
