package Logic;

public class Stonemachine extends Rohstoffmachine implements RzFace {
	private double menge;
RohstoffLager r;
	public void zaehlen() {
		int a=1;
		int b=1;
		
		  try {
		        while (true) {
		        	menge++;
		            System.out.println(this.menge);
		            Thread.sleep(a * b);
		        }
		    } catch (InterruptedException e) {
		        System.out.println("Fehler in der Klasse Stonemachine.java");
		    }
	}

	public void AddToRohstofflager() {
		r.addSteinmenge(menge);
	}
}
