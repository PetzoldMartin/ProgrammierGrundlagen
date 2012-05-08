package Hausaufgabe_16_Martin_Petzold;

public class mainHA16 extends Thread {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		ManyInterruptsDemo I1 = new ManyInterruptsDemo();
		ManyInterruptsDemo I2 = new ManyInterruptsDemo();
		I1.start();
		I2.start();
		while(true){
			I1.interrupt();
			I2.interrupt();
			sleep(50);
			if(I1.getState() == State.TERMINATED&&I2.getState() == State.TERMINATED){
				break;
			}
		}
		System.out.println("ihr Mainthread wurde beeendet");
		

	}

}
