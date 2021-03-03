
public class AutoboxingPractice{
	public static void main(String [] args){
	
		//parseInt() - returns a primitive

		int i = Integer.parseInt("123");
		int i1 = Integer.parseInt("23");
		int i2 = Integer.parseInt("412");
		int i4 = Integer.parseInt("123");
		int i5 = Integer.parseInt("412");
		int i6 = Integer.parseInt("1235");
		int i7 = Integer.parseInt("655");
		int i8 = Integer.parseInt("512");
		int i9 = Integer.parseInt("412");
		
		System.out.println(i);

		//valueOf() - returns a Wrapper
			//Character does not participate -> Calling String.charAt()
		Integer w1 = Integer.valueOf(2);
		Integer w2 = Integer.valueOf(3);
		Integer w3 = Integer.valueOf(5);
		Integer w4 = Integer.valueOf(4);
		Integer w5 = Integer.valueOf(5);
		Integer w6 = Integer.valueOf(6);
		Integer w7 = Integer.valueOf(5);
		Integer w8 = Integer.valueOf(5);
		Integer w9 = Integer.valueOf(2);

	
	}
}
