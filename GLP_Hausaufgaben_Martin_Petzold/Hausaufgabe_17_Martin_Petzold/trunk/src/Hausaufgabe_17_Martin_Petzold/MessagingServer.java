package Hausaufgabe_17_Martin_Petzold;

public class MessagingServer {
	private Integer z,y;

	/**
	 * 
	 * Nachrichtenauswertung
	 * @param message - die auszuwertende Nachricht
	 * @return das Ergebniss
	 */
	public String createResponse(Message message) {
		String ergebniss = null;
		switch (message.type) {
		case ADD:
			ergebniss = Berechnung(message.payload, true);
			break;
		case SUB:
			ergebniss = Berechnung(message.payload, false);
			break;
		}
		return ergebniss;

	}

	/**
	 * 
	 * @param payload der String der Nachricht
	 * @param b Boleean für berechnung nach ADD oder SUB
	 * @return das Ergebniss
	 */
	private String Berechnung(String payload, boolean b) {
		z = y = 0;
		char[] k = new char[payload.length()];
		k = payload.toCharArray();
		
		for (char x : k) {
			try {
				y = Integer.valueOf(String.valueOf(x));
				if (b == true) {
					z += y;
				}
				if (b == false) {
					z -= y;
				}

			} catch (NumberFormatException e) {

			}

		}
		
		if (b == false) {
			z = z + (Integer.valueOf(String.valueOf(k[0]))) * 2;
		}
		payload = z.toString();
		return payload;

	}

}
