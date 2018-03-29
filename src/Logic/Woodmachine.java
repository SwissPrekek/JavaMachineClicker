package Logic;

public class Woodmachine  implements RzFace{
	private double menge;

	public void zaehlen(int a,int b) {
		a=1;
		b=1000;
		
		  try {
		        while (true) {
		        	menge++;
		            System.out.println(this.menge);
		            Thread.sleep(a * b);
		        }
		    } catch (InterruptedException e) {
		        System.out.println("Fehler in der Klasse Woodmachine.java");
		    }
	}

	public void AddToRohstofflager() {
		
	}
}
