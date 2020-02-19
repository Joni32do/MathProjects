package ProjectsWithJona;

import java.util.List;
import java.util.Vector;

public class OurVector {

		private final List<Double> vec;
		private final int dimension;
		private double betrag = 0;
		private static int vectorsGenerated;

		
		public OurVector(double x1, double x2) {
			super();
			List<Double> input = new Vector<Double>();
			input.add(x1);
			input.add(x2);
			vec = input;
			dimension = vec.size();
			setVectorsGenerated(getVectorsGenerated() + 1);
		}
		public OurVector(double x1, double x2, double x3) {
			super();
			List<Double> input = new Vector<Double>();
			input.add(x1);
			input.add(x2);
			input.add(x3);
			vec = input;
			dimension = vec.size();
			setVectorsGenerated(getVectorsGenerated() + 1);
		}
		public OurVector(double x1, double x2, double x3, double x4) {
			super();
			List<Double> input = new Vector<Double>();
			input.add(x1);
			input.add(x2);
			input.add(x3);
			input.add(x4);
			vec = input;
			dimension = vec.size();
			setVectorsGenerated(getVectorsGenerated() + 1);
		}
		public OurVector(List<Double> newVec) {
			vec = newVec;
			dimension = vec.size();
			setVectorsGenerated(getVectorsGenerated() + 1);
		}
			
		
		protected void printVector() {
			System.out.println("Der Vektor hat die Koordinaten:");
			vec.stream().forEach(x -> System.out.println(x));
			System.out.println("_______________Ende der Durchsage_______________");
			System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
		}
		
		protected double calculateBetrag() {
			betrag = 0;
			vec.parallelStream().forEach(x -> betrag += x*x );
			betrag = Math.sqrt(betrag);
			
			return betrag;
		}
		
		public List<Double> getVec() {
			return vec;
		}
		public int getDimension() {
			return dimension;
		}
		public static int getVectorsGenerated() {
			return vectorsGenerated;
		}
		public static void setVectorsGenerated(int vectorsGenerated) {
			OurVector.vectorsGenerated = vectorsGenerated;
		}
		
		@Override
		public String toString() {
			
			String c = "";
			for(int i = 0; i < this.getDimension(); i++) {
				c += "x" + (i+1) + " Koordinate : " + this.getVec().get(i) + " \n" ;
			}
			return c;
		}
		
		
		protected OurVector addVector(OurVector vec2) {
			
			List<Double> newVec = new Vector<Double>();
			
			if(this.getDimension()!=vec2.getDimension()) {
				System.out.println("des geht doch gar nicht - Fehler");
			}
			else   {
			
				for(int i=0; i<this.getDimension(); i++) {
				newVec.add(this.getVec().get(i)+vec2.getVec().get(i));
				}
			}
			return new OurVector(newVec);
		}
		
		
		protected OurVector skalarMulti(double skalar) {
			List<Double> newVec = new Vector<Double>();
			
			for(int i = 0; i < this.getDimension(); i++) {
				
				newVec.add(this.getVec().get(i)*skalar);
			}
			
			return new OurVector(newVec);
			
		}
		
		protected OurVector dotProduct(OurVector vec2) {
			
			List<Double> newVec = new Vector<Double>();
				

			if(this.getDimension()!=vec2.getDimension()) {
				System.out.println("des geht doch gar nicht - Fehler");
			}
			else {
				for(int i=0; i<this.getDimension(); i++) {
					newVec.add(this.getVec().get(i)*vec2.getVec().get(i));
					}
				}
				return new OurVector(newVec);
		}
		
		protected OurVector crossProduct(OurVector vec2) {
			
			List<Double> newVec = new Vector<Double>();
		
			if(this.getDimension()!=vec2.getDimension()) {
				System.out.println("des geht doch gar nicht - Fehler");
			}
			else {
				if(this.getDimension() != 3) {
					System.out.println("Sorry, das eher so ein dreier Ding");
				}
				else {
					newVec.add(this.getVec().get(1)*vec2.getVec().get(2)-
									(this.getVec().get(2)*vec2.getVec().get(1)));
					
					newVec.add(this.getVec().get(2)*vec2.getVec().get(0)-
							(this.getVec().get(0)*vec2.getVec().get(2)));
					
					newVec.add(this.getVec().get(0)*vec2.getVec().get(1)-
							(this.getVec().get(1)*vec2.getVec().get(0)));
					}
				}
			
			
			return new OurVector(newVec);
		}
		
		

}
