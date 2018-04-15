package Logic;

import java.util.Random;



/**
 * 
 * @author Fabian Zeller, Patrik Rudin
 * Klasse welche die Spezialfunktion HackerAngriff beinhaltet
 *
 */
public class SpecialFunctions {
private int rz;


/**
 * HackerAngriff Klasse welche den HackerAngriff ausfuehrt.
 */
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
/**
 * 
 * @return gibt den Wert der Variable rz zurueck um das Testing in der testing methode zu machen.
 */
public int GetRZ() {
	return this.rz;
}


}
