package Logic;

public class Goldmachine extends Rohstoffmachine implements RzFace {
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
