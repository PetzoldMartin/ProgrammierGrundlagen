package Projektaufgabe161;

public class Demo100 extends Thread implements Runnable {

	/**
	 * @param args
	 */
	private static int k =10000;
	public static void main(String[] args) {
		Thread t1[] = new Thread[k];
		for (int i = 0; i < k; i++) {
			t1[i] = new Thread(new Runnable() {

				@Override
				public void run() {
					for (int i = 1; i > -1; i++) {
						System.out.println(currentThread().getId());
					}

				}
			});
			
		}
		for (int i2 = 0; i2 < k; i2++) {
			t1[i2].start();
		}
	}
}
