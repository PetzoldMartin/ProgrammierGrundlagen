package ANthologie2;

import java.math.*;


public class ThePalindromEnd {

	public BigInteger zahl1 = BigInteger.valueOf(0);
	public BigInteger zahl2 = BigInteger.valueOf(999999999);
	public BigInteger zahl3 = BigInteger.valueOf(100);
	public BigInteger zahl4 = BigInteger.valueOf(10);
	public String ce;
	public String ec;
	public String cc = new String("unendlich");
	public String cc2;
	public String ccc = new String("0");
	public String ccc2;
	public static BigInteger Highscore = BigInteger.valueOf(0);
	public BigInteger zahl5 = BigInteger.valueOf(10);
	private static int threads = -1;
	private BigInteger myID;
	

	public ThePalindromEnd(BigInteger anfang, BigInteger schritt) {
		threads++;
		myID = new BigInteger(String.valueOf(threads));
		
		
		for (BigInteger z2 = anfang; vergleich(z2); z2 = z2.add(schritt)) {
			if (umdreh(z2) == true)
				;
			else if (umdreh(z2.pow(2)) == true)
				if ((groesser(quersumme(z2), Highscore))) {
					Highscore = quersumme(z2);
					zahl5=z2;
					System.out.println(this.toString());
				}
		}

	}
	
	public String toString()
	{ return (zahl5 + "   " + quersumme(zahl5)  + " @Thread: " + myID + "\n");
	}

	
	public boolean umdreh(BigInteger zahl5) {
		ce = String.valueOf(zahl5);
		ec = new StringBuffer(ce).reverse().toString();
		if (ce.equals(ec)) {
			// System.out.print("Die Zahl " + zahl5 + " ist ein Palindrom\n");
			return true;
		} else {
			// System.out.print("Die Zahl " + zahl5 + " ist kein Palindrom\n");
			return false;
		}
	}

	public boolean vergleich(BigInteger zahl5) {
		cc2 = String.valueOf(zahl5);
		if (cc2.equals(cc)) {
			// System.out.print("gleich");
			return false;
		} else {
			// System.out.print("ungleich");
			return true;
		}
	}

	public boolean vergleich2(BigInteger zahl5) {
		ccc2 = String.valueOf(zahl5);
		if (ccc2.equals(ccc)) {
			// System.out.print("gleich");
			return false;
		} else {
			// System.out.print("ungleich");
			return true;
		}
	}

	public BigInteger quersumme(BigInteger zu) {
		BigInteger hsh = BigInteger.valueOf(0);
		while (vergleich2(zu)) {
			hsh = hsh.add(zu.mod(BigInteger.valueOf(10)));
			zu = zu.divide(BigInteger.valueOf(10));
		}
		return hsh;
	}

	public boolean groesser(BigInteger one, BigInteger two) {
		if ((one.max(two) == one)) {
			return true;
		} else {
			return false;
		}
	}
}
// http://openbook.galileodesign.de/javainsel5/javainsel05_004.htm#Rxx747java050040400019E1F01E100
// http://openbook.galileocomputing.de/javainsel/javainsel_18_007.html#dodtp1e62b182-5283-434f-920d-9356e2ace07b

