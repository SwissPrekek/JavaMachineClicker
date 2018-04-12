package Logic;

public class Sellmachine {


public void holzverkauf(double holzmenge,int percent) {
if (holzmenge >=0) {
	Gui.Gui.banc.deposit(holzmenge*50);
}

}

public void steinverkauf(double steinmenge,int percent) {
	if (steinmenge >=0) {
		Gui.Gui.banc.deposit(steinmenge*80);
	}
}

public void goldverkauf(double goldmenge,int percent) {
	if (goldmenge >=0) {
		Gui.Gui.banc.deposit(goldmenge*200);
	}
}
}
