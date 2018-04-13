package Logic;

public class Bank {
	private long guthaben=10000;
	
	
	public void deposit(long guthaben) {
		this.guthaben=this.guthaben+guthaben;
	}
	public void delete() {
		this.guthaben=0;	
	}
	
	public void withdraw(long money) {
		this.guthaben=this.guthaben-money;
	}
	public long getGuthaben() {
		return guthaben;
	}

}
