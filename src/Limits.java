
public class Limits {
	public static void main(String[] args) {
		double d = 0.9999999999;
		System.out.println(formD(d, 43, 3));
	}

	private static double formD(double d, double m, double n) {
		d = (Math.pow(d, m)-1)/(Math.pow(d, n)-1);
		return d;
	}

}
