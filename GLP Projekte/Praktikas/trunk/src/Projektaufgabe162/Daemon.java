package Projektaufgabe162;

public class Daemon  extends Thread implements Runnable {
	public Daemon() {
		new RunIt().start();
		try {
				sleep(3000);
				System.out.println("main-Methode fertig");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
