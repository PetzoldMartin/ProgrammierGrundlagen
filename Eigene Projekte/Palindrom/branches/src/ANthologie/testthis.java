package ANthologie;



import org.junit.Test;

public class testthis {

	@Test
	public void test() {
		ThreadManager tm = new ThreadManager(2);
		tm.initThreads();
		tm.startThreads();
	}

}
