import java.util.Arrays;

public class Searching{
	public static void main(String [] args){
		int [] arr1 = {101, 2, 54, 48, 23, 9, 0};
		System.out.println(Arrays.binarySearch(arr1, 54)); //since array is not sorted
								//result is unpredictable

		Arrays.sort(arr1);

		System.out.println(Arrays.binarySearch(arr1, 9)); // after list is sorted
								//result is index of given nr

		System.out.println(Arrays.binarySearch(arr1, 1));
		//negative value, one index smaller than where a match needs to be inserted to preserver 
		//sorted order
		
	}
}
