package Session07Tema2;

public class Circle implements Shape {

	double r;
	Circle(double r){
		this.r = r;
	}
	
	public double getArea() {
		return  Math.PI * r * r;		
	}

	public double getPerimeter() {
		return 2 * Math.PI * r;		
	}	

}
