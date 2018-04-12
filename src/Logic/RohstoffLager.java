package Logic;

public class RohstoffLager {
	Sellmachine sell=new Sellmachine();
private double holzmenge;
private double goldmenge;
private double steinmenge;

public void addHolzmenge(double HolzRein){
	this.holzmenge = this.holzmenge + HolzRein;
}

public void addSteinmenge(double SteinRein){
	this.steinmenge = this.steinmenge + SteinRein;
}

public void addGoldmenge(double GoldRein){
	this.goldmenge = this.goldmenge + GoldRein;
}

public double getHolzmenge() {
	return holzmenge;
}

public double getGoldmenge() {
	return goldmenge;
}

public double getSteinmenge() {
	
	return steinmenge;
}

public void HolzToSell() {
	sell.holzverkauf(this.holzmenge);
	
	this.holzmenge=0;
}
public void SteinToSell() {
	sell.steinverkauf(this.steinmenge);

	this.steinmenge=0;
}

public void GoldToSell() {
	sell.goldverkauf(this.goldmenge);
	
	this.goldmenge=0;
}






}
