package HA21_Martin_Petzold;

/**
 * 
 * @author Martin Petzold
 * Die Temperatur Konverter Klasse
 */
public class TemperaturConverter {
	
	private double fahr,celsius;//die Werte für Fahrenheit und Celsius
	/**
	 * 
	 * @return
	 */
	public Double getFahr() {
		return fahr;
	}
	/**
	 * 
	 * @return
	 */
	public Double getCelsius() {
		return celsius;
	}
	/**
	 * Setzt den Fahrenheit-Wert
	 * und passt den Celsius-Wert an
	 * @param fahr
	 */
	public void setFahr(double fahr) {
		this.fahr = fahr;
		this.celsius=umrechnungFahrToCelsius(fahr);
	}
	/**
	 * Setzt den Celsius-Wert
	 * und passt den Fahrenheit-Wert an
	 * @param celsius
	 */
	public void setCelsius(double celsius) {
		this.celsius = celsius;
		this.fahr=umrechnungCelsiusToFahr(celsius);
	}
	/**
	 * 
	 * @param fahr
	 * @return celsius
	 */
	private double umrechnungFahrToCelsius(double fahr)
	{
		return (fahr - 32) * 5/9;
		
	}
	/**
	 * 
	 * @param celsius
	 * @return fahr
	 */
	private double umrechnungCelsiusToFahr(double celsius)
	{
		return(celsius * 9/5) + 32;
		
	}
	

}
