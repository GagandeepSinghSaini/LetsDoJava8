package lambda.exp4;

public class StringUtil {

	public static void main(String[] args) {
		
		IString str = (message) -> {
			String str1 = message;
			str1 = str1 + "world";
			return str1;
			
		};
		
		System.out.println("-> "+str.show("hello"));
		
	}
	
}
