public class UnreachableExample1{
	public static void main(String [] args){
		int x = 4;
		long y = x * 4 - x++;

		if(y<10) System.out.println("Too low");
		else System.out.println("Just Right");
		else System.out.println("w/e");
	}
}
