import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class Main {

	public static void main(String[] args) {
		
		Brueche bruch = new Brueche(42,51);
		System.out.println(bruch);
		System.out.println(bruch.getKommazahl());
	}
	
	
	@Test
	public void testItBaby() {
		Brueche bruchfsd = new Brueche(6,2);
		assertEquals(3,bruchfsd.getKommazahl(),0.0005);
	}

}
