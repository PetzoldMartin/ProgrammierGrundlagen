package Hausaufgabe_16_Martin_Petzold;

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
				 * Die Methode Interupt setzt ein Flag/Boolean in diesem Thread Objekt
				 * das mit Interrupted() Abgefragt werden kann
				 */
				interrupt();
//				e.printStackTrace();
			}
			
		}
		System.out.println("Schleife verlassen auf ID:"+ getId());
	}

}
