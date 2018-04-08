package Logic;

public class Woodmachine extends Rohstoffmachine implements RzFace, Runnable {
	
	Rohstoffmachine rm;
	public static  boolean state = true;
	
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
		Logic.Manager.r.addHolzmenge(menge);
		
	}


	public boolean isRunning() {
		return state;
	}


	public void setRunning(boolean state) {
		Woodmachine.state = state;
	}
	
	
	public Woodmachine newObj() {
		
		return new Woodmachine();
	}

}
