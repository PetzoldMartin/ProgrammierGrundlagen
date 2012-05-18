package Praktikum1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zeileneinleser {
	public static String einlesen() {
		BufferedReader console = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.print("Geben Sie etwas ein: ");
		String zeile = null;
		try {
			zeile = console.readLine();
		} catch (IOException e) {
			// Sollte eigentlich nie passieren
			e.printStackTrace();
		}
		System.out.println("Ihre Eingabe war: " + zeile);
		return zeile;
	}

	public String reverse(String str) {
		String umgekehrt = new String();
		for (int j = str.length() - 1; j >= 0; j--) {
			umgekehrt += str.charAt(j);
		}
		return umgekehrt;
	}

	public static void errorAusgabe() {
		System.err.println("\n" + "\n" + "Falsche Eingabe" + "\n");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
