package lambda.exp2;

public class Draw {

	public static void main(String[] args) {
		ShapeDraw d1 = (shape) -> { System.out.println("Draw: "+shape); };
		
		d1.draw("Circle");
		d1.draw("RECTANGLE");
	}
	
}
