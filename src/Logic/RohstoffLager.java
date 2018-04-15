package Logic;
/**
 * 
 * @author Fabian Zeller, Patrik Rudin
 * Klasse dient dazu von den Maschinen produzierte Rohstoffe zu speichern.
 *
 */
public class RohstoffLager {
	Sellmachine sell=new Sellmachine();
private long holzmenge;
private long goldmenge;
private long steinmenge;

/**
 * 
 * @param HolzRein Variable welche entscheidet wieviel holz hinzugefuegt wird.
 */
public void addHolzmenge(long HolzRein){
	this.holzmenge = this.holzmenge + HolzRein;
}

/**
 * 
 * @param SteinRein Variable welche entscheidet wieviel Stein hinzugefuegt wird.
 */
public void addSteinmenge(long SteinRein){
	this.steinmenge = this.steinmenge + SteinRein;
}


/**
 * 
 * @param SteinRein Variable welche entscheidet wieviel Gold hinzugefuegt wird.
 */
public void addGoldmenge(long GoldRein){
	this.goldmenge = this.goldmenge + GoldRein;
}


/**
 * 
 * @return gibt zurueck wieviel Holz das bereits im Lager ist.
 */
public long getHolzmenge() {
	return holzmenge;
}

/**
 * 
 * @return gibt zurueck wieviel Gold das bereits im Lager ist.
 */
public double getGoldmenge() {
	return goldmenge;
}


/**
 * 
 * @return gibt zurueck wieviel Stein bereits im Lager ist.
 */
public double getSteinmenge() {
	
	return steinmenge;
}




public void HolzToSell(int percent) {
	sell.holzverkauf(this.holzmenge,percent);
	
	this.holzmenge=0;
}
public void SteinToSell(int percent) {
	sell.steinverkauf(this.steinmenge,percent);

	this.steinmenge=0;
}

public void GoldToSell(int percent) {
	sell.goldverkauf(this.goldmenge,percent);
	
	this.goldmenge=0;
}






}
