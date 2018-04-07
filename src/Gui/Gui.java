package Gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Logic.Bank;
import Logic.Goldmachine;
import Logic.Manager;
import Logic.RzFace;
import Logic.SpecialFunctions;
import Logic.Stonemachine;
import Logic.Woodmachine;        

public class Gui extends JFrame implements ActionListener {
		Bank b;
		Manager mgr =new Manager();
		SpecialFunctions s =new SpecialFunctions();
		
		double TempGuthaben;
		boolean woodIsRunning = true;
	    boolean stoneIsRunning = true;
	    boolean goldIsRunning = true;
	    Woodmachine ins;
	    
	    

		private boolean isWoodIsRunning() {
			return woodIsRunning;
		}



		private void setWoodIsRunning(boolean woodIsRunning) {
			this.woodIsRunning = woodIsRunning;
		}



		private boolean isStoneIsRunning() {
			return stoneIsRunning;
		}



		private void setStoneIsRunning(boolean stoneIsRunning) {
			this.stoneIsRunning = stoneIsRunning;
		}



		private boolean isGoldIsRunning() {
			return goldIsRunning;
		}



		private void setGoldIsRunning(boolean goldIsRunning) {
			this.goldIsRunning = goldIsRunning;
		}



		//Panels
		JPanel base = new JPanel();
        JPanel baseGrid = new JPanel();
        JPanel leftUnderGrid = new JPanel();
        JPanel rightUnderGrid = new JPanel();
        JPanel bankButtonsGrid = new JPanel();
        JPanel spezButtonsGrid = new JPanel();
        JPanel machineButtonsGrid = new JPanel();
        JPanel statsGrid = new JPanel();
        
        JPanel stats = new JPanel();
        JPanel machines = new JPanel();
        JPanel bank = new JPanel();
        JPanel specialFunctions = new JPanel();
        JPanel picture = new JPanel();
        
        //Label
        JLabel lblStats = new JLabel("Guthaben/Stats");
        JLabel lblMachines = new JLabel("Maschinen");
        JLabel lblBank = new JLabel("Bank");
        JLabel lblSpecial = new JLabel("Spezialaktionen");
        JLabel lblPicture = new JLabel("Picture");
        
        //Buttons
        JButton btnBankEinzahlen = new JButton("Einzahlen");
        JButton btnBankAuszahlen = new JButton("Auszahlen");
        
        JButton btnSpezUltraUpgrade = new JButton("Ultra Upgrade");
        JButton btnSpezHackingAngriff = new JButton("Hacking Angriff");
        
        JButton btnWoodMachine = new JButton("Holzmaschine");
        JButton btnStoneMachine = new JButton("Stonemaschine");
        JButton btnGoldMachine = new JButton("Goldmaschine");
        
        //Textfeld
        JTextField txtStats = new JTextField();
        
        //Bild
        JLabel image = new JLabel(new ImageIcon("src/gui/image_1.jpg"));

        
        
        
        
