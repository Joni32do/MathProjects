import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatePi {

	public static void main(String[] args) {
		
		
		System.out.println(monteCarlo(100));

	}
	
	@Test
	public void testThreeValuesOfPi() {
		assertEquals(Math.PI, monteCarlo(100000),0.01);
		
	}
	
	@Test
	public void testFourValuesOfPi() {
		assertEquals(Math.PI, monteCarlo(100000000),0.001);  //12,5 seconds
	}
	/**
	 * Approximating Pi via random points on a x-y Plane 
	 * 
	 * 
	 * Filling the unit square with random points and getting the ratio of points in the
	 * unit circle to the square times 4 
	 * @param trials
	 * @return
	 */
	public static double monteCarlo(double trials) {
		
		
		double success = 0;
		
		for(int i = 0; i < trials; i++) {
			
			double a = Math.random()*2-1;
			double b = Math.random()*2-1;
			
			if(Math.sqrt(a*a + b*b) < 1) {
				success++;
			}
		}
		
		double pi = 4*success/trials;
		
		return pi;
		
	}

}
