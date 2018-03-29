package Gui;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.*;        

public class Gui extends JFrame {
	
	    
		//Panels
		JPanel base = new JPanel();
        JPanel baseGrid = new JPanel();
        JPanel leftUnderGrid = new JPanel();
        JPanel rightUnderGrid = new JPanel();
        JPanel bankButtonsGrid = new JPanel();
        JPanel spezButtonsGrid = new JPanel();
        
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

        
        
        
        
    public Gui() {
    	
    	
        //Fenster erstellen
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("How to get rich! ");
        setSize(1000,500);
        setVisible(true);
        
        
        base.setLayout(new BorderLayout());
        baseGrid.setLayout(new GridLayout(1,3));
        leftUnderGrid.setLayout(new GridLayout(2,1));
        rightUnderGrid.setLayout(new GridLayout(2,1));
        bankButtonsGrid.setLayout(new GridLayout(3,1));
        spezButtonsGrid.setLayout(new GridLayout(3,1));
        
        
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
        
        
        //Bank
        bank.setBorder(BorderFactory.createLineBorder(Color.black));
        bankButtonsGrid.add(lblBank);
        
        bankButtonsGrid.add(btnBankEinzahlen);
        bankButtonsGrid.add(btnBankAuszahlen);
        
        bankButtonsGrid.setPreferredSize(new Dimension(250, 150));
        
        
        //SpezialFunktionen
        specialFunctions.setBorder(BorderFactory.createLineBorder(Color.black));
        spezButtonsGrid.add(lblSpecial);
        
        spezButtonsGrid.add(btnSpezUltraUpgrade);
        spezButtonsGrid.add(btnSpezHackingAngriff);
        
        spezButtonsGrid.setPreferredSize(new Dimension(250, 150));
        
        
        
        stats.setBorder(BorderFactory.createLineBorder(Color.black));
        stats.add(lblStats);
        
        picture.setBorder(BorderFactory.createLineBorder(Color.black));
        picture.add(lblPicture);
        
        machines.setBorder(BorderFactory.createLineBorder(Color.black));
        machines.add(lblMachines);
        
        

        add(base);

    }
}
