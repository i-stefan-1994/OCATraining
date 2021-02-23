public class Equality{
	public static void main(String [] args){
		String s1 = "Hello World"; //evaluated at compilation
		String s2 = " Hello World".trim(); //evaluated at runtime

		System.out.println(s1==s2); //false


		String s3 = new String("Hello World");
		String s4 = new String("Hello World");

		System.out.println(s3==s4);
	}
}
