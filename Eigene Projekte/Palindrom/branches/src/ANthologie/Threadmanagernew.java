package ANthologie;

import java.math.*;

public class Threadmanagernew {
	private int Threadzahl;
	private Thread[] threads;
	private BigInteger zahli = BigInteger.valueOf(0);
	private BigInteger zahl2 = BigInteger.valueOf(0);

	public Threadmanagernew(BigInteger zahl) {
		zahli = zahl;
		Threadzahl = zahl.intValue();
		threads = new Thread[4];
		new Coreoptifi(BigInteger.valueOf(1), zahli);
		new Coreoptifi(BigInteger.valueOf(0), zahli);
		
		
	}

	public void initThreads() {
		for (int i = 0; i < Threadzahl; i++) {
			zahl2 = zahl2.add(BigInteger.valueOf(1));
			threads[i] = new Thread(new Coreoptifi(zahl2.divide(BigInteger.valueOf(1)), zahli));
		}
	}

	public void startThreads() {
		for (int i = 0; i < Threadzahl; i++) {
			threads[i].start();
		}
	}
}
