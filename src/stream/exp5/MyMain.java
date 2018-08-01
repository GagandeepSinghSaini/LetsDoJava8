package stream.exp5;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Grouping the elements of the list
 * @author gagandeep.singh1
 *
 */

public class MyMain {

	public static void main(String[] args) {
		List<Item> myList = Arrays.asList(
				new Item("A", 10,100),
				new Item("A", 20,200),
				new Item("A", 30,1300),
				new Item("B", 15,1300)
				);
		
		Map<Integer, List<Item>> groupByPriceMap = myList.stream().collect(Collectors.groupingBy(Item::getPrice));
		System.out.println(groupByPriceMap);
		
		Map<Integer, Set<String>> result = myList.stream().collect(Collectors.groupingBy(Item::getPrice, Collectors.mapping(Item::getName, Collectors.toSet()))); 
		System.out.println(result);
	}
	
}
