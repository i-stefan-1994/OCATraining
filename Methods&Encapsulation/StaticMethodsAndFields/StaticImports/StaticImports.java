import static java.util.Arrays.asList;
import java.util.List;

public class StaticImports{
	public static void main(String [] args){
		
		List<Integer> l1 = asList(1, 2, 3);
		System.out.println(l1);
		l1.set(1, 5);
		l1.add(5);

	}
}
