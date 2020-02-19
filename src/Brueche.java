
/**
 * A class to create a fraction
 * 
 * consist of a zaehler and nenner and allows all possible operations
 * 
 * @param zaehler
 * @param nenner
 * @class-invariant the Nenner cannot be 0
 * @author Jonathan
 *
 */
public class Brueche{ 
	
	private final int zaehler;
	private final int nenner;
	
	/**
	 * Creates an object of the type Brueche
	 * @param zaehler
	 * @param nenner
	 */
	protected Brueche(int zaehler, int nenner) {
		
		super();
		if(nenner == 0) {
			nenner = 1;
			System.out.println("Man kann nicht durch Null teilen, du dummes Arschgesicht");
		}
		this.zaehler = zaehler;
		this.nenner = nenner;
		//assert bnenner != 0 : "Teilen durch 0 nicht möglich";
	}

	public int getZaehler() {
		return zaehler;
	}

	public int getNenner() {
		return nenner;
	}
	/**
	 * returns a String representation of the Bruch
	 */
	@Override
	public String toString() {
		String c = zaehler + " / " + nenner;
		return c;
		}
	/**
	 * prints a Bruch in the console
	 */
	public void printBruch(){
		System.out.println(toString());
	}
	
	/**
	 * Adds a one to the Bruch
	 * @return output
	 */
	public Brueche addOneToBruch() {
		int newZaehler = zaehler + nenner;
		Brueche output = new Brueche(newZaehler, nenner);
		return output;
	}
	
	/**
	 * Adds a bruch to the bruch which executes the command 
	 * @param bruch1
	 * @return
	 */
	/*
	 * @requires newZaehler <= Integer.maxValueOfInt
	 * @requires newZaehler >= Integer.minValueOfInt
	 * @ensure output.nenner != 0 && output.nenner != null 
	 */
	public Brueche addiereBrueche(Brueche bruch1) {
		int newZaehler = this.getZaehler()*bruch1.getNenner()+
								this.getNenner()*bruch1.getZaehler();
		int newNenner = this.getNenner()*bruch1.getNenner();
		Brueche output = new Brueche(newZaehler, newNenner);
		output = output.kuerzen();
		return output;
	}
	
	public Brueche addiereBrueche(Brueche bruch1, Brueche bruch2) {
		return this.addiereBrueche(bruch1.addiereBrueche(bruch2));
	}
	
	/**
	 * subtracts a inputed bruch from the bruch
	 * @param bruch1
	 * @param bruch2
	 * @return
	 */
	public Brueche subtrahiereBrueche(Brueche bruch1) {
		
		Brueche negative2 = new Brueche(-1*bruch1.getZaehler(),bruch1.getNenner());
		
		return this.addiereBrueche(negative2);
		
	}
	
	
	public Brueche kuerzen() {
		
		int a = this.getZaehler();
		int b = this.getNenner();
		int rest = 0;
		
		/*
		 * @loop-invariant \old b == \new a
		 * @decreasing a
		 */
		do {
			rest = a%b;
			a = b;
			b = rest;			
		} while(rest != 0);
		
		Brueche output = new Brueche(this.getZaehler()/a,this.getNenner()/a);
		
		return output;
		
	}
	
	
	
	public double getKommazahl() {
		double bruchAlsKomma = (double) this.getZaehler() / (double) this.getNenner();
		System.out.println(this.getZaehler());
		System.out.println(this.getNenner());
		return bruchAlsKomma;
	}
	
	
	
	
	
	
	
	

}
