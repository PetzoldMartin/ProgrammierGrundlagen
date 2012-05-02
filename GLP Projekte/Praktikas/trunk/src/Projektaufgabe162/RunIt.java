package Projektaufgabe162;

public class RunIt extends Thread implements Runnable {

	/**
	 * @param args
	 */
	public RunIt() {
		this.setDaemon(true);

	}

	@Override
	public void run() {
		for (int i = 1; true; i++) {

			// long millisToWaitx = 1000;
			// long millisx = System.currentTimeMillis();
			// while ((System.currentTimeMillis() - millisx) < millisToWaitx) {
			// }
			long millisToWaitx = 1000;

			try {
				while (true) {

					System.out.println("läuft noch");
					sleep(millisToWaitx);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
