package Hausaufgabe_18_Martin_Petzold;

public class LogicDemos {
	/**
	 * 
	 * @param i die Temperatur in Palo Alto
	 * @param b Boolean für Sommer oder Winter
	 * @return boolean ob Eichörnchen spielen
	 */
	public boolean squirrelPlay(int i, boolean b) {
		
		if (b && i > 60 && i < 100) {
			return true;
		} else {
			if (!b && i > 60 && i < 90) {
				return true;
			}else{
				return false;
			}

		}
	}
	/**
	 * 
	 * @param a erste Zahl
	 * @param b zweite Zahl
	 * @param c Dritte Zahl
	 * @return das Ergebniss
	 */
	public int luckySum(int a,int b, int c)
	{
		switch(a){
		case 13:return 0;
		default:
			switch(b){
			case 13:return a;
			default:
				switch(c){
				case 13:return a+b;
				default:return a+b+c;
					
				}
			}
		}
	}

}
