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
import Logic.RohstoffLager;
import Logic.RzFace;
import Logic.Sellmachine;
import Logic.SpecialFunctions;
import Logic.Stonemachine;
import Logic.Woodmachine;        

public class Gui extends JFrame implements ActionListener {
		
		int woodi=1;
		int stonei=1;
		int goldi=1;
		Manager mgr =new Manager();
		
		SpecialFunctions s =new SpecialFunctions();

		public static Bank banc = new Bank();
		
		double TempGuthaben;

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
        
        JLabel lblWoodMachineText = new JLabel("Holzmenge: ");
        JLabel lblStoneMachineText = new JLabel("Steinmenge: ");
        JLabel lblGoldMachineText = new JLabel("Goldmenge: ");
        JLabel lblGuthabenText = new JLabel("Guthaben: ");
        
        JLabel lblWoodMachine = new JLabel("0.0");
        JLabel lblStoneMachine = new JLabel("0.0");
        JLabel lblGoldMachine = new JLabel("0.0");
        JLabel lblGuthaben = new JLabel("0.0");
        
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
        statsGrid.setLayout(new GridLayout(5,2));
        
        
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
      	//statsGrid.add(lblStats);
        stats.add(lblStats);
        statsGrid.add(lblWoodMachineText);
        statsGrid.add(lblWoodMachine);
        
        statsGrid.add(lblStoneMachineText);
        statsGrid.add(lblStoneMachine);
        
        statsGrid.add(lblGoldMachineText);
        statsGrid.add(lblGoldMachine);
        
        statsGrid.add(lblGuthabenText);
        statsGrid.add(lblGuthaben);
        
        

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
    
    public void print(){

    	
    	lblWoodMachine.setText(Double.toString(Manager.r.getHolzmenge()));
    	lblStoneMachine.setText(Double.toString(Manager.r.getSteinmenge()));
    	lblGoldMachine.setText(Double.toString(Manager.r.getGoldmenge()));

    	
    }
    
    public void actionPerformed(ActionEvent ae){

   		if(ae.getSource() == btnBankEinzahlen) {
   			banc.deposit(TempGuthaben);
   		}
   		
   		if(ae.getSource() == btnBankAuszahlen) {
   			this.TempGuthaben=this.TempGuthaben+banc.getGuthaben();
   			banc.withdraw();
   		}
   		
   		if(ae.getSource() == btnSpezUltraUpgrade) {
   			/*SpecialFunctions s =new SpecialFunctions();
   			s.UltraUpgrade();*/
   			System.out.println("3");
   		}
   		
   		if(ae.getSource() == btnSpezHackingAngriff) {
   			this.print();
   		}
   		
   		
   		if(ae.getSource() == btnWoodMachine && woodi == 1) {
   			
   			
   			mgr.addObj(new Woodmachine());
   			
   			woodi=2;
   			mgr.DoMachine(1);
   		
   			}		
   		
   		if(ae.getSource() == btnStoneMachine && stonei==1) {
   		
   			
			
   			
   			mgr.addObj(new Stonemachine());
   			
   			stonei=2;
   			mgr.DoMachine(2);   			
   		}	
   		
   		if(ae.getSource() == btnGoldMachine && goldi==1) {
   			
			
   			
   			mgr.addObj(new Goldmachine());
   			
   			goldi=2;
   			mgr.DoMachine(3); 			
   			
   		}
			
    }
    
   		
    public void imagePicker(int imageNumber){

    	switch (imageNumber) {
    	
    	case 1: image.setIcon(new ImageIcon("src/gui/level_1.jpg"));
    			break;
    			
    	case 2: image.setIcon(new ImageIcon("src/gui/level_2.jpg"));
				break;
				
    	case 3: image.setIcon(new ImageIcon("src/gui/level_3.jpg"));
				break;
				
    	case 4: image.setIcon(new ImageIcon("src/gui/level_4.jpg"));
				break;
				
    	case 5: image.setIcon(new ImageIcon("src/gui/level_5.jpg"));
				break;
    	}
    }
    	
    

 	}
   		

   	
   		


