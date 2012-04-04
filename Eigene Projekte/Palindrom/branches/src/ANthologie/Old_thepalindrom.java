package ANthologie;

public class Old_thepalindrom {
	
	public long zahl1;
	public long zahl2;
	public long zahl3;
	public long zahl4;

	public Old_thepalindrom ()
	{
		this.zahl2=3037000499L;
		this.zahl3=9223372036854775807L;
		for (long z2 = 2000; z2< zahl2;z2++ ){
			if (umdreh(z2)==true);
			else if (umdreh(z2*z2)==true)
				System.out.println(z2 + "\n"); 
			
		}
		
		}

public boolean umdreh (long zahl2)
{
    long tmp = zahl2;
    long erg = 0;
    while (tmp > 0){
    erg = (erg * 10) + (tmp % 10);
    tmp = tmp/10;
    }
    if (zahl2 == erg) 
    	return true;
    //	System.out.print("Die Zahl " + zahl2 + " ist ein Palindrom");
    else 
    //	System.out.print("Die Zahl " + zahl2 + " ist kein Palindrom");
    return false;
}
}

