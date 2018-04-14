package Logic;

import static org.junit.Assert.*;


import org.junit.Test;

import Gui.Gui;

public class Testing {

	@Test
	//ist gleichzeitig auch testfall 8 da wir das GUI nicht wirklich testen können abgesehen davon es zu bedienen.
	public void Testfall1_8() {
		Bank b=new Bank();
		Gui g= new Gui();
		Manager mgr=new Manager();
		// Bank einzahlen / Auszahlen
		b.deposit(10000);
		b.withdraw(10000);
		assertTrue(b.getGuthaben()==10000);
		
		//Betrag getten und in die Variable TempGuthaben speichern
		g.setTempGuthaben(g.getTempGuthaben()+b.getGuthaben());
		b.delete();
		assertTrue(g.getTempGuthaben()==10000);
		assertTrue(b.getGuthaben()==0);
	}
	
	
	@Test
	//Test Der Holzmaschine
	public void Testfall2() {
		Bank b1=new Bank();
		Gui g1= new Gui();
		Manager mgr1=new Manager();
		g1.setTempGuthaben(g1.getTempGuthaben()+b1.getGuthaben());
			if(g1.getTempGuthaben() >= 10000) {
			mgr1.addObj(new Woodmachine());
	   			
			mgr1.DoMachine(1);
			g1.setTempGuthaben(g1.getTempGuthaben()-800);
			
			assertTrue(mgr1.IsRunning(1));
			assertTrue(g1.getTempGuthaben()==9200);

		
			}
		
	}

}
