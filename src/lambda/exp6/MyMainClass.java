package lambda.exp6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyMainClass {

	public static void main(String[] args) {
		List<Product> prodList = new ArrayList<Product>();
		
		prodList.add(new Product(3, "Three"));
		prodList.add(new Product(1, "One"));
		prodList.add(new Product(2, "Two"));
		
		prodList.forEach((product) -> {
			System.out.print("["+product.getId()+", "+product.getName()+"]");
		});
		
		Collections.sort(prodList,(p1,p2) -> {
			return p1.getId().compareTo(p2.getId()); 
		});
		
		System.out.println();
		System.out.print("FINAL LIST: [");
		prodList.forEach((product) -> {
			System.out.print("["+product.getId()+", "+product.getName()+"]");
		});
		System.out.println("]");
		
		Collections.sort(prodList, (p1,p2) -> {
			return p1.getName().compareTo(p2.getName());
		});
		
		System.out.println();
		System.out.print("FINAL LIST: [");
		prodList.forEach((product) -> {
			System.out.print("["+product.getId()+", "+product.getName()+"]");
		});
		System.out.println("]");
	}
	
}
