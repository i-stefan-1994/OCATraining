import java.util.List;
import java.util.ArrayList;

public class RemoveIfArrayList{
	public static void main(String [] args){
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < 25; i++){
			list.add(i);
		}

		list.removeIf(a -> a > 5);
		System.out.println(list);
	}
}
