package Logic;



public class Woodmachine extends Rohstoffmachine implements RzFace, Runnable {
	
	Rohstoffmachine rm;


	public static  boolean state = true;
	
	public void run() {
		zaehlen();
		
		
	}

	
	public void zaehlen() {
	int a=1;
	int	b=400;
		
	try {
		   while (state==true) {
			   		
			   		AddToRohstofflager(1);
			   		
			   		
			   		Thread.sleep(a * b);
			   		
		        }
		    } catch (InterruptedException e) {
		        System.out.println("Fehler in der Klasse Wood.java");
		    }
	}

	public void AddToRohstofflager(int menge) {
		Manager.r.addHolzmenge(menge);
		
	}


	public boolean isRunning() {
		return state;
	}


	public void setRunning(boolean state) {
		Woodmachine.state = state;
	}
	
	



}
