package Gui;
import javax.swing.*;        

public class Gui {
    public Gui() {
        //Fenster erstellen
        JFrame frame = new JFrame("JavaMachineClicker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Fügt Label hinzu
        JLabel label = new JLabel("JavaMachineClicker");
        frame.getContentPane().add(label);

        //Zeigt das Fenster an
        frame.pack();
        frame.setVisible(true);
        frame.setSize(1000, 500);
    }
}
