package ProjectsWithJona;

import java.util.List;
import java.util.Vector;

public class Matrix {

	private static final List<OurVector> Identity = null;
	private final List<OurVector> mat;
	private final int row;
	private final int column;
	
	public Matrix(OurVector vec1, OurVector vec2) {
		List<OurVector> input = new Vector<OurVector>();
		if(vec1.getDimension() != vec2.getDimension()) {
			System.out.println("Pech gehabt!");
			input = Identity;
		}
		else {
		input.add(vec1);
		input.add(vec2);
		}
		mat = input;
		column = this.mat.size();
		row = vec1.getDimension();
	}
	
	public Matrix(OurVector vec1, OurVector vec2, OurVector vec3) {
		List<OurVector> input = new Vector<OurVector>();
		if(vec1.getDimension() == vec2.getDimension() && 
				vec1.getDimension() == vec3.getDimension() && 
				vec2.getDimension() == vec3.getDimension()) {
			
		input.add(vec1);
		input.add(vec2);
		input.add(vec3);
		}
		else {
			System.out.println("Falsche Dimensionen");
		}
		mat = input;
		column = this.mat.size();
		row = vec1.getDimension();
		
	}
	
	public Matrix(List<OurVector> mat) {
		this.mat = mat;
		this.column = mat.size();
		this.row = mat.get(0).getDimension();
	}
	

	public List<OurVector> getMat() {
		return mat;
	}

	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}
	
	
	@Override
	public String toString() {
		String c = "";
		for(int i = 0; i < 1; i++) {
			for(int j= 0; i < 1; j++) {
				c += " " + this.getMat().get(j).getVec().get(i) + " ";
			}
			c += "\n";
		}
		return c;
	}

	
}
