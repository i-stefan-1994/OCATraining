public class StringBuilderPractice1{
	public static void main(String [] args){
		
		//StringBuilder is mutable

		StringBuilder example1 = new StringBuilder();
		for(char current = 'a'; current <= 'z'; current++)
			example1.append(current);
		System.out.println(example1);


		//mutability and chaining - SB changes its own state and returns a reference to itself
		
		//Creation of SB

		StringBuilder c1 = new StringBuilder();
		StringBuilder c2 = new StringBuilder(10);
		StringBuilder c3 = new StringBuilder("abc");
		System.out.println(c3.length());

		//charAt(), indexOf(), length(), substring() like in String

		//append() -> adds parameter to the Sb and returns reference
		StringBuilder a1 = new StringBuilder();
		a1.append("-").append(true).append(c3.charAt(c3.indexOf("b")));		
		System.out.println(a1);

		//insert(int offset, String str)

		a1.insert(0, "inserted");
		System.out.println(a1);
		a1.insert(9, "+");
		System.out.println(a1);

		//delete(int start, int end) + deleteCharAt(index)

		System.out.println(a1.delete(a1.indexOf("inserted"), a1.indexOf("-")));
		System.out.println(a1.deleteCharAt(a1.indexOf("b")));
		System.out.println(a1.append("randomText1").append(1).append(2.25));
		System.out.println(a1.delete(0, 1));
		System.out.println(a1.insert(a1.indexOf("1"), "=").delete(a1.indexOf("112.25"), a1.indexOf("5")));
		System.out.println(a1.deleteCharAt(a1.length() - 2));

		//reverse()

		System.out.println(a1.reverse());

		for(int i = 0; i < a1.length(); i++){
			System.out.println(i + " " + a1.charAt(i));
		}

		//toString() - converts SB to String

		//SB does not implement .equals()

		StringBuilder e1 = new StringBuilder("pc");
		StringBuilder e2 = new StringBuilder("p");
		e2.append("c");
		System.out.println(e1.equals(e2)); //false
	}
}
