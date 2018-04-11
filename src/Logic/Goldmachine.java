package Logic;

public class Goldmachine extends Rohstoffmachine implements RzFace, Runnable {
	
	Rohstoffmachine rm;
	public static  boolean state = true;
	public void run() {
		zaehlen();
		
	}

	
	public void zaehlen() {
	int a=1;
	int	b=1500;
		
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
		Logic.Manager.r.addGoldmenge(menge);
		
	}
	
	public boolean isRunning() {
		return state;
	}


	public void setRunning(boolean state) {
		Woodmachine.state = state;
	}

}
