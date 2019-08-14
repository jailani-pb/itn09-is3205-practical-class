package week06.slot01.abstraction;

public class TestShape2D {

	public static void main(String[] args) {
		// Shape2D is an abstract class
		// Cannot create an instance of Shape2D
//		Shape2D shape1 = new Shape2D("RED");
		
		// Can only create an instance from concrete classes.
		Circle circle1 = new Circle("RED", 12.3);
		Rectangle rectangle1 = new Rectangle("BLUE", 16.4, 9.3);
		Square square1 = new Square("GREEN", 3.4);
	}
	
}
