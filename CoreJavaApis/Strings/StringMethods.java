public class StringMethods{
	public static void main(String [] args){

		//length()

		String s1 = "alabala";
		System.out.println(s1.length());
		String s2 = "ba";
		System.out.println(s2.length());
		System.out.println(s1.length() + s2.length() + " is the total length");

		//charAt()

		System.out.println(s2.charAt(0));
		System.out.println(s1.charAt(5));
		
		//indexOf()

		String s3 = "Lorep Ipsum whateverum";

		System.out.println(s3.indexOf("Ipsum", 4)); // (String str, index)
		System.out.println(s3.indexOf('a')); //(Char ch)
		System.out.println(s3.indexOf('e', 5)); //(Char ch, index)
		System.out.println(s3.indexOf("whateverum")); //(String)	
		System.out.println(s3.indexOf("whateverum", 13)); //(negative value) -1 when no match is found

		//substring()

		String s4 = "radiator";
			   //01234567
		
		System.out.println(s4.substring(0, 6)); //radiato
		System.out.println(s4.substring(3)); //iator
		System.out.println(s4.substring(3, 7)); //iato
		

		//toLower/UpperCase() + equals()/equalsIgnoreCase()
		
		String s5 = "haiTa";
		String s6 = "haita";

		System.out.println(s5.equals(s6)); //false
		System.out.println(s5.equalsIgnoreCase(s6)); //true
		System.out.println(s5.toUpperCase().equals(s6.toUpperCase())); //true
		System.out.println(s5.toLowerCase().equals(s6.toUpperCase())); //false
		
		//contains()
		
		System.out.println("abc".contains("a")); //true
		System.out.println("abc".contains("B")); //false

		//replace()

		System.out.println("abc".replace("a", "d")); // (char, char)
		System.out.println("big dick".replace("dick", "heart")); //(Char sequence, Char sequence)

		//trim()

		System.out.println();
		System.out.println("abc");
		System.out.println("\t a b \n c");
		System.out.println("\t a b \n c".trim());

	}
}
