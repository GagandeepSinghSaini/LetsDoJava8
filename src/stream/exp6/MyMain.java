package stream.exp6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Sort the list using streams
 * @author gagandeep.singh1
 *
 */

public class MyMain {

	public static void main(String[] args) {
		List<Item> myList = Arrays.asList(
				new Item("A", 10,11000),
				new Item("A", 20,2000),
				new Item("A", 30,13000),
				new Item("B", 15,3000)
				);
		
		myList.forEach(System.out::print);
		System.out.println();
		System.out.println("After Sort");
		/*myList.sort((Item it1, Item it2) -> it1.getSalary() - it2.getSalary());
		myList.forEach(System.out::print);*/
		Comparator<Item> mycomp1  =(Item it1, Item it2) -> it1.getSalary() - it2.getSalary();
		myList.sort(mycomp1.reversed());
		System.out.println(myList);
	}
	
}
