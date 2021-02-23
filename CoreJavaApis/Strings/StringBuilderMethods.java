public class StringBuilderMethods{
	public static void main(String [] args){

		//creation
		StringBuilder s1 = new StringBuilder();
		StringBuilder s2 = new StringBuilder(10); //capacity = 10 chars

		//append() - append can be called without having to convert elements to String

		int a = 1;
		boolean b = true;
		String string1 = "-";

		System.out.println(s1.append(a).append(b).append(string1).append('g')); 

		//insert()

		System.out.println(s1.insert(0, "benis"));
		
		//delete() + deleteCharAt()
		
		System.out.println(s1.delete(0, 2)); //nis1true-g
		System.out.println(s1.deleteCharAt(8));

		//reverse

		System.out.println(s1.reverse());

		//toString();
		
		s1.toString(); //transforms SB into String
		
	}
}
