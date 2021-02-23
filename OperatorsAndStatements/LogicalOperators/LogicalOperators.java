public class LogicalOperators{
	public static void main(String [] args){
		boolean x = true;
		boolean y = false;

		System.out.println(x&y); //logical AND = true if BOTH operands are true
		System.out.println(x|y);//inclusive OR = only false if both are false
		System.out.println(x^y);//exclusive OR = only true if operands are different
	}
}