    public Gui() {
    	
    	
        //Fenster erstellen
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("How to get rich! ");
        setSize(1000,600);
        setVisible(true);
        
        
        base.setLayout(new BorderLayout());
        baseGrid.setLayout(new GridLayout(1,3));
        leftUnderGrid.setLayout(new GridLayout(2,1));
        rightUnderGrid.setLayout(new GridLayout(2,1));
        bankButtonsGrid.setLayout(new GridLayout(3,1));
        spezButtonsGrid.setLayout(new GridLayout(3,1));
        machineButtonsGrid.setLayout(new GridLayout(4,1));
        statsGrid.setLayout(new GridLayout(2,1));
        
        
        base.add(baseGrid, BorderLayout.CENTER);
        
        baseGrid.add(leftUnderGrid);
        baseGrid.add(machines);
        baseGrid.add(rightUnderGrid);
        rightUnderGrid.add(bank);
        rightUnderGrid.add(specialFunctions);
        leftUnderGrid.add(stats);
        leftUnderGrid.add(picture);
        bank.add(bankButtonsGrid);
        specialFunctions.add(spezButtonsGrid);
        machines.add(machineButtonsGrid);
        stats.add(statsGrid);
        
        
        
        //Stats
        stats.setBorder(BorderFactory.createLineBorder(Color.black));
        statsGrid.add(lblStats);
        statsGrid.add(txtStats);
        
        statsGrid.setPreferredSize(new Dimension(250, 150));
        
        
        //Bild
        picture.setBorder(BorderFactory.createLineBorder(Color.black));
        picture.add(image);
        
        //Bank
        machines.setBorder(BorderFactory.createLineBorder(Color.black));
        bankButtonsGrid.add(lblBank);
        
        bankButtonsGrid.add(btnBankEinzahlen);
        bankButtonsGrid.add(btnBankAuszahlen);
        
        bankButtonsGrid.setPreferredSize(new Dimension(250, 150));
        
        
        
        //Maschinen
        bank.setBorder(BorderFactory.createLineBorder(Color.black));
        machineButtonsGrid.add(lblMachines);
        
        machineButtonsGrid.add(btnWoodMachine);
        machineButtonsGrid.add(btnStoneMachine);
        machineButtonsGrid.add(btnGoldMachine);
        
        machineButtonsGrid.setPreferredSize(new Dimension(250, 150));
        
        
        
        
        //SpezialFunktionen
        specialFunctions.setBorder(BorderFactory.createLineBorder(Color.black));
        spezButtonsGrid.add(lblSpecial);
        
        spezButtonsGrid.add(btnSpezUltraUpgrade);
        spezButtonsGrid.add(btnSpezHackingAngriff);
        
        spezButtonsGrid.setPreferredSize(new Dimension(250, 150));
        
        
        //Actionlistener hinzufügen
        btnBankEinzahlen.addActionListener(this);
        btnBankAuszahlen.addActionListener(this);
        btnSpezUltraUpgrade.addActionListener(this);
        btnSpezHackingAngriff.addActionListener(this);
        btnWoodMachine.addActionListener(this);
        btnStoneMachine.addActionListener(this);
        btnGoldMachine.addActionListener(this);
        
        
        
        
        
        
        //--------------------------------//

        add(base);

    }
    
    
    
    public void actionPerformed(ActionEvent ae){

   		if(ae.getSource() == btnBankEinzahlen) {
   			//b.deposit(TempGuthaben);
   			boolean x = true;
   			while(x) {System.out.println("1");}
   		}
   		
   		if(ae.getSource() == btnBankAuszahlen) {
   			/*double tempguthaben=b.getGuthaben();
   			b.withdraw(b.getGuthaben());
   			this.TempGuthaben=this.TempGuthaben+tempguthaben; */
   			System.out.println("2");
   		}
   		
   		if(ae.getSource() == btnSpezUltraUpgrade) {
   			/*SpecialFunctions s =new SpecialFunctions();
   			s.UltraUpgrade();*/
   			System.out.println("3");
   		}
   		
   		if(ae.getSource() == btnSpezHackingAngriff) {
   			SpecialFunctions s =new SpecialFunctions();
   			s.HackerAngriff();
   		}
   		
   		//creates a new thread, deletes it on second click
   		//thread instance contributes to rohstofflager by mining and adding values
   		if(ae.getSource() == btnWoodMachine) {
   			
   			
   			//mgr.addObj(ins);
   			//mgr.DoMachine();
   			if(isWoodIsRunning()) {
   				ins = new Woodmachine();
   	   			ins.start();
   				setWoodIsRunning(false);
   				//ins.interrupt();
   				
   			}
   			else if(isWoodIsRunning() == false) {
   				setWoodIsRunning(true);
   				//ins.interrupt();
   				ins.stop();
   				
   			}
   			
   			
   		}
   		
   		if(ae.getSource() == btnStoneMachine) {
   			mgr.addObj(new Stonemachine());
   			mgr.DoMachine();
   		}
   		
   		if(ae.getSource() == btnGoldMachine) {
   			mgr.addObj(new Goldmachine());
   			mgr.DoMachine();
   		}
   		
   		
    }
}
