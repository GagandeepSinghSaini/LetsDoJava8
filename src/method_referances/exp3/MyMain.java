package method_referances.exp3;

/**
 * Constructor References
 * @author gagandeep.singh1
 *
 */

public class MyMain {

	public MyMain() {
		System.out.println("Hello!, I am constructor");
	}
	public MyMain(String msg) {
		System.out.println("Hello!, I am constructor: "+msg);
	}
	
	public static void main(String[] args) {
		Showable obj = MyMain::new;
		obj.show("Gagandeep Singh Saini");
	}
	
}
