public class Varargs{
	public static void main(String [] args){
		
		walk(1);
		walk(2, 3);
		walk(4, new int[]{5, 6});
		walk(1, 2, 3);
		try{
			walk(1, null); //compiles but throws NullPointerException
		}catch(NullPointerException e){
			System.out.println("Null pointer exception");
		}

		//varargs use array indexing
		run(1, 2);

	}

	public static void walk(int start, int...nums){
		System.out.println(nums.length);
	}

	public static void run(int...nums){
		System.out.println(nums[1]);
	}
}
