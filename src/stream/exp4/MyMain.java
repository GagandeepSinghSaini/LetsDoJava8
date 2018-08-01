package stream.exp4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Grouping the objects according to occurence
 * @author gagandeep.singh1
 *
 */

public class MyMain {

	public static void main(String[] args) {
		List<Item> myList = Arrays.asList(
				new Item("A", 10),
				new Item("A", 20),
				new Item("A", 30),
				new Item("B", 15)
				);
		
		Map<String, Long> hm = myList.stream().collect(Collectors.groupingBy(Item::getName, Collectors.counting()));
		
		System.out.println(hm);
		
		Map<String, Integer> hm2 = myList.stream().collect(Collectors.groupingBy(Item::getName, Collectors.summingInt(Item::getQty)));
		System.out.println(hm2);
	}
	
}
