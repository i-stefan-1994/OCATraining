import java.util.Arrays;

public class SortingStrings2{
	public static void main(String [] args){
		String [] arr1 = {"100", "0", "99"};

		Arrays.sort(arr1);

		for(String str : arr1){
			System.out.print(str + ", ");
		}
	}
}
