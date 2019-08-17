package week06.slot02.interfaces;

public class TestInterface {

	public static void main(String[] args) {
		Clickable clickable = new Circle("RED", 10.1);
		clickable.click();
		clickable = new Picture("MyPicture.jpg");
		clickable.click();
		
		// Square does not implements Clickable interface
		// The implementation below is not valid.
//		clickable = new Square("BLUE", 5.5);
	}
	
}
