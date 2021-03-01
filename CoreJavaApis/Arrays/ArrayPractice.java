import java.util.Arrays;

public class ArrayPractice{
	public static void main(String [] args){
		
		int[] e1 = new int[1];
		e1[0] = 2;

		System.out.println(e1.length);

		//sorting - Arrays.sort() - java.util.Arrays;
		
		int[]e2 = {4, 8, 1, 3, 0};
		Arrays.sort(e2);
		for(int i:e2){
			System.out.print(i + " ");
		}

		int[]s1 = {4, 1, 4, 8, 13, 99, 4};
		Arrays.sort(s1);
		for(int i : s1){
			System.out.print(i + " ");
		}

		int[]s2 = {4, 1, 2, 3, 6, 7, 1, 7, 2, 5};
		Arrays.sort(s2);
		for(int i : s2){
			System.out.println(i + " ");
		}

		//sorting strings

		String st1[] = {"0", "100", "10", "1", "5"};
		Arrays.sort(st1);
		for(String s : st1){
			System.out.print(s + " ");
		}

		//searching = Arrays.binarySearch(array, element)
		//found element = index
		//not found = negative index - 1
		//unsorted = who knows

		System.out.println("= = = = = = binary search = = = = = = = ");
		int[]bs = {4,8,3,2,6,1,7,0};
		//unsorted
		System.out.println(Arrays.binarySearch(bs, new Integer(6)));
		System.out.println(Arrays.binarySearch(bs, 0));

		Arrays.sort(bs);
		//sorted
		
		for(int i = 0; i<bs.length; i++){
			System.out.println(" element:" + bs[i] + " index:" + i);
		}
		System.out.println();
		System.out.println(Arrays.binarySearch(bs, 0));
		System.out.println(Arrays.binarySearch(bs, 1));
		System.out.println(Arrays.binarySearch(bs, 2));
		System.out.println(Arrays.binarySearch(bs, 7));
		System.out.println(Arrays.binarySearch(bs, 10));
		System.out.println(Arrays.binarySearch(bs, 95));

	
	}
}	
