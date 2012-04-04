package ANthologie;

import java.math.*;
public class Old_Palindrom2 {
	

	public Old_Palindrom2() {
		// TODO Auto-generated constructor stub
		BigInteger top = BigInteger.valueOf(0);
		for (BigInteger i=BigInteger.ONE;eval(BigInteger.valueOf(999999999),i);i=i.add(BigInteger.ONE)) {
			BigInteger j = i.pow(2);
			if ((j.equals(invert(j))) && !(i.equals(invert(i)))) {
				if (eval(quer(i), quer(top))) {
					top = i;
					System.out.println(quer(top) + "\t" + top+ "\t" + j + "\n");
				}
				}
			}
		System.out.println("Fertisch!!!");
		}
	
	public BigInteger invert(BigInteger zahl) {
		BigInteger rest=BigInteger.ZERO;
		BigInteger umdrehen=BigInteger.valueOf(0);
		while(eval(zahl,BigInteger.valueOf(0))) {
			rest = zahl.mod(BigInteger.valueOf(10));
			zahl = zahl.divide(BigInteger.valueOf(10));
			umdrehen = umdrehen.multiply(BigInteger.valueOf(10)).add(rest);
		}
		return umdrehen; 
	}
	public BigInteger quer(BigInteger i) {
		BigInteger q = BigInteger.valueOf(0);
		while (eval(i ,BigInteger.valueOf(0))) {
		  q=q.add(i.mod(BigInteger.valueOf(10)));
		  i=i.divide(BigInteger.valueOf(10));
		  }
		return q;
	}
	public boolean eval(BigInteger a,BigInteger b) {
		if ((a.max(b)==a) && !(a.equals(b))) {
			return true;
		}
		else {
			return false;
		}
	}


}
