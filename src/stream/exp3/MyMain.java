package stream.exp3;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Convert array to stream
 * @author gagandeep.singh1
 *
 */

public class MyMain {

	public static void main(String[] args) {
		String[] str = {"F","X","E","W","W"};
		
		// Method 1: Arrays.stream
		Stream<String> stream1 = Arrays.stream(str);
		stream1.forEach(System.out::println);
		
		// Method 2: Stream.of
		Stream<String> stream2 = Stream.of(str);
		stream2.forEach(System.out::println);
		
		
		
	}
	
}
