package Autotool;

import java.util.ArrayList;

public class liste {
	
private ArrayList<Integer> y= new ArrayList<>();
private ArrayList<Integer> x= new ArrayList<>();

public liste()
{
	y.add(1);
	y.add(3);
	y.add(0);
	y.add(1);
	y.add(1);
	y.add(5);
	x.add(5);
	x.add(5);
	x.add(5);
	x.add(7);
	x.add(0);
	x.add(4);
	x.add(0);
	relaunch();
	print();
}
public void relaunch()
{
//	y.add( x.size( )-1 , y.size( ) );
//    x.add( x.size( )-1 , y.get( 2 ) );
//    x.add( 1 , y.get( x.get( y.get( x.get( 2 ) ) ) ) );
//    x.add( 2 , 7 );
	x.remove(3);
	x.remove(2);
	x.remove(5);
	y.remove(4);
}

public void print()
{
	for (int k : x){
		System.out.println(k);
	}
	System.out.println("tt");
	for (int k : y){
		System.out.println(k);
	}
}
}
