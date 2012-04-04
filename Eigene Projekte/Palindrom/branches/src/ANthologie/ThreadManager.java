package ANthologie;

import java.math.BigInteger;

public class ThreadManager {
	private int anzThreads;
	private Thread[] threads;
	public BigInteger u1 = BigInteger.valueOf(0);
	public BigInteger u2 = BigInteger.valueOf(0);
	public ThreadManager(int anz){
		anzThreads = anz;
		threads = new Thread[anzThreads];
	}
	public void initThreads(){
		for (int i = 0; i < anzThreads; i++) {
			u1 = BigInteger.valueOf(i);
			u2 = BigInteger.valueOf(anzThreads);
			threads[i] = new Thread(new Coreoptifi(u1, u2));
		}
	}
	
	public void startThreads(){
		for(int i = 0; i < anzThreads; i++){
			threads[i].start();
		}
	}
}
