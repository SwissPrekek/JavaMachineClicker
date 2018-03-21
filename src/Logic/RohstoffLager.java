package Logic;

public class RohstoffLager {
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


}
