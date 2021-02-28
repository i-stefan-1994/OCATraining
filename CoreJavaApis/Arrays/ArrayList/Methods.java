import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Methods{
	public static void main(String [] args){
	
		List<Integer> list1 = new ArrayList<>();
		list1.add(2);
		list1.add(1, 3);
		list1.add(0, 123);
		list1.add(2, 5);
		System.out.println(list1.toString());

		List list2 = new ArrayList();
		list2.add("Benis");
		list2.add(Boolean.TRUE);
		System.out.println(list2.toString());


		ArrayList<String> list3 = new ArrayList<>();
		list3.add("Mussolini");
		//list3.add(Boolean.FALSE);

		System.out.println(list1.remove("123"));
		list1.remove(2);
		System.out.println(list1);

		//set(index, element)
		list1.set(0, 22);
		list1.set(2, 11);
		System.out.println(list1.toString());

		//isEmpty()

		System.out.println("isEmpty: " + list1.isEmpty());

		//contains()
		System.out.println("Contains 22: " + list1.contains(22));

		//isEmpty()
		System.out.println(list1.isEmpty());

		//size()
		System.out.println(list1.size());

		//clear() - discards all elements
		list1.clear();
		System.out.println("is list1 empty: " + list1.isEmpty());
		System.out.println("new list size: " + list1.size());


		//equals - same elements, in same order

		List<Integer> list4 = new ArrayList<>();
		list4.add(1);
		list4.add(5);
		List<Integer> list5 = new ArrayList<>(list4);

		System.out.println("Does list 4 equal list5? " + list4.equals(list5));
	
	}
}
