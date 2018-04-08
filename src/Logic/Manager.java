package Logic;

import java.util.ArrayList;

public class Manager {
public static ArrayList <RzFace> objekte = new ArrayList <RzFace>();


private Sellmachine s;
Thread t;
public static RohstoffLager r = new RohstoffLager();

public void addObj(RzFace obj) {
objekte.add(obj);
}

public void removeObj(RzFace obj) {
	objekte.remove(obj);
}

public void kill() {
	t.stop();
}


public void DoMachine() {
	
	for(RzFace g : this.objekte) {
		System.out.println(g);
		
		
		
			//t = new Thread(new Woodmachine());
			//t.start();
			
			//System.out.println(r.getHolzmenge());
			if(this.objekte.get(this.objekte.size()-1).toString().contains("Woodmachine")) {
				t = new Thread(new Woodmachine());
				t.start();
			}
			
			else if(this.objekte.get(this.objekte.size()-1).toString().contains("Stonemachine")) {
				t = new Thread(new Stonemachine());
				t.start();
			}
			
			else if(this.objekte.get(this.objekte.size()-1).toString().contains("Goldmachine")) {
				t = new Thread(new Goldmachine());
				t.start();
			}
			else {
				t.stop();
			}
			
			
			System.out.println(this.objekte);
			
		}
	}
}




