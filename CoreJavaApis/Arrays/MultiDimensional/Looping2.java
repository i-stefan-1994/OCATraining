public class Looping2{
	public static void main(String [] args){
		int [][] arr1 = new int[1][3];
		arr1[0][0] = 5;
		arr1[0][1] = 4;
		arr1[0][2] = 2;

		for(int i = 0; i<arr1.length; i++){
			for(int j=0; j<arr1[i].length; j++){
				System.out.print(arr1[i][j] + " ");
			}

			System.out.println();
		}
	}
}
