package TI4;

import java.math.*;

public class Zahlenwürfelung {

	public BigInteger stellen = new BigInteger("20");
	public BigInteger Anfang = new BigInteger("0");
	public BigInteger drei = new BigInteger("3");
	public int wert0 = 0;
	public int wert1 = 1;
	public int wert2 = 2;
	public String Ergebniss = "kein Ergebniss";
	public String x = "kein Ergebniss";

	public Zahlenwürfelung() {
		Anfang = stellen.subtract(new BigInteger("1"));
		numberLines();

	}

	// s = s.substring(0, s.length() - 1)
	// string.substring(from, to)
	public String numberLines() {
		String numberLines = ("0");
		int test= 0;
		int test2 = 0;
		PalindromAbgleich X = new PalindromAbgleich(numberLines);
		for (long i = drei.pow(stellen.intValue()).longValue()
				- drei.pow(Anfang.intValue()).longValue(); i < drei.pow(
				stellen.intValue()).longValue(); i++) {
			// System.out.println(i);
			// System.out.println(Long.toString(i, 3)); // Trinär
			numberLines = Long.toString(i, 3);
			X = new PalindromAbgleich(numberLines);
//			System.out.println(X);
			x = X.ErweiterungAufPalindrom();
			Ergebnis(x);
//			System.out.println(x);
			test++;
			if (test%1000000==0)
				{test2+=30;
				System.out.println("1 Million geschafft"+"das Programm hat schon "+test2+" Zeitpoints Absolviert" );
				}

		}
		System.out.println("\n" + "Die Konstruktfolgen sind Initialisiert");
		System.out.println(Ergebniss);
		return Ergebniss;
	}

	public boolean Palindrom2(String ce, int ec) {

		boolean p2 = false;

		for (int i = 0; i < ec; i++) {
			if (ce.startsWith("2")) {
				ce = ce.substring(1);
			}

			if (ce.length() == 0) {
				p2 = true;
			}

			else {

				p2 = false;
			}

		}
		return p2;

	}

	public void Ergebnis(String Eingabe) {
		if (Eingabe.contains("nichts"))
			;
		else if (Ergebniss.length() > Eingabe.length())
			Ergebniss = Eingabe;
	}
}
