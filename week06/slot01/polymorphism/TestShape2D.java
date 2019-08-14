package week06.slot01.polymorphism;

import week06.slot01.abstraction.*;

public class TestShape2D {

	public static void main(String[] args) {
		Shape2D shape1 = new Circle("RED", 4.75);
		System.out.println(shape1);
		shape1 = new Rectangle("BLUE", 40.3, 8.7);
		System.out.println(shape1);
		shape1 = new Square("GREEN", 20.3);
		System.out.println(shape1);
		
		Shape2D[] shapes = new Shape2D[5];
		shapes[0] = new Circle("RED", 4.75);
		shapes[1] = new Rectangle("BLUE", 40.3, 8.7);
		shapes[2] = new Square("GREEN", 20.3);
		shapes[3] = new Circle("YELLOW", 10.9);
		shapes[4] = new Circle("TEAL", 80.5);
		
		System.out.println(shapes[0] + " " 
				+ shapes[0].getArea() + " " + shapes[0].getPerimeter());
//		System.out.println(shapes[0].getRadius());
		
		((Circle) shapes[0]).getRadius();
		System.out.println(((Circle) shapes[0]).getRadius());
		((Rectangle) shapes[1]).getLength();
		System.out.println(((Rectangle) shapes[1]).getLength());
		
		Rectangle tempRectangle = (Rectangle) shapes[1];
		System.out.println(tempRectangle.getLength());
		// Make sure to type cast into the right class.
//		((Circle) shapes[2]).getRadius();
		
		for(int i = 0; i < shapes.length; i++) {
			if(shapes[i] instanceof Circle) {
				System.out.println(shapes[i] + " " 
						+ ((Circle) shapes[i]).getRadius());
			}
			if(shapes[i] instanceof Rectangle) {
				System.out.println(shapes[i] + " " 
						+ ((Rectangle) shapes[i]).getLength() + " "
						+ ((Rectangle) shapes[i]).getHeight());
			}
			if(shapes[i] instanceof Square) {
				System.out.println(shapes[i] + " "
						+ ((Square) shapes[i]).getSide());
			}
		}
	}
	
}
