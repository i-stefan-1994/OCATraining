public class StringPractice1{
	public static void main(String [] args){
		String s1 = "abc";
		String s2 = "cde";
		String s3 = s1.concat(s2);

		System.out.println(s3);

		//numeric adition left side, concatenation right side
		String s4 = 1 + 2 + "3";//33

		System.out.println(s4);

		//length()
		int l1 = s4.length();
		System.out.println(l1);
		String s5 = "alabalaportocala";
		System.out.println(s5.length());
		String s6 = "panadecurentelectric";
		System.out.println(s6.length());
		int l2 = s6.length();
		System.out.println(l1 + l2 + s5.length());

		//charAt()

		System.out.println(s5.charAt(0));
		System.out.println(s5.charAt(1));
		System.out.println(s5.charAt(2));
		System.out.println(s5.charAt(3));
		System.out.println(s5.charAt(4));
		System.out.println(s5.charAt(5));
		System.out.println(s5.charAt(6));
		System.out.println(s6.charAt(0));
		System.out.println(s6.charAt(1));
		System.out.println(s6.charAt(2));
		System.out.println(s6.charAt(3));
		System.out.println();
		
		for(int i = 0; i < s6.length(); i++){
			System.out.println(s6.charAt(i));
		}

		/*indexOf(char ch)
		 * indexOf(char ch, index fromIndex)
		 * indexOf(String)
		 * indexOf(String str, index fromIndex)
		 */

		String str1 = "VasileBurebistaCuceritorul";
		char ch1 = str1.charAt(str1.indexOf("Cuceritorul"));

		System.out.println(str1.indexOf("Cuceritorul"));
		System.out.println(ch1);
		System.out.println(s6.indexOf('c', 8));
		System.out.println(s6.indexOf("pana"));
		System.out.println(s6.indexOf("feather")); //-1 cand nu gaseste

		//substring(begin inded, end index)
		//stops BEFORE end index 
		
		String str2 = "DragonEggs";
		System.out.println(str2.substring(6));
		//end parameter is allowed to be 1 past index
		System.out.println(str2.substring(6, 10));
		String check1 = str2.substring(6);
		String check2 = str2.substring(6,10);
		System.out.println(check1.equals(check2));
		System.out.println(str2.substring(6,6));//empty string
		
		try{
			System.out.println(str2.substring(6,5));
		}catch(Exception e){
			System.out.println("Index out of bounds exception");
		}

		System.out.println(str2.substring(6, 9).toUpperCase());

		//toUpperCase() + toLowerCase()
		//creates a new string since the original stays the same


		//equals() + equalsIgnoreCase()

		String es1 = str2.substring(6, 9);
		String es2 = "Egg".toUpperCase();

		System.out.println("equals: "+ es1.equals(es2));
		System.out.println("equals ignore case: " + es1.equalsIgnoreCase(es2));

		String es3 = "Salad".toUpperCase();
		String es4 = "Sal".concat("ad");
		String es5 = es4.toUpperCase();

		System.out.println("== " + (es3 == es4));
		System.out.println("equals: " + es3.equals(es4));
		System.out.println("equals ignore case: " + es3.equalsIgnoreCase(es4));
		System.out.println("== " + (es4.toUpperCase() == es5));


		//startsWith(String prefix) + endsWith(String suffix)
		
		System.out.println(es3.startsWith("S"));
		System.out.println(es2.startsWith("E"));
		System.out.println(es3.endsWith("d"));
		System.out.println(es3.endsWith("D"));
		System.out.println(es2.endsWith("d"));


		//contains()

		System.out.println(es3.contains("AD"));
		System.out.println("Pache Protopopicitoricescovici".contains("Pache"));
		System.out.println(str1.contains("Vasile"));
		System.out.println("bere".substring(1, 4).concat("rere").contains("re"));


		//replace(old char, new char)
		//replace(old String, new String)
		
		String r1 = "Dragon Hoard";

		if(r1.contains("Hoard")){
			r1 = r1.replace("Hoard", "Board");
			System.out.println(r1);
		}

		if(r1.substring(7).equals("Board")){
			r1 = r1.replace("Board", "Sword");
			System.out.println(r1);
		}

		if(r1.substring(7).equalsIgnoreCase("sword")){
			r1 = r1.replace("Sword", "Blood");
			System.out.println(r1);
		}

		if(r1.substring(7).startsWith("B")){
			r1 = r1.replace("Blood", "Souls");
			System.out.println(r1);
		}

		if(r1.substring(7).endsWith("s")){
			r1 = r1.replace("Souls", "Husks");
			System.out.println(r1);
		}

		//trim()

		String t1 = " abc ";
		String t2 = "abc";

		System.out.println(t1.trim().equals(t2));

	}
}
