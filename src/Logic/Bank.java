package Logic;

public class Bank {
	private double guthaben;
	
	public void deposit(double guthaben) {
		this.guthaben=this.guthaben+guthaben;
	}
	public void withdraw() {
		this.guthaben=0;	
	}
	public double getGuthaben() {
		return guthaben;
	}

}
