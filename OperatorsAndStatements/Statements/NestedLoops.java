public class NestedLoops{
	public static void main(String [] args){
	
		int [][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};

	OUTER_LOOP:for(int simpleArray []:myComplexArray){
		INNER_LOOP:for(int i = 0; i < simpleArray.length; i++){
				System.out.print(simpleArray[i]+"\t");
			}
			System.out.println();
		}
	}
}
