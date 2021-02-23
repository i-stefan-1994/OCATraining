import java.util.Arrays;

public class Sorting{
	public static void main(String [] args){
		int [] arr1 = {1, 5, 6, 2, 31, 9, 0};
		Arrays.sort(arr1);

		for(int i=0; i<arr1.length; i++){
			System.out.println(arr1[i]);
		}
	}
}
