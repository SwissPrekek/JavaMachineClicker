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


public void DoMachine(int choice) {
	//hashmap
	for(RzFace g : this.objekte) {
		
		
		
		
			//t = new Thread(new Woodmachine());
			//t.start();
			
			//System.out.println(r.getHolzmenge());
			
		
			
			if(g instanceof Woodmachine && choice==1) {
				t1 = new Thread(new Woodmachine());
			
				t1.start();
				
				
			}
			
			else if(g instanceof Stonemachine && choice==2) {
				t2 = new Thread(new Stonemachine());
			
				t2.start();
			}
			
			else if(g instanceof Goldmachine && choice==3) {
				t3 = new Thread(new Goldmachine());
			
				t3.start();
			}
			
			
			
			


			
			
		}
		
			
	
			
		}
	}





