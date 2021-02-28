import java.util.ArrayList;
import java.util.List;

public class Creation{
	public static void main(String [] args){
		ArrayList list1 = new ArrayList(); //no size
		ArrayList list2 = new ArrayList(10); //with size
		ArrayList list3 = new ArrayList(list2); //with copying of size and content


		//by using generics
		
		ArrayList<Integer> list4 = new ArrayList<Integer>();
		ArrayList<String> lsit5 = new ArrayList<>();

		//by using the implemented List interface
		
		List<Integer> list6 = new ArrayList<>();

	}
}
