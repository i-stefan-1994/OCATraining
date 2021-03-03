import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

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

		System.out.println();
		System.out.println(list1.size());

		List<String> l1 = new ArrayList<>();
		l1.add("Kilimanjaro");
		Object[] o1 = l1.toArray();
		String[] s1 = l1.toArray(new String[0]);
		System.out.println(s1.length);

		String[] s2 = l1.toArray(new String[0]);
		String [] s3 = l1.toArray(new String [0]);
		String[] s4 = l1.toArray(new String[0]);
		String[]s5 = l1.toArray(new String[0]);

		List<Integer> l2 = new ArrayList<>();
		
		for(int i = 0; i<10;i++){
			l2.add(i);
		}

		System.out.println(l2);

		Integer[] i1 = l2.toArray(new Integer[0]);
		for(int i: i1){
			System.out.print(i + " ");
		}


		//Arrays to list = Arrays.asList();
		//Arrays.asList() = fixed backed-up version of the array => Changes made to it affect the array
		//	=> size of list is not allowed to change => add()+remove() not supported (will throw Exc)

		System.out.println();
		String [] st1 = {"Bananna", "Cocktail"};
		List<String> li2 = Arrays.asList(st1);
		System.out.println(li2);
		li2.set(0, "Chocolate");
		
		for(String s : st1){
			System.out.println(s);
		}

		System.out.println(li2);


		//sorting = Collections.sort(list)
		
		List<Integer> sortList = Arrays.asList(6, 4, 7, 1, 8, 1, 7 );
		Collections.sort(sortList);
		System.out.println(sortList);
		
	}
}
