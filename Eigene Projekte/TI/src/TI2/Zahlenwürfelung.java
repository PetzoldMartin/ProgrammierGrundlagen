package TI2;

import java.math.*;
import java.util.ArrayList;

public class Zahlenwürfelung {

	public BigInteger stellen = new BigInteger("12");
	public BigInteger Anfang = new BigInteger("0");
	public BigInteger drei = new BigInteger("3");
	public int wert0 = 0;
	public int wert1 = 1;
	public int wert2 = 2;

	public Zahlenwürfelung() {
		
		

	}

	// s = s.substring(0, s.length() - 1)
	// string.substring(from, to)
	public ArrayList<String> numberLines() {
		String numberLines = ("0");
		String numberLinesZeroStart = ("0");
		int reward = 0;
		ArrayList<String> Numberholder = new ArrayList<String>();
		for (int i = 0; i < drei.pow(stellen.intValue()).intValue(); i++) {
			// System.out.println(i);
			System.out.println(Long.toString(i, 3)); // Trinär
			numberLines = Long.toString(i, 3);
			Numberholder.add(numberLines);
			// System.out.println(Long.valueOf(numberLines,3)+"\n"); //Trinär
			if (numberLines.startsWith("2")&Palindrom2(numberLines,reward+1)) {
				reward = reward + 1;
				if(reward!=1)
				{
				numberLinesZeroStart = ZeroCreator(reward-1) + 0;
				Numberholder.add(numberLinesZeroStart);
				System.out.println(numberLinesZeroStart);
				numberLinesZeroStart = ("");
				numberLinesZeroStart = ZeroCreator(reward-1) + 1;
				Numberholder.add(numberLinesZeroStart);
				System.out.println(numberLinesZeroStart);
				numberLinesZeroStart = ("");
				numberLinesZeroStart = ZeroCreator(reward-1) + 2;
				Numberholder.add(numberLinesZeroStart);
				System.out.println(numberLinesZeroStart);
				numberLinesZeroStart = ("");
				}
			}

		}
		System.out.println("Die Konstruktfolgen sind Initialisiert");
		return Numberholder;
	}

	private String ZeroCreator(int i) {
		String ZeroLine = ("");
		for (int i2 = 0; i2 < i; i2++) {
			ZeroLine = "0" + ZeroLine;
		}
		return ZeroLine;
	}

	public boolean Palindrom2(String ce,int ec) {

		boolean p2 = false;
		
		for (int i = 0; i < ec; i++) 
		{
			if (ce.startsWith("2")) 
			{
				ce = ce.substring(1);
			}
				
				if (ce.length()==0)
				{
					p2= true;
				}
			
			else {
			

				p2= false;
			}

		
		}
		return p2;
		
	}
}
