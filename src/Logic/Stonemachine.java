package Logic;
/**
 * 
 * @author Fabian Zeller, Patrik Rudin
 *	Klasse Stonemachine welche dazu da ist Stein zu produzieren und dieses im Rohstofflager zu speichern.
 */
public class Stonemachine extends Rohstoffmachine implements RzFace, Runnable {	
	public static  boolean state = false;
	private int	a=4;
	private int	b=250;
	
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
	Stonemachine.state = state;
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
	        System.out.println("Fehler in der Klasse Stonemachine.java");
	    }
}


/**
 * @param menge dient dazu wieviel dem Rohstofflager pro durchlauf der zaehlen schleife uebergeben werden soll.
 * 
 */
public void AddToRohstofflager(int menge) {
	Manager.r.addSteinmenge(menge);
	
}

/**
 *@return state gibt den Wert der State Variable zurueck
 */
public boolean isRunning() {
	return state;
}

}
