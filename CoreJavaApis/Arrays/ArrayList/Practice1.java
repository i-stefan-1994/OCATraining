import java.util.ArrayList;
import java.util.List;

public class Practice1{
	public static void main(String [] args){
		
		//ArrayList = ordered collection
		//	==> maintains order of inserted elements
			
		//java 5
		ArrayList al1 = new ArrayList();
		ArrayList al2 = new ArrayList(10);
		ArrayList al3 = new ArrayList(al2); //copy size and contents

		//generics
		ArrayList<String> g1 = new ArrayList<String>();
		ArrayList<String> g2 = new ArrayList<>();

		//List
		List<String> l1 = new ArrayList<>();
		List<String> l2 = new ArrayList<String>();


		//methods
		//ArrayList implement toString()
		//add(E element)
		//add(int index, element)

		al1.add("value");
		al1.add(2);
		al2.add(Boolean.TRUE);
		g1.add("Bosnia");
		
		List<Integer> il = new ArrayList<>();
		il.add(1);
		il.add(5);
		il.add(4);
		il.add(8);
		il.add(7);
		System.out.println(il);
		il.add(0, 9);
		System.out.println(il);
		il.add(1, 5);
		System.out.println(il);

		//boolean remove(int index)
		//boolean remove(Object obj) - removes first matching element or index

		il.remove(new Integer(8));
		System.out.println(il);
		il.remove(0);
		System.out.println(il);
		il.remove(new Integer(5));
		il.remove(1);
		il.remove(0);
		il.remove(new Integer(7));
		il.remove(0);
		il.add(1);
		il.add(6075500);
		il.remove(new Integer(6075500));
		System.out.println(il);
		System.out.println(il.isEmpty());

		//set(index, new element)

		il.add(501051);
		il.set(0, 1);
		System.out.println(il);
		il.add(0, 512521);
		il.set(1, 26);
		System.out.println(il);
		il.set(0, 24);
		System.out.println(il);

		//isEmpty() <-boolean + size()<- int + clear()
		
		System.out.println(il.size());
		System.out.println(il.isEmpty());

		List<Double> sizeList = new ArrayList<>();
		sizeList.add(12.5);
		sizeList.add(22.0);

		if(sizeList.isEmpty() != true){
			System.out.println(sizeList.size());
			sizeList.clear();
			System.out.println(sizeList.size());

		}

		//contains() <- methoda ce exista si in String

		sizeList.add(12.0);
		System.out.println(sizeList.contains(12.0));

		String str = "12345";
		System.out.println(str.contains("23"));
		System.out.println(str.replace("23", "89"));


		//implements .equal() to see if ArrayLists have same elements in same order
		
		List<Integer> p1 = new ArrayList<>();
		p1.add(1);
		List<Integer> p2 = new ArrayList<>(p1);
		List<Integer> p3 = new ArrayList<>();
		p3.add(1);

		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));

	}
}
