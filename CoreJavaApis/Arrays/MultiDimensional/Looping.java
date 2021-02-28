public class Looping{
	public static void main(String [] args){
		int [][] arr1 = {{454, 1, 32}, {321, 2, 18}, {118, 2, 31}};

		for(int i = 0; i<arr1.length; i++){
			for(int j=0; j<arr1[i].length; j++){
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
	}
}
