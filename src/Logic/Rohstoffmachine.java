package Logic;

public class Rohstoffmachine  implements RzFace{
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
		        System.out.println("");
		    }
	}

	public void AddToRohstofflager() {
		
	}
}
