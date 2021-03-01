
public class MultiDimentionalArraysPractice{
	public static void main(String [] args){
		
		//creating and looping
		
		int[][]cl1 = new int[3][2];
		cl1[0][0]= 1;
		cl1[0][1]= 4;
		cl1[1][0]= 28;
		cl1[1][1]= 7;
		cl1[2][0]= 9;
		cl1[2][1]= 56;

		for(int i = 0; i < cl1.length; i++){
			for(int j = 0; j < cl1[i].length;j++){
				System.out.print(cl1[i][j] + " ");
			}
			System.out.println();
		}
	}
}
