package Logic;

import java.util.Random;




public class SpecialFunctions {
private int rz;



public void HackerAngriff(){
	Random rnd=new Random();
	rz=rnd.nextInt(2);

	
	if (rz==0) {
		Gui.Gui.banc.deposit(100000);
	}
	
	if (rz==1) {
		Gui.Gui.banc.deposit(100000);
	}
	
	
	
}

public int GetRZ() {
	return this.rz;
}


}
