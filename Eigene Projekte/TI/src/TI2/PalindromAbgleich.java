package TI2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;

public class PalindromAbgleich {

	private ArrayList<String> Konstrukfolgen;

	public PalindromAbgleich() {
		Konstrukfolgen = new Zahlenwürfelung().numberLines();
	}

	public String ErweiterungAufPalindrom() {
		
		Iterator<String> it = Konstrukfolgen.iterator();
		while (it.hasNext()) {
			String M = "c";
			String Konstrukt = it.next();
			M = Erweiterung(M, DasLetzteGlied(Konstrukt));
			Konstrukt=Konstrukt.substring(0,Konstrukt.length()-1);
			if(vergleich(M))
			{
				return it.next()+M;
			}
		}
		return null;

	}

	private String Erweiterung(String s, int f) {
		if (f == 0) {
			return "a" + s + "b";
		}
		if (f == 1) {
			return "ba" + s + "a";
		}
		if (f == 2) {
			return "b" + s + "bab";
		} else
			return null;
	}

	private int DasLetzteGlied(String Eingang) {
		return 0;
	}

	public boolean vergleich(String forward) {
		String backward = new StringBuffer(forward).reverse().toString();
		if (forward.equals(backward)) {
			// System.out.print("gleich");
			return false;
		} else {
			// System.out.print("ungleich");
			return true;
		}
	}

}
