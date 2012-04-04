package ANthologie2;

import java.math.BigInteger;
import java.util.ArrayList;

public class Coreoptifi implements Runnable{
static ArrayList<Integer> thid;
public BigInteger startstep = BigInteger.valueOf(0);
public BigInteger step = BigInteger.valueOf(0);
	public Coreoptifi (BigInteger startstep,BigInteger step)
	{
		super();
		this.startstep=startstep;
		this.step=step;
		//this.run();
	}
	public void run() {
		new ThePalindromEnd(startstep, step);
		
		
	}

}
