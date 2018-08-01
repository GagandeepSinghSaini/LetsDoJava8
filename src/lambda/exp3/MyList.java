package lambda.exp3;

import java.util.ArrayList;
import java.util.List;

public class MyList {

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>();
		List<Integer> myList1 = new ArrayList<Integer>();
		
		for(int count = 0 ; count < 10; count++) {
			myList.add(count);
		}
		for(int count = 0 ; count < 5; count++) {
			myList.add(count);
		}
		
		myList.forEach((item) -> System.out.print(item+", "));
		System.out.println();
		myList.forEach(
				(itm) -> {
						if(itm != null && !myList1.contains(itm)) {
							myList1.add(itm);
							System.out.print(itm+"/");
						}
				}
		);
	}
	
}
