import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class WurzelHeron {

	public static void main(String[] args) {
		
		List<Double> wurzel = new LinkedList<Double>();
		for(double i = 0; i < 100; i++) {
			double d = i;
			wurzel.add(wurzelZiehen(d));
		}
		wurzel.parallelStream().sorted(Comparator.reverseOrder()).
											forEach(x -> System.out.println(x));
		
		System.out.println("Test zwei!");
		wurzel.parallelStream().filter(x -> x.intValue() == x.doubleValue()).
			sorted(Comparator.naturalOrder()).forEach(x -> System.out.println(x));


	}
	
	
	/**
	 * Berechnet iterativ die Wurzel einer gegebenen Fließkommazahl
	 * 
	 * Mit heronischem/babylonischem Lösungsverfahren
	 * 
	 * Es wird mit einem Startwert 1 angefangen und dann das arithmetische Mittel genommen 
	 * von dem Startwert und dem Wert der den Radikant geteilt durch die vorherige Näherung ist
	 * 
	 * 
	 * Geometrisch kann man sich das anschaulich vorstellen über ein Rechteck, das mit der Seitenlänge 1
	 * und der der gewünschten Wurzel beginnt -> Die Fläche ist nun gleich der Wurzel
	 * 
	 * Wenn wir dies nun in ein quadrat morphen ist die Seitenlänge unsere gewünschte Zahl
	 * Dazu nehmen wir einfach immer wieder das arithmetische Mittel der beiden Seiten und
	 * passen den Flächeninhalt entsprechend an
	 * 
	 *  Dies
	 * @param d double als Input
	 * @return
	 */
	static double wurzelZiehen(double d) {
		double a = 1;
		double b = 0;
		for(int i = 0; i < 10; i++) {
			b = d/a;
			a = (a+b)/2;
		}
		
		return a;
	}

}
