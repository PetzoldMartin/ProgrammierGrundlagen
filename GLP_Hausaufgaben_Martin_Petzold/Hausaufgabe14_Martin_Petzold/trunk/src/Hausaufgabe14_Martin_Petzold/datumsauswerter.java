package Hausaufgabe14_Martin_Petzold;
import java.text.DateFormat;

public class datumsauswerter {
	public datumsauswerter(){
		
	}
	
	public static boolean parseDate(String date)
	{
		DateFormat datev=DateFormat.getDateInstance();
		try{
			datev.parse(date);
			return true;
		}
		catch(java.text.ParseException expected){
			return false;
		}
		
	}
	public static Object accessObjectInArrey(Object[] ObjectArrey, int Index){
		
		return ObjectArrey[Index];
	}
	

}
