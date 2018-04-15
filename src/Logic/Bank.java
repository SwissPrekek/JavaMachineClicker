package Logic;
/**
 * 
 * @author Fabian Zeller
 *
 */
public class Bank {
	private long guthaben=10000;
	
	/**
	 * 
	 * @param guthaben Feld um Guthaben einzuzahlen
	 */
	public void deposit(long guthaben) {
		this.guthaben=this.guthaben+guthaben;
	}
	/**
	 * loescht das guthaben der Bank
	 */
	public void delete() {
		this.guthaben=0;	
	}
	/**
	 * 
	 * @param money ermöglicht das abziehen von Guthaben der bank
	 */
	public void withdraw(long money) {
		this.guthaben=this.guthaben-money;
	}
	/**
	 * 
	 * @return gibt die variable Guthaben der Bank zurueck
	 */
	public long getGuthaben() {
		return guthaben;
	}

}
