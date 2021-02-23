import java.util.Arrays;

public class SortingStrings{
	public static void main(String [] args){
		String [] arr1 = {"100", "9", "1"};
		Arrays.sort(arr1);

		for(int i = 0; i < arr1.length; i++){
			System.out.println(arr1[i]);
		}

		//Java sorts Strings alphabetically, 0 -> 9
	}
}
