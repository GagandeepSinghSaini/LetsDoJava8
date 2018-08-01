package method_referances.exp2;

/**
 * Instance methods references
 * @author gagandeep.singh1
 *
 */

public class MyMain {

	public MyMain() {
		System.out.println("Constructor");
	}
	
	private  void showThread() {
		System.out.println("I am going how you the thread");
	}
	
	public void add(int x, int y) {
		System.out.println("Sum: "+(x+y));
	}
	
	public static void main(String[] args) {
		MyMain mainObj = new MyMain();
		Thread t1 = new Thread(mainObj :: showThread);
		t1.start();
		System.out.println("Done ");
		
		Arithmetic hh = mainObj :: add;
		hh.add(10,20);

		
	}
	
}
