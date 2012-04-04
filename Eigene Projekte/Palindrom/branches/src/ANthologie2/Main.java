package ANthologie2;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ThreadManager tm = new ThreadManager(2);
		tm.initThreads();
		tm.startThreads();
		System.out.println("fertig");
		
	}
	public static void main2() {
		ThreadManager tm = new ThreadManager(16);
		tm.initThreads();
		tm.startThreads();
		System.out.println("fertig");
		
	}
	
		
	}

