import java.util.ArrayList;
import java.util.List;

public class StreamsTestViaProbability {

	
	public static void main( String args[]) {
		
		int iterations = 100;
		double range = 10;
		List<Double> random = new ArrayList<Double>();
		
		for(int i = 0; i< iterations; i++) {
			random.add(Math.random()*range);
		}
		System.out.println(random.size());
		random.parallelStream().forEach(x ->System.out.println(x));
		
		long c = random.parallelStream().filter(x -> (x < 3)).count();
		double abweichung = 3*range - c;
		
		
		System.out.println("Die Abweichung von dem zu erwartenden Wert ist: " + c);
		
	}
}
