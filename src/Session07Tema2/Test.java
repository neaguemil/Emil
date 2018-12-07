package Session07Tema2;

public class Test {
	public static void main(String[] args) {	
		
//		Square sq = new Square(6);
//		Rectangle rt = new Rectangle(8,5);
//		Circle cr = new Circle(5);
//		
////		System.out.println("Aria patratului este: " + sq.getArea());
////		System.out.println("Perimetrul patratului este: " + sq.getPerimeter());
////		
////		System.out.println("Aria cercului este: " + cr.getArea());
////		System.out.println("Perimetrul cercului este: " + cr.getPerimeter());
////		
////		System.out.println("Aria dreptunchiului este: " + rt.getArea());
////		System.out.println("Perimetrul dreptunghilui este: " + rt.getPerimeter());	
		
		
		Shape[] arr = { new Circle(4), new Rectangle(3,5), new Square(2)};
			for(Shape shape : arr) {
				shape.getArea();
				System.out.println("Aria este: " + shape.getArea());
			}
			
			Shape[] arr1 = { new Circle(4), new Rectangle(3,5), new Square(2)};
			for(Shape shape : arr1) {
				shape.getPerimeter();
				System.out.println("Perimetrul este :" + shape.getArea());
			}		
		}
		}

