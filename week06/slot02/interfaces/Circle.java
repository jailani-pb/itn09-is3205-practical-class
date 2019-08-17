package week06.slot02.interfaces;

public class Circle extends Shape2D implements Clickable, Movable {

	private double radius;
	
	public Circle(String colour, double radius) {
		super(colour);
		setRadius(radius);
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double getPerimeter() {
		return Math.PI * radius * 2;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
		if(this.radius < 0) {
			this.radius = 0;
		}
	}

	@Override
	public void move() {
		System.out.println("Circle is moved.");
	}

	@Override
	public void click() {
		System.out.println("Circle is clicked.");
	}
	
}
