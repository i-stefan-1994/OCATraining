import java.util.List;
import java.util.ArrayList;

public class Autoboxing{
	public static void main(String [] args){
		List<Double> list1 = new ArrayList<>();
		list1.add(50.5);
		list1.add(new Double(60));
		list1.remove(50.5);
		
		System.out.println(list1.toString());
		double d1 = list1.get(0);
		System.out.println("double is: " + d1);

		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list2.remove(1); //removes index 1 => list2 = [1]
		System.out.println(list2);
		list2.add(2);
		list2.remove(new Integer(1)); // removes element 1 =? list2 = [2]
		System.out.println(list2);

		//Unboxing Wrapper classes

		int int1 = Integer.parseInt("123");
		System.out.println("int value: " + int1);
		//Boxing primitives
		
		Integer integer1 = Integer.valueOf(int1);
		System.out.println("Integer value: " + integer1);
	}
}
