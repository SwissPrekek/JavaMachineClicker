package Logic;

public class RohstoffLager {
	Sellmachine sell=new Sellmachine();
private long holzmenge;
private long goldmenge;
private long steinmenge;

public void addHolzmenge(long HolzRein){
	this.holzmenge = this.holzmenge + HolzRein;
}

public void addSteinmenge(long SteinRein){
	this.steinmenge = this.steinmenge + SteinRein;
}

public void addGoldmenge(long GoldRein){
	this.goldmenge = this.goldmenge + GoldRein;
}

public long getHolzmenge() {
	return holzmenge;
}

public double getGoldmenge() {
	return goldmenge;
}

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
