import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ConvertingPractice2{
	public static void main(String [] args){
		Integer [] intList = {1, 2, 3, 4};

		List<Integer> list1 = Arrays.asList(intList);
		System.out.println(list1);
		list1.set(2, new Integer(34));
		System.out.println(list1);

		for(int i : intList){
			System.out.print(i + " ");
		}
	}
}
