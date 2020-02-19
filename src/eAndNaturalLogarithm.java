import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class eAndNaturalLogarithm {
	
	public static void main(String args[]) {
		System.out.println(ln(3));
		
	}
	
	
	
	@Test
	public void testForTrueValue() {
		assertEquals(calculateE(),Math.E,0.0001);
	}
	
	

	private static double calculateE() {
		double d = 10000000;
		double e =  Math.pow((1+(1/d)), d);
		return e;
	}
	
	
	private static double ln(double d) {
		byte sig = 1;
		
		double ln = 0;
		
		for(int i = 1; i <= 10000; i++) {
			ln += sig* Math.pow(d-1,i)/i;
			System.out.println(ln);
			sig = (byte) - sig;
		}
		
		return ln;
	}
}
