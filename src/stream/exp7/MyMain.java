package stream.exp7;

import java.util.Arrays;

/**
 * Reduce (Streams API) -> Many times, we need to perform operations where a stream reduces to single resultant value, 
 * for example, maximum, minimum, sum, product, etc. Reducing is the repeated process of combining all elements.
 * @author gagandeep.singh1
 *
 */

public class MyMain {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40};
		
		int sum = Arrays.stream(arr).reduce(0,(x,y) -> x+y);
		System.out.println("Sum: "+sum);
		
	}
	
}
