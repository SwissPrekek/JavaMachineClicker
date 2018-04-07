package Logic;

import java.util.ArrayList;

public class Manager {
private ArrayList <RzFace> objekte = new ArrayList <RzFace>();

private RohstoffLager r;
private Sellmachine s;


public void addObj(RzFace obj) {
objekte.add(obj);
}

public void DoMachine() {
	for(RzFace g : this.objekte) {
		g.zaehlen();
	
	}
}



}
