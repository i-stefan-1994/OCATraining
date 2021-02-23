public class ArrayCreation{
	public static void main(String [] args){
		int [] a1 = new int[1]; //pre paranthesis
		int a2 [] = new int [2]; //post parenthesis
		int a3 [] = new int[] {4, 5}; // directly initialized
		int [] a4 = {42, 12, 2}; //anonymous array -> type and size not specified

		//single line declaration 
		
		int [] a5, a6; // multiple int[] arrays
		int a7[], a8; // a7 array, a8 int

		//created with reference variable
		
		String [] bugs = {"cricket", "roach", "beetle"};
		String [] referenceBugs = bugs;

		System.out.println(bugs.equals(referenceBugs));
	}
}
