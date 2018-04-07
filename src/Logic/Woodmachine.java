package Logic;

public class Woodmachine extends Rohstoffmachine implements RzFace, Runnable {
	
	Rohstoffmachine rm;
	
	public void run() {
		zaehlen();
		
	}

	
	public void zaehlen() {
	int a=1;
	int	b=1500;
		
	try {
		   while (true) {
			   		
			   		AddToRohstofflager(1);
			   		//System.out.println("Holz " + this.menge);
			   		Thread.sleep(a * b);
			   		
		        }
		    } catch (InterruptedException e) {
		        System.out.println("Fehler in der Klasse Stonemachine.java");
		    }
	}

	public void AddToRohstofflager(int menge) {
		Gui.Gui.r.addHolzmenge(menge);
		
	}
	

}
