import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ConvertingPractice{

	public static void main(String [] args){
		List<Integer> list1 = new ArrayList<>();
		list1.add(3);
		list1.add(2);
		list1.add(1);

		Object[] objectArray = list1.toArray();
		System.out.println("Array length is: " + objectArray.length);

		//iterating through array
		Integer[] convertedList = list1.toArray(new Integer[0]);
		Integer[] counterList = convertedList;

		for(int i = 0; i < convertedList.length; i++){
			System.out.println(convertedList[i] + " ");
		}

		Arrays.sort(convertedList);
		int index = Arrays.binarySearch(convertedList, 2);
		System.out.println(index);
	}

}
