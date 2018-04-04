package Logic;

public class Bank {
	private double guthaben;
	
	public void deposit(double guthaben) {
		this.guthaben=this.guthaben+guthaben;
	}
	public void withdraw(double guthaben) {
		this.guthaben=this.guthaben+guthaben;
	}
	public double getGuthaben() {
		return guthaben;
	}

}
