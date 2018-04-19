package Logic;

import java.util.ArrayList;
/**
 * 
 * @author Fabian Zeller, Patrik Rudin
 * Diese Klasse ist ein Manager für die verschiedenen Maschinen (Holz, Stein und Gold)
 */
public class Manager {
public static ArrayList <RzFace> objekte = new ArrayList <RzFace>();


private Sellmachine s;
Thread t1;
Thread t2;
Thread t3;


public static RohstoffLager r = new RohstoffLager();
/**
 * 
 * @param obj Parameter für mitgabe eines Objektes mit dem Datentyp RzFace
 */
public void addObj(RzFace obj) {
objekte.add(obj);
}
/**
 * 
 * @param choice dient dazu auszuwaehlen welche Maschine angesprochen werden soll.
 * @return gibt die Boolean Variable var zurueck in welcher gespeichert ist ob eine Maschine läuft oder nicht.
 */
public boolean IsRunning(int choice) {
	boolean var = false;
	for(RzFace g : this.objekte) {
		if(g instanceof Woodmachine && choice==1) {
			var= g.isRunning();
			
			
		}
		
		else if(g instanceof Stonemachine && choice==2) {
			var= g.isRunning();
		}
		
		else if(g instanceof Goldmachine && choice==3) {
			var= g.isRunning();
		}
	}
	return var;
}

/**
 * 
 * @param choice entscheidung welche maschine angesprochen werden soll.
 */
public void DoMachine(int choice) {

	for(RzFace g : this.objekte) {
				
			
			if(g instanceof Woodmachine && choice==1) {
				t1 = new Thread(new Woodmachine());
				g.setRunning(true);
				t1.start();
				
				
			}
			
			else if(g instanceof Stonemachine && choice==2) {
				t2 = new Thread(new Stonemachine());
				g.setRunning(true);
				t2.start();
			}
			
			else if(g instanceof Goldmachine && choice==3) {
				t3 = new Thread(new Goldmachine());
				g.setRunning(true);
				t3.start();
			}
			
			
			
			


			
			
		}
		
			
	
			
		}
	}





