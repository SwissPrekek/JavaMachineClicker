package Logic;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Goldmachine  implements RzFace {
private double menge;


public void zaehlen() {
	
	int a=1;
	int b=500;
	
	  try {
	        while (true) {
	        	menge++;
	            System.out.println(this.menge);
	            Thread.sleep(a * b);
	        }
	    } catch (InterruptedException e) {
	        System.out.println("Fehler in der Klasse Goldmachine.java");
	    }
}

public void AddToRohstofflager() {
	
}



}

