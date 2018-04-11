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



public void setRunningTrue(String choice){
	for(RzFace g : this.objekte) {
		
		if (choice.equals("Wood")) {
			//g.setRunning(false);
			
			for(int i = 0; i<this.objekte.size();i++) {
				if(this.objekte.get(i) instanceof Woodmachine) {
					this.objekte.get(i).setRunning(true);
				}
				
				System.out.println("Truesetter   "+this.objekte.get(i)+" "+this.objekte.get(i).isRunning());
			}
		}
		else if (choice.equals("Stone")) {
			//g.setRunning(false);
			for(int i = 0; i<this.objekte.size();i++) {
				if(this.objekte.get(i) instanceof Stonemachine) {
					this.objekte.get(i).setRunning(true);
				}
				System.out.println("Truesetter   "+this.objekte.get(i)+" "+this.objekte.get(i).isRunning());
			}
		}
		else if (choice.equals("Gold")) {
			//g.setRunning(false);
			for(int i = 0; i<this.objekte.size();i++) {
				if(this.objekte.get(i) instanceof Goldmachine) {
					this.objekte.get(i).setRunning(true);
				}
				System.out.println("Truesetter   "+this.objekte.get(i)+" "+this.objekte.get(i).isRunning());
			}
			
		}

		
		else{
		 System.out.println("Error - No instance");
		}
	
}
	
	

}




public void setRunningFalse(String choice){
	for(RzFace g : this.objekte) {
		
		if (choice.equals("Wood")) {
			//g.setRunning(false);
			
			for(int i = 0; i<this.objekte.size();i++) {
				if(this.objekte.get(i) instanceof Woodmachine) {
					this.objekte.get(i).setRunning(false);
				}
				System.out.println("Falsesetter   "+this.objekte.get(i)+" "+this.objekte.get(i).isRunning());
			}
		}
		else if (choice.equals("Stone")) {
			//g.setRunning(false);
			for(int i = 0; i<this.objekte.size();i++) {
				if(this.objekte.get(i) instanceof Stonemachine) {
					this.objekte.get(i).setRunning(false);
				}
				System.out.println(this.objekte);
				System.out.println("Falsesetter   "+this.objekte.get(i)+" "+this.objekte.get(i).isRunning());
			}
		}
		else if (choice.equals("Gold")) {
			//g.setRunning(false);
			for(int i = 0; i<this.objekte.size();i++) {
				if(this.objekte.get(i) instanceof Goldmachine) {
					this.objekte.get(i).setRunning(false);
				}
				System.out.println("Falsesetter   "+this.objekte.get(i)+" "+this.objekte.get(i).isRunning());
			}
			
		}

		
		else{
		 System.out.println("Error - No instance");
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
			
				t1.start();
				
				
			}
			
			else if(g instanceof Stonemachine) {
				t2 = new Thread(new Stonemachine());
			
				t2.start();
			}
			
			else if(g instanceof Goldmachine) {
				t3 = new Thread(new Goldmachine());
			
				t3.start();
			}
		
			
	
			
		}
	}
}




