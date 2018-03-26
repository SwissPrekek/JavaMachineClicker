package Gui;
import javax.swing.*;        

public class Gui {
    public Gui() {
        //Fenster erstellen
        JFrame frame = new JFrame("HowToBeRich");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Fuegt Label hinzu
        JLabel label = new JLabel("HowToBeRich");
        frame.getContentPane().add(label);

        //Zeigt das Fenster an
        frame.pack();
        frame.setVisible(true);
        frame.setSize(1000, 500);
    }
}
