package Logic;

public class Sellmachine {
RohstoffLager r;

public void holzverkauf() {
	double holzmenge=r.getHolzmenge();
r.delHolz();
}

public void steinverkauf() {
	double steinmenge=r.getSteinmenge();
	r.delStein();
}

public void goldverkauf(double goldmenge) {
	double steinmenge=r.getSteinmenge();
	r.delGold();
}
}
