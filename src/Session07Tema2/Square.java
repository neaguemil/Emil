package Session07Tema2;

public class Square implements Shape {

	double L;
	Square(double L){
		this.L = L;
	}
	
	public double getArea() {
		return  L * L; 		
	}
	
	public double getPerimeter() {
		return 4 * L;		
	}
}
