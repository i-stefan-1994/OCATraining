import java.util.*;

public class ListExample{
	public static void main(String [] args){
	List<Integer> list = new ArrayList<Integer>();
	list.add(10);
	list.add(14);

	for(int x:list){
		System.out.println(x + ", ");
		break;
	}
} 
}
