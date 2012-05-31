public class StringDemos {

	int countHi(String Eingabe) {
		char[] f = new char[Eingabe.length()];
		f = Eingabe.toCharArray();
		int count = 0;
		for (int i = 0; i < Eingabe.length() - 1; i++) {
			if ('h' == f[i]) {
				if ('i' == f[i + 1]) {
					count++;
				}
			}
		}
		return count;

	}

	int countYZ(String Eingabe) {
		char[] f = new char[Eingabe.length()];
		f = Eingabe.toCharArray();
		int count = 0;
		for (int i = 1; i < Eingabe.length(); i++) {
			if ('y' == f[i] || 'z' == f[i]) {
				if (i == Eingabe.length() - 1) {
					count++;
				} else {
					if (!Character.isLetter(f[i + 1])) {
						count++;
					}
				}

			}
		}
		return count;

	}

}
