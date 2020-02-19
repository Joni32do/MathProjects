
public class GrenzwertTest {
	
	public static void main(String args[]) {
		double a = Math.random()*100;
		
		for(int i = 0; i < 500000; i++) {
			a = a/(1+2*a);
		}
		
		System.out.println(a);
	}

}
