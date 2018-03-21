package Gui;
import javax.swing.*;        

public class Gui {
    public static void generateMainGui() {
        //Fenster erstellen
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Fügt Label hinzu
        JLabel label = new JLabel("Testgui");
        frame.getContentPane().add(label);

        //Zeigt das Fenster an
        frame.pack();
        frame.setVisible(true);
    }
}
