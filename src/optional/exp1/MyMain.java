package optional.exp1;

import java.util.Optional;

public class MyMain {

	public static void main(String[] args) {
		Optional<String> gender = Optional.of("MALE");
		String answer1 = null;
		String answer2 = "Yes";
		
		System.out.println("Non-Empty Optional: ["+gender+", "+gender.get().toLowerCase()+", "+Optional.empty()+"]");
		
		System.out.println("checking answer1: [ "+Optional.ofNullable(answer1).orElse("EMPTY STRING: answer1: "+answer1+"]"));
		
		Optional.ofNullable(answer2).ifPresent(s -> System.out.println("answer2: "+answer2));
		
		if(!Optional.ofNullable(answer1).isPresent()) {
			System.out.println("answer1 is : "+answer1);
		}
		
		
	}
	
	public static Object check(Object obj) {
		return Optional.ofNullable(obj).orElse("EMPTY STRING");
	}
	
}
