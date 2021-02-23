public class ShortcircuitOperators{
	public static void main(String [] args){
		int x = 5;
		boolean z = false;

		boolean y = z || (x <= 5);
		System.out.println(y);
	}
}
