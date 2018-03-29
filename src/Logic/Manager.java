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
	Goldmachine goldm=new Goldmachine();
	Stonemachine stonem=new Stonemachine();
	Woodmachine woodm=new Woodmachine();
}
public void DoRohstofflager() {
	RohstoffLager rol=new RohstoffLager();
}

public void DoSell() {
	Sellmachine sellm=new Sellmachine();
}
}
