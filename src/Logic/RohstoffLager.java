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

public void delHolz() {
	this.holzmenge=0;
}
public void delStein() {
	this.steinmenge=0;
}

public void delGold() {
	this.goldmenge=0;
}






}
