package HA21_Martin_Petzold;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 
 * @author Martin Petzold
 *
 * die Temperatur Konverter Gui Klasse
 */
public class TemperaturConverterGUI extends JFrame {

	private static final long serialVersionUID = 1L;//die Jframe ID hier die StandartID
	private JButton fahrToCelsius;//Button für die Fahrenheit zu Celsius Konvertierung
	private JButton celsiusToFahr;//Button für die Celsius zu Fahrenheit Konvertierung
	private JButton reset;// Button für den Reset
	private JTextField fahr;// Textfeld zur Fahrenheit ein und Ausgabe
	private JTextField celsius;// Textfeld zur Celsius ein und Ausgabe
	private TemperaturConverter TC;//der Temperatur KonvertRechner der GUI
	private String stat;//Der Status String
	private JLabel fahrLabel, celsiusLabel;//Die AnzeigeLabel über den Eingabefeldern

	/**
	 * Der Konstruktor Der GUI mit Grafikeinstellungen,Layout etc.
	 */
	public TemperaturConverterGUI() {
		super("TemperaturConverterGUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TC = new TemperaturConverter();
		fahrToCelsius = new JButton("to Celsius");
		celsiusToFahr = new JButton("to Fahr");
		reset = new JButton("Reset");
		fahr = new JTextField("Fahrenheit eingeben");
		celsius = new JTextField("Celsius eingeben");
		fahrLabel = new JLabel("Fahrenheit");
		celsiusLabel = new JLabel("Celsius");
		fahrLabel.setForeground(Color.RED);
		celsiusLabel.setForeground(Color.BLUE);
		fahrLabel.setFont(new Font("Arial", Font.BOLD, 35));
		celsiusLabel.setFont(new Font("Arial", Font.BOLD, 35));
		celsius.setFont(new Font("Arial", Font.BOLD, 18));
		fahr.setFont(new Font("Arial", Font.BOLD, 18));
		this.add(fahrLabel);
		this.add(celsiusLabel);
		this.add(fahr);
		this.add(celsius);
		this.add(fahrToCelsius);
		this.add(celsiusToFahr);
		this.add(reset);
		setSize(400, 400);
		setLayout(new GridLayout(4, 2));
		setVisible(true);
		addActionListener(reset);
		addActionListener(celsiusToFahr);
		addActionListener(fahrToCelsius);

	}

	/**
	 * Erstellen/und Zuordnung eines Listeners für einen Button
	 * @param toListen der zuzuordnende Button
	 */
	private void addActionListener(JButton toListen) {
		toListen.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				stat = e.getActionCommand();
				berechnung();

			}
		});

	}

	/**
	 * Die Auswertung der Eingaben nachdem ein Button gedrückt wurde
	 */
	private void berechnung() {

		try {
			switch (stat) {
			case "Reset":
				celsius.setText("Celsius eingeben");
				fahr.setText("Fahrenheit eingeben");

				break;
			case "to Celsius":
				TC.setFahr(Double.valueOf(fahr.getText()));
				Outtput();
				break;
			case "to Fahr":
				TC.setCelsius(Double.valueOf(celsius.getText()));
				Outtput();
				break;
			}
		} catch (NumberFormatException e) {
			stat = "Reset";
			berechnung();
		}

	}

	/**
	 * die Ausgabe der Werte nach Erfolgreicher Berechnung
	 */
	private void Outtput() {
		Double celsiusz = (double) Math.round(TC.getCelsius() * 100) / 100;
		Double fahrz = (double) Math.round(TC.getFahr() * 100) / 100;
		celsius.setText(celsiusz.toString());
		fahr.setText(fahrz.toString());
	}

	/**
	 * Mainklasse zur Demonstration
	 * @param args
	 */
	public static void main(String[] args) {

		new TemperaturConverterGUI();
	}

}
