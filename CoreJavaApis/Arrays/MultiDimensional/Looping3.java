public class Looping3{
	public static void main(String [] args){
		int [][] arr1 = {{3, 1, 2}, {5, 42, 1}, {21, 8, 5}};

		for(int [] first : arr1){
			for(int second : first){
				System.out.print(second + " ");
			}
			System.out.println(" ");
		}
	}
}
