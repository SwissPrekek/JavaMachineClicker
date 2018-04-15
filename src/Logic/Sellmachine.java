package Logic;

public class Sellmachine {

/**
 * 
 * @param holzmenge dient dazu die Holzmenge einzugeben welche verkauft werden soll.
 * @param percent Dient dazu mit was am Schluss der Verkaufsertrag multipliziert werden soll.
 * 
 */
public void holzverkauf(long holzmenge,int percent) {
if (holzmenge >=0) {
	Gui.Gui.banc.deposit(percent*(holzmenge*50));
}

}
/**
 * 
 * @param steinmenge dient dazu die Steinmenge einzugeben welche verkauft werden soll.
 * @param percent Dient dazu mit was am Schluss der Verkaufsertrag multipliziert werden soll.
 */
public void steinverkauf(long steinmenge,int percent) {
	if (steinmenge >=0) {
		Gui.Gui.banc.deposit(percent*(steinmenge*80));
	}
}
/**
 * 
 * @param goldmenge dient dazu die Goldmenge einzugeben welche verkauft werden soll.
 * @param percent Dient dazu mit was am Schluss der Verkaufsertrag multipliziert werden soll.
 */
public void goldverkauf(long goldmenge,int percent) {
	if (goldmenge >=0) {
		Gui.Gui.banc.deposit(percent*(goldmenge*200));
	}
}
}
