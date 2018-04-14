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
		Bank b=new Bank();
		Gui g= new Gui();
		Manager mgr=new Manager();
		g.setTempGuthaben(g.getTempGuthaben()+b.getGuthaben());
			
		if(g.getTempGuthaben() >= 10000) {
			mgr.addObj(new Woodmachine());
	   			
			mgr.DoMachine(1);
			g.setTempGuthaben(g.getTempGuthaben()-800);
			
			assertTrue(mgr.IsRunning(1));
			assertTrue(g.getTempGuthaben()==9200);
			}
		}
	
	
	
	@Test
	// Steinmaschine testen
	public void Testfall4() {
		Bank b=new Bank();
		Gui g= new Gui();
		Manager mgr=new Manager();
		// 50000 Guthaben auf die Bank aufladen damit die Maschine überhaupt gestartet werden kann.
		b.deposit(50000);
		g.setTempGuthaben(g.getTempGuthaben()+b.getGuthaben());
		
			
		if(g.getTempGuthaben() >= 50000) {
			mgr.addObj(new Stonemachine());
	   			
			mgr.DoMachine(2);
			g.setTempGuthaben(g.getTempGuthaben()-50000);
			
			assertTrue(mgr.IsRunning(2));
			assertTrue(g.getTempGuthaben()==10000);

		
			}
	}
	
	
	@Test
	// Goldmaschine testen
	public void Testfall5() {
		Bank b=new Bank();
		Gui g= new Gui();
		Manager mgr=new Manager();
		// 100000 Guthaben auf die Bank aufladen damit die Maschine überhaupt gestartet werden kann.
		b.deposit(100000);
		g.setTempGuthaben(g.getTempGuthaben()+b.getGuthaben());
		
			
		if(g.getTempGuthaben() >= 100000) {
			mgr.addObj(new Goldmachine());
	   			
			mgr.DoMachine(3);
			g.setTempGuthaben(g.getTempGuthaben()-100000);
			
			assertTrue(mgr.IsRunning(3));
			assertTrue(g.getTempGuthaben()==10000);

		}
	}
	
	
	

}
