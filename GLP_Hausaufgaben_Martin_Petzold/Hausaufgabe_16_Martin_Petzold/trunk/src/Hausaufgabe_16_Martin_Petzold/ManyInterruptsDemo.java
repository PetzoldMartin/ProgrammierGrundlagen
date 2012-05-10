package Hausaufgabe_16_Martin_Petzold;

import java.lang.Thread.State;

public class ManyInterruptsDemo extends Thread
{
	private int  interruptCounter=0;
	
	public void run(){
		System.out.println("run initialisiert auf ID:"+ getId());
		int i = 0;
		while (interruptCounter<5){
			i++;
			System.out.println(i+". Schleifendurchlauf auf ID:"+ getId());
			if(interrupted()==true){
				interruptCounter++;
			}
			try {
				sleep(100);
			} catch (InterruptedException e) {
				System.out.println("Interrupt ausgelöst auf ID:"+ getId());
				/**
				 * 
				 * Interupt() unterbricht den Thread in einem Konsistenten Zustand und wirft dabei die
				 * Interruptexception,
				 * wohingegen der Thread bei Stop() egal wo er sich in der Ausführung befindet sofort beendet wird,
				 * es also zu Programmfehlern oder Datenverlust kommen kann.
				 *  
				 * Die Methode Interupt() setzt zudem ein Flag/Boolean in dem Thread Objekt welches unterbrochen wird,
				 * welches mit Interrupted() Abgefragt werden kann, Interrupted() setzt zudem dieses Flag zurück.
				 * 
				 * 
				 * Die Interruptexception wird ausgelöst wenn der thread  unterbrochen wird, dabei wird allerdings das
				 * interruptflag zurückgesetzt.
				 * 
				 */
				interrupt();
//				e.printStackTrace();
			}
			
		}
		System.out.println("Schleife verlassen auf ID:"+ getId());
	}
	
	
	/**
	 * Die Ausführbare Mainmethode
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		ManyInterruptsDemo I1 = new ManyInterruptsDemo();
		ManyInterruptsDemo I2 = new ManyInterruptsDemo();
		I1.start();
		I2.start();
		while(true){
			I1.interrupt();
			I2.interrupt();
			sleep(50);
			if(I1.getState() == State.TERMINATED&&I2.getState() == State.TERMINATED){
				break;
			}
		}
		System.out.println("ihr Mainthread wurde beeendet");
		

	}

}
