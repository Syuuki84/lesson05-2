package mypackage;

public class Main {
	public static void main(String[] args) {
		Shape[] shapes = { new Circle(), new Square() }; 
		
		for (Shape shape : shapes) { 
			shape.draw(); 
		} 
	}
}