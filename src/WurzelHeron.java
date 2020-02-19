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
	 * Berechnet iterativ die Wurzel einer gegebenen Flie�kommazahl
	 * 
	 * Mit heronischem/babylonischem L�sungsverfahren
	 * 
	 * Es wird mit einem Startwert 1 angefangen und dann das arithmetische Mittel genommen 
	 * von dem Startwert und dem Wert der den Radikant geteilt durch die vorherige N�herung ist
	 * 
	 * 
	 * Geometrisch kann man sich das anschaulich vorstellen �ber ein Rechteck, das mit der Seitenl�nge 1
	 * und der der gew�nschten Wurzel beginnt -> Die Fl�che ist nun gleich der Wurzel
	 * 
	 * Wenn wir dies nun in ein quadrat morphen ist die Seitenl�nge unsere gew�nschte Zahl
	 * Dazu nehmen wir einfach immer wieder das arithmetische Mittel der beiden Seiten und
	 * passen den Fl�cheninhalt entsprechend an
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
