package Logic;

public class Stonemachine extends Rohstoffmachine implements RzFace, Runnable {	
	public static  boolean state = true;
	private int	a=4;
	private int	b=250;
	
public void run() {
	zaehlen();
	
}


public void zaehlen() {

	
try {
	   while (state==true) {
		   		
		   		AddToRohstofflager(1);

		   		Thread.sleep(a * b);
		   		
	        }
	    } catch (InterruptedException e) {
	        System.out.println("Fehler in der Klasse Stonemachine.java");
	    }
}

public void AddToRohstofflager(int menge) {
	Manager.r.addSteinmenge(menge);
	
}


}
