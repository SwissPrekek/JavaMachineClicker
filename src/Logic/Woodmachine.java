package Logic;

public class Woodmachine extends Thread implements RzFace {
	
	Rohstoffmachine rm;
	private double menge;
	RohstoffLager r;
	boolean cnt;
	
	public void run() {
		zaehlen();
	}

	public void zaehlen() {
	int a=1;
	int	b=1500;
		
	try {
		   while (true) {
			   		
			   		menge++;
			   		System.out.println("Holz " + this.menge);
			   		Thread.sleep(a * b);
			   		
		        }
		    } catch (InterruptedException e) {
		        System.out.println("Fehler in der Klasse Stonemachine.java");
		    }
	}

	public void AddToRohstofflager() {
		r.addHolzmenge(menge);
		
	}
	

}
