package ANthologie;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ThreadManager tm = new ThreadManager(16);
		tm.initThreads();
		tm.startThreads();
		
	}

	
		
	}

