package Logic;

import java.util.Random;




public class SpecialFunctions {

public void HackerAngriff(){
	Random rnd=new Random();
	long rz=rnd.nextInt(2);

	
	if (rz==0) {
		Gui.Gui.banc.deposit(100000);
	}
	
	if (rz==1) {
		Gui.Gui.banc.withdraw(100000);
	}
}

}
