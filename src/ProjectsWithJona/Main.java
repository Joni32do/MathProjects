/**
 * 
 */
package ProjectsWithJona;

/**
 * @author Jonathan
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		OurVector guenther = new OurVector(1,2,2);
		OurVector robert = new OurVector(0,1,1);
		OurVector schubert = new OurVector(52,1,6);
		
		System.out.println(guenther.addVector(robert));
		System.out.println(guenther.crossProduct(robert));
		System.out.println(guenther.dotProduct(robert));
		System.out.println(guenther.skalarMulti(5.0));
		System.out.println(guenther.calculateBetrag());

		Matrix gerda = new Matrix(guenther, robert, schubert);
		System.out.println(gerda.getColumn());
		System.out.println(gerda.getRow());
		// System.out.println(gerda);
		
	}

}
