package ANthologie;

public class Old_Copy_2_of_thepalindrom {
	
	public long zahl1;
	public long zahl2;
	public long zahl3;
	public long zahl4;
	public String ce ; 
	public String ec ;
	public String cc = new String ("99999999999999999999999");
	public String cc2;

	public Old_Copy_2_of_thepalindrom ()
	{
		this.zahl2=3037000499L;
		this.zahl3=9223372036854775807L;
		for (long z2 = 1; z2< zahl2;z2++ ){
			if (umdreh(z2)==true);
			else if (umdreh(z2*z2)==true)
				System.out.println(z2 + "\n"); 
			
		}
		
		}


public boolean umdreh (long zahl5)
{
    String tmp =String.valueOf(zahl5);
    ce = tmp;
    ec = new StringBuffer(ce).reverse().toString();
    if (ce.equals(ec)) 
    	return true;
    //	System.out.print("Die Zahl " + zahl2 + " ist ein Palindrom");
    else 
    //	System.out.print("Die Zahl " + zahl2 + " ist kein Palindrom");
    return false;
}
}

