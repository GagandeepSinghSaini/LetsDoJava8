package stream.exp1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Applying stream to collections
 * @author gagandeep.singh1
 *
 */

public class MyMain {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10,20,40,18,null,5,7,8,2,4,5,6,7,8,23,56,34,32,57);
		
		List<Integer> myNewList = myList.stream()
			  .filter(num -> num != null)
		      .filter(num -> num > 10)
		      .collect(Collectors.toList());
		
		myNewList.forEach(System.out::println);
		
	}
	
}
