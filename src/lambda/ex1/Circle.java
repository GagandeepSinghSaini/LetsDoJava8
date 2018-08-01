package lambda.ex1;

public class Circle {

	public static void main(String[] args) {
		Drawing d1 = () -> {
			System.out.println("Drawing: circle");
		};
		
		Drawing d2 = () -> {
			System.out.println("Drawing: circle2");
		};
		
		d1.draw();
		d2.draw();
	}
	
}
