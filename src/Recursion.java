
public class Recursion {
	public static void main(String args[]) {
		for( double n = 5; n < 100; n++) {
		System.out.println("Fakutltät von " + n + " ist: " + fakultaet(n) + 
				" und ihre entsprechende Basis von x^n " + Math.pow(fakultaet(n), 1/n));
		}
		
		
	}
	
	private static double fakultaet(double value) {
		double ans = 0;
		if(value < 1) {
			ans = 1;
		}
		else {
			ans = fakultaet(value-1) * value;
		}
		return ans;
	}

}
