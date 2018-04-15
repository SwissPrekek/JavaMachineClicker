package Logic;


/**
 * 
 * @author Fabian Zeller, Patrik Rudin
 *  Klasse Woodmachine welche dazu da ist Holz zu produzieren und dieses im Rohstofflager zu speichern.
 *
 */
public class Woodmachine extends Rohstoffmachine implements RzFace, Runnable {
	private int a=4;
	private int b=100;
	Rohstoffmachine rm;


	public static  boolean state = false;
	/**
	 * Run methode welche gebraucht wird da wir mit Threads arbeiten.
	 */
	public void run() {
		zaehlen();
		
		
	}
	
	/**
	 * @param state entscheidet ob die Maschine laeuft.
	 * Dient dazu der Variable State true oder false zu geben
	 */
	public void setRunning(boolean state) {
		Woodmachine.state = state;
	}
	/**
	 * zaehlt in einer definierten geschwindigkeit hoch. Macht dies jedoch nur wenn State auf true ist.
	 */
	public void zaehlen() {

	try {
		   while (state==true) {
			   		
			   		AddToRohstofflager(1);
			   		
			   		
			   		Thread.sleep(a * b);
			   		
		        }
		    } catch (InterruptedException e) {
		        System.out.println("Fehler in der Klasse Wood.java");
		    }
	}
	/**
	 * @param menge dient dazu wieviel dem Rohstofflager pro durchlauf der zaehlen schleife uebergeben werden soll.
	 * 
	 */
	public void AddToRohstofflager(int menge) {
		Manager.r.addHolzmenge(menge);
		
	}
	/**
	 * @ return state gibt den Wert der State Variable zurueck
	 */
	public boolean isRunning() {
		return state;
	}







}
