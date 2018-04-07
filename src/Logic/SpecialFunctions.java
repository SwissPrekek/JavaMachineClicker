package Logic;

import java.util.Random;


public class SpecialFunctions {
static Bank b = new Bank();
public void HackerAngriff(){
	Random rnd=new Random();
	int rz=rnd.nextInt(2);
	System.out.println(rz);
	
	
	if (rz==1) {
		b.deposit(1000);	
		System.out.println(b.getGuthaben());
		}

	else {System.out.println("nicht eins");}
	
}

public void UltraUpgrade(){
	System.out.println("hallop");
	
}
}
