package Logic;

import java.util.ArrayList;

public class Manager {
public static ArrayList <RzFace> objekte = new ArrayList <RzFace>();


private Sellmachine s;
Thread t1;
Thread t2;
Thread t3;
public static RohstoffLager r = new RohstoffLager();

public void addObj(RzFace obj) {
objekte.add(obj);
}

public void removeObj(RzFace obj) {
	objekte.remove(obj);
}

public void setRunning(){
	for(RzFace g : this.objekte) {
		
		if (g instanceof  Woodmachine) {
			g.setRunning(false);
		}
		else if (g instanceof  Stonemachine) {
			g.setRunning(false);
		}
		else if (g instanceof  Goldmachine) {
			g.setRunning(false);
		}

		
		else{
		 System.out.println("keine Woodmachine");
		}
	
}
	
	

}

public void DoMachine() {
	//hashmap
	for(RzFace g : this.objekte) {
		System.out.println(g);
		
		
		
			//t = new Thread(new Woodmachine());
			//t.start();
			
			//System.out.println(r.getHolzmenge());
			if(g instanceof Woodmachine) {
				t1 = new Thread(new Woodmachine());
				g.setRunning(true);
				t1.start();
				
				
			}
			
			else if(g instanceof Stonemachine) {
				t2 = new Thread(new Stonemachine());
				g.setRunning(true);
				t2.start();
			}
			
			else if(g instanceof Goldmachine) {
				t3 = new Thread(new Goldmachine());
				g.setRunning(true);
				t3.start();
			}
		
			
	
			
		}
	}
}




