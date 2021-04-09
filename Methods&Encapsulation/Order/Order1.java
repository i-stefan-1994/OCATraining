public class Order1{

	private static int counter = 0;

	static{
		++counter;
		System.out.println("Static initializer: " + counter);
	}

	{
		++counter;
		System.out.println("Instance initializer: " + counter);
	}

	static{
		++counter;
		System.out.println("Static initializer: " + counter);
	}

	static{
		new Order1();
		System.out.println("Constructor");
	}

	Order1(){
		++counter;
		System.out.println("constructor counter: " + counter);
	}

	public static void main(String [] args){
		
	}
}
