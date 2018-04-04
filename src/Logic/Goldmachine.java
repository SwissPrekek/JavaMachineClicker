package Logic;
//I bi Cool
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Goldmachine  implements RzFace {
private double menge;
RohstoffLager r;

public void zaehlen(int a,int b) {
	
	a=1;
	b=500;
	
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
	r.addGoldmenge(menge);
}





}

