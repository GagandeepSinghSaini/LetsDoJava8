package method_referances.exp1;

/**
 * Static Method References
 * @author gagandeep.singh1
 *
 */

public class MyMain {

	public MyMain() {
		System.out.println("In Constructor");
	}
	
	public static void show(String name) {
		System.out.println("Hello "+name+", Welcome!");
	}
	
	public static void main(String[] args) {
		Showable obj = MyMain::show;
		obj.show("Gagandeep Singh Saini");
		
		Thread t1 = new Thread(MyMain::ThreadStatus);
		t1.start();
		
	}
	
	public static void ThreadStatus() {
		System.out.println("Thread is running");
	}
	
}
