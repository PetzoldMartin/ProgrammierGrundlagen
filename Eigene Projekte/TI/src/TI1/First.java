package TI1;

public class First {


	public First() {
		String s="c";
		int i=32;
		System.out.println(make(s,i)); 
	}

	private String make(String s,int i) {
		String test;
		i--;
		if (i==0) {
			return null;
		}
		if (s.equals(new StringBuffer(s).reverse().toString())&&!(s.equals("c"))) {
			return s;
		}
		if ((test=make(cat(s,0),i)) != null) {
			System.out.println(0);
			return test;
		}
		if ((test=make(cat(s,1),i)) != null) {
			System.out.println(1);
			return test;
		}
		if ((test=make(cat(s,2),i)) != null) {
			System.out.println(2);
			return test;
		}
		else return null;
		}
	private String cat(String s,int f) {
		if (f==0) {
			return"a"+s+"b";
		}
		if (f==1) {
			return"ba"+s+"a";
		}
		if (f==2) {
			return"b"+s+"bab";
		}
		else return null;
	}
}



