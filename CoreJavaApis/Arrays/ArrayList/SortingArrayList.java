import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class SortingArrayList{
	public static void main(String [] args){
		
		Double [] doubleList = {24.4, 1.2, 40.2, 5.8};
		List<Double> list1 = Arrays.asList(doubleList);

		System.out.println(list1);
		list1.set(1, 88.1);


		System.out.println(list1);
		for(double d : doubleList){
			System.out.print(d + " ");
		}

		Collections.sort(list1);

		System.out.println("");
		System.out.println("Sorted list by using Collections: " + list1);

	}
}
