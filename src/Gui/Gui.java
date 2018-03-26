package Gui;
import java.awt.BorderLayout;
import java.awt.Color;
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
        
        
        base.add(baseGrid, BorderLayout.CENTER);
        
        baseGrid.add(rightUnderGrid);
        baseGrid.add(machines);
        baseGrid.add(leftUnderGrid);
        leftUnderGrid.add(bank);
        leftUnderGrid.add(specialFunctions);
        rightUnderGrid.add(stats);
        rightUnderGrid.add(picture);
        
        
        stats.setBorder(BorderFactory.createLineBorder(Color.black));
        stats.add(lblStats);
        
        picture.setBorder(BorderFactory.createLineBorder(Color.black));
        picture.add(lblPicture);
        
        machines.setBorder(BorderFactory.createLineBorder(Color.black));
        machines.add(lblMachines);
        
        bank.setBorder(BorderFactory.createLineBorder(Color.black));
        bank.add(lblBank);
        
        specialFunctions.setBorder(BorderFactory.createLineBorder(Color.black));
        specialFunctions.add(lblSpecial);
        

        add(base);

    }
}
