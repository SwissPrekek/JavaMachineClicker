package Logic;

public class Goldmachine extends Rohstoffmachine implements RzFace, Runnable {
	private int a=4;
	private int	b=1500;
	Rohstoffmachine rm;
	public static  boolean state = true;

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
		Logic.Manager.r.addGoldmenge(menge);
		
	}
	




}
