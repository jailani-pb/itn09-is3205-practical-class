package week06.slot02.interfaces;

public class Rectangle extends Shape2D implements Clickable {

	private double length;
	private double height;
	
	public Rectangle(String colour, double length, double height) {
		super(colour);
		setLength(length);
		setHeight(height);
	}
	
	public double getArea() {
		return length * height;
	}
	
	public double getPerimeter() {
		return (2 * length) + (2 * height);
	}
	
	public double getLength() {
		return length;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setLength(double length) {
		this.length = length;
		if(this.length < 0) {
			this.length = 0;
		}
	}
	
	public void setHeight(double height) {
		this.height = height;
		if(this.height < 0) {
			this.height = 0;
		}
	}

	@Override
	public void click() {
		System.out.println("Rectangle is clicked.");
	}



}
