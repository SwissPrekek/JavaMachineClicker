package Logic;

public class Sellmachine {


public void holzverkauf(double holzmenge) {
if (holzmenge >=0) {
	Gui.Gui.banc.deposit(holzmenge*50);
}

}

public void steinverkauf(double steinmenge) {
	if (steinmenge >=0) {
		Gui.Gui.banc.deposit(steinmenge*80);
	}
}

public void goldverkauf(double goldmenge) {
	if (goldmenge >=0) {
		Gui.Gui.banc.deposit(goldmenge*200);
	}
}
}
