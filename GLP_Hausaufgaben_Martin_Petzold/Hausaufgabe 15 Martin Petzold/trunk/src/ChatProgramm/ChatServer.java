package ChatProgramm;

/**
 * @author Martin Petzold
 * Die Klasse Die einen Chat Server simuliert
 * Erbt von der Klasse Thread und kann deren Methoden nutzen
 * 
 */
public class ChatServer extends Thread {
	/**
	 * Der Wert der die Nachrichtenanzahl z�hlt
	 */
	public int counter;

	/**
	 * Konstruktor der den Counter Initialisiert
	 */
	public ChatServer() {
		counter = 1;
	}
	/**
	 * Gibt die Nachrichten die auf dem ChatServer eingehen auf der Konsole aus
	 * @param message die Auszugebende Nachricht
	 * @throws InterruptedException
	 */
	public void printMessage(String message)  {
		/**
		 * Ver�nderungen der Counter ist  Gesch�tzt das wenn eine Nachricht ausgegeben wird und
		 * der Nachruichtenz�hler erh�ht wird kein anderer ChatClient zur gleichen Zeit
		 * auf den Counter zugreifen kann
		 */
		System.out.println(message + " Counter" + counter);
		long i = (long) Math.random() * 5;
		try {
			sleep(i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		synchronized (this) {
			
			counter++;

		}
		
		

	}

}
