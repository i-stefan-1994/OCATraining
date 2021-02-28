import java.util.Arrays;

public class Searching2{
	public static void main(String [] args){
		int arr1[] = {4, 1, 2};

		System.out.println(Arrays.binarySearch(arr1, 9));
		Arrays.sort(arr1);

		System.out.println(Arrays.binarySearch(arr1, 2));
	}
}
