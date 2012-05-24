package Praktikum3;

import java.util.EmptyStackException;
import java.util.Stack;

import Praktikum1.*;

public class Praktikum3_1 extends Zeileneinleser {
	static char f[];
	static Stack<Double> numbers;
	private static boolean falseKey;

	public static void main(String[] args) {
		falseKey= false;
		numbers = new Stack<>();
		String Eingabe = einlesen();
		f = new char[Eingabe.length()];
		f = Eingabe.toCharArray();

		try {
			for (char k : f) {

				if (k == '*') {
					numbers.add( numbers.pop() *  numbers.pop());

				}else{
				if (k == '+') {
					numbers.add( numbers.pop() +  numbers.pop());

				}else{
				if (k == '/') {
					double a =  numbers.pop();
					double b =  numbers.pop();
					numbers.add(b / a);

				}else{
				if (k == '-') {
					double a =  numbers.pop();
					double b =  numbers.pop();
					numbers.add( b-a);

				}else{
				if ('0' <= k && '9' >= k) {
					numbers.add(Double.valueOf(String.valueOf(k)));

				}else{falseKey=true;
				}}}}
				}

			}
			if (numbers.size() == 1&&!falseKey) {
				System.out.println("\n"+"Ergebnis = " + numbers.peek()+"\n"+"\n");
			} else {
				errorAusgabe();

			}

		} catch (EmptyStackException e) {
			errorAusgabe();

		}
		main(args);
	}

}
