package Logic;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

import Gui.Gui;

public class TestingNew {
	//Dies ist ein kombinierter Test aus Status und Bank
	@Test
	public void Testfall1() {
		Bank b=new Bank();
		Gui g= new Gui();
		Manager mgr=new Manager();
		// Bank einzahlen / Auszahlen
		b.delete();
		b.deposit(10000);
		b.withdraw(5000);
		
		
		//Betrag getten und in die Variable TempGuthaben speichern
		g.setTempGuthaben(b.getGuthaben());
		
		
		b.delete();
		assertTrue(g.getTempGuthaben()==5000);
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
	public void Testfall3() {
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
	public void Testfall4() {
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
	
	
	@Test
	// ImagePicker testen
	public void Testfall5() {
		/* den ImagePicker kann man nicht als Testfall testen.
		 * Jedoch kann man Ihn testen indem man ab den jeweiligen Guthaben schuat ob sich das bild ändert.
		 */	
	}
	
	
	@Test
	// Hacking Angriff testen
	public void Testfall6() {
		Bank b=new Bank();
		Gui g= new Gui();
		Manager mgr=new Manager();
		SpecialFunctions s=new SpecialFunctions();
		// 1000000 Guthaben auf die Bank aufladen damit die Maschine überhaupt gestartet werden kann.
		b.delete();
		b.deposit(1000000);
		g.setTempGuthaben(g.getTempGuthaben()+b.getGuthaben());
				
		if(g.getTempGuthaben() >= 1000000) {
			
			Random rnd=new Random();
			int rz=rnd.nextInt(2);
			
			
			if (rz==0) {
				b.deposit(100000);
			}
			
			if (rz==1) {
				b.withdraw(100000);
			}
					
		
			assertTrue(rz==0 && b.getGuthaben()==1100000 && b.getGuthaben()==1100000 || rz==1 && b.getGuthaben()==900000);
			
			
			
			
			b.delete();
			g.setTempGuthaben(0);
			
			
			
		}
	}
	
		
	@Test
	// UltraUpgrade Angriff testen ist indirekt auch ein Verkaufsmaschinentest
	public void Testfall7() {
	SpecialFunctions s =new SpecialFunctions();
	Bank b=new Bank();
	b.delete();
	Sellmachine sell =new Sellmachine();
	RohstoffLager r =new RohstoffLager();
	Gui g=new Gui();
	b.delete();
	b.deposit(1000000);
	g.setTempGuthaben(g.getTempGuthaben()+b.getGuthaben());
	b.delete();
	if (g.getTempGuthaben()>=1000000) {
		r.addHolzmenge(100);
		
		b.deposit(4*(r.getHolzmenge()*50));
		
		//4*(100*50) =20000
		assertTrue(b.getGuthaben()==20000);
	}

		
	}
	
	
	

	
	
	
	
	

}
