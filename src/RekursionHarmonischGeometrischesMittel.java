
public class RekursionHarmonischGeometrischesMittel {
	
	public static void main(String args[]){
		
		double a = 1;
		
		double b = 4;
		
		for(int i = 1; i < 100; i++) {
			double a1 = 2/((1/a)+(1/b));
			b = Math.sqrt(a*b);
			a = a1;
			
		}
		
		System.out.println(a + " und "+ b+ " ist der Grenzwert");
	}

}
