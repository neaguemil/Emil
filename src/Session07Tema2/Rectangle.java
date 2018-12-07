package Session07Tema2;

public class Rectangle implements Shape {

	 double Ld,ld;
	Rectangle(double Ld, double ld){
		this.ld = ld;
		this.Ld = Ld;
	}
	
	public double getArea() {
		return  Ld *ld;
	}

	public double getPerimeter() {
		return 2* (Ld + ld);	
	}

}
