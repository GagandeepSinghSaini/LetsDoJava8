package lambda.exp5;

public class ThreadUtil {

	public static void main(String[] args) {
		Runnable r1 = () -> {
			System.out.println("Thread is running");
		};
		
		Thread t1 = new Thread(new ThreadHelper());
		t1.start();
		Thread t2 = new Thread(r1);
		t2.start();
		System.out.println("Thread Ends");
		
	}
	
}
