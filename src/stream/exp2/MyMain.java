package stream.exp2;

import java.util.ArrayList;
import java.util.List;

/**
 * Applying stream on List - filter, map, etc
 * @author gagandeep.singh1
 *
 */

public class MyMain {

	public static void main(String[] args) {
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("A", 11));
		personList.add(new Person("B", 22));
		personList.add(new Person("C", 33));
		
		Person p1 = personList.stream()
				                    .filter(person -> ("X").equals(person.getName()))
				                    .findAny()
				                    .orElse(null);
		
		System.out.println(p1);
		
		String name = personList.stream()
				                .filter(person -> ("T").equals(person.getName()))
				                .map(Person::getName)
				                .findAny()
								.orElse("Person Not Found");
		
		System.out.println(name);
		
	}
	
}
