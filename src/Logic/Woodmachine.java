package Logic;



public class Woodmachine extends Rohstoffmachine implements RzFace, Runnable {
	private int a=4;
	private int b=100;
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
		        System.out.println("Fehler in der Klasse Wood.java");
		    }
	}

	public void AddToRohstofflager(int menge) {
		Manager.r.addHolzmenge(menge);
		
	}





}
