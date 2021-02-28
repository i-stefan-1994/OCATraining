import java.util.List;
import java.util.ArrayList;

public class Converting{
		public static void main(String [] args){
			List<Integer> list1 = new ArrayList<>();
			list1.add(1);
			list1.add(2);
			list1.add(3);

			Object [] convertedList = list1.toArray();

			//ObjectArray
			System.out.println(convertedList.length);			

			//reference variable array
			Integer [] convertedList2 = list1.toArray(new Integer[0]);
			System.out.println(convertedList2.length);

			for (int result : convertedList2){
				System.out.print(result + " ");
			}

			List<String> listPractice = new ArrayList<>();
			listPractice.add("1");
			listPractice.add("fas");


			Object[] convertedPractice = listPractice.toArray(); 

			String [] convertingToArray = listPractice.toArray(new String[0]);

			for(String result : convertingToArray){
				System.out.println();
				System.out.println(result + " ");
			}

	}
}
