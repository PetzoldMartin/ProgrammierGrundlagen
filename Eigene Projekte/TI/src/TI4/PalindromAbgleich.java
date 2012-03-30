package TI4;



public class PalindromAbgleich {

	
	public String Konstrukt;

	public PalindromAbgleich(String kString) {
		Konstrukt=kString;
		//System.out.println(ErweiterungAufPalindrom());
	}

	public String ErweiterungAufPalindrom() {

			String M = "c";
			
			String Ausgabe = Konstrukt;
			while(!Konstrukt.equals("")){
			M = Erweiterung(M, DasErsteGlied(Konstrukt));
			Konstrukt = Konstrukt.substring(1);
			}
			if (vergleich(M)) {
				return Ausgabe + "\n" + M;
			}
		
		return "nichts";

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

	private int DasErsteGlied(String Eingang) {
		if (Eingang.startsWith("0"))
			return 0;
		if (Eingang.startsWith("1"))
			return 1;
		if (Eingang.startsWith("2"))
			return 2;
		return 3;

	}

	public boolean vergleich(String forward) {
		String backward = new StringBuffer(forward).reverse().toString();
		if (forward.equals(backward)) {
			// System.out.print("gleich");
			return true;
		} else {
			// System.out.print("ungleich");
			return false;
		}
	}

}
