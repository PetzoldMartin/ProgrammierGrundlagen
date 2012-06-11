import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.plaf.SliderUI;

/**
 * 
 * @author Martin Petzold
 * entschuldigen sie Bitte die Komplexit�t des Prohgrammcodes 
 * ich wollte ein m�glichst universelles Zahlenschloss erstellen 
 * aus reiner faszination am Thema
 * 
 */
public class CombinationLock extends JFrame {
	private static final long serialVersionUID = 1L;// Die ID des Jframe
													// Momentan standart ID
	private JPanel panelButton;// Ein im Jframe als Komponente behandelbares
								// Jpanel mit eigenem Layout hier der Container
								// f�r die Buttons, k�nnte in diesem Beispiel
								// alles auch auf dem Jframe Realisiert werden
	private JButton[] button;// das Arreay das die Buttons enth�lt
	private Integer k;// der Z�hler f�r die Anzahl der getippten Buttons
	private Integer l;// der Z�hler f�r die Anzahl der getippten richtigen
						// Buttons
	private ActionListener ButtonListner;// der Listener f�r die Buttons
	private String[] loesung;// die Loesungskombination

	/**
	 * Der Konstruktor des {@link CombinationLock} f�r drei Ganzzahlen von 0 bis
	 * 9
	 * 
	 * @param a
	 *            der 1. Schl�sselwert
	 * @param b
	 *            der 2. Schl�sselwert
	 * @param c
	 *            der 3. Schl�sselwert
	 */
	private CombinationLock(Integer a, Integer b, Integer c) {
		String[] loesungArrey = { a.toString(), b.toString(), c.toString() };
		new CombinationLock(loesungArrey, 9);
	}

	/**
	 * Der Konstruktor des {@link CombinationLock} der die Variablen und die
	 * {@link JButton} und den {@link ActionListener} initialisiert und dem
	 * {@link JFrame} hinzuf�gt
	 * 
	 * @param loesung
	 *            das Loesungsarrey
	 * @param oberGrenze
	 *            die Die Buttonobergrenze , anzahl der buttons von 0 bis n
	 */
	public CombinationLock(String[] loesung, int oberGrenze) {
		button = new JButton[oberGrenze + 1];
		this.loesung = loesung;
		k = l = 0;
		int layoutFactor = (int) Math.sqrt(oberGrenze);
		this.setSize(layoutFactor * 100, layoutFactor * 100);
		this.setVisible(true);
		panelButton = new JPanel(new GridLayout(layoutFactor + 1,
				layoutFactor + 1, 2, 2));
		initialeListener();
		for (Integer i = 0; i <= oberGrenze; i++) {
			button[i] = new JButton(i.toString());
			panelButton.add(button[i]);
			button[i].addActionListener(ButtonListner);

		}
		if(eingabePr�fung()==false){
			System.err.println("die Loesung ist nicht mit dem Tastenfeld Loesbar");
		}

		this.add(panelButton);
	}

	/**
	 * Vergleicht die Buttoneingabe mit der Loesung
	 * 
	 * @param a
	 *            die Buttoneingabe
	 */
	private void ueberpruefung(String a) {
		k++;
		try {
			if (a.equals(loesung[k - 1])) {
				l++;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			colorChange(Color.RED);
		}

		if (k >= loesung.length) {
			if (l == loesung.length) {
				// colorChange(Color.GREEN);
				System.exit(0);
			} else {
				colorChange(Color.RED);
			}
		}

	}

	/**
	 * Wechselt die Farbe des Jframe und Jpane und der Buttons
	 * 
	 * @param c
	 *            die Farbe auf die ge�ndert wird
	 */
	private void colorChange(Color c) {
		getContentPane().setBackground(c);
		panelButton.setBackground(c);
		for (JButton j : button) {
			j.setBackground(c);
		}
	}

	/**
	 * Initialisiert den ActionListener der f�r alle Buttons zust�ndig ist
	 */
	private void initialeListener() {
		ButtonListner = new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				ueberpruefung(ae.getActionCommand());
			}
		};
	}

	/**
	 * �berpr�ft ob die Loesung mit dem Tastenfeld Gel�st werden kann
	 * @return
	 */
	private boolean eingabePr�fung() {
		int g = loesung.length;
		for (String l : loesung) {
			for (JButton r : button)
				if (r.getActionCommand().equals(l)) {
					g--;
				}
		}
		if (g == 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Alte main mit L�sungsarrey und Buttonanzahl
	 */
	// public static void main(String[] args) {
	// String[] loesungMain = { "7", "3", "5" ,"6"};
	// new CombinationLock(loesungMain, 9);
	// }

	/**
	 * main-Methode zur Demonstration des {@link CombinationLock}
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		new CombinationLock(3, 5, 7);
	}

}
