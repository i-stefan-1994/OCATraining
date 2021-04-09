import java.util.*;
import java.util.function.*;

public class PredicateSearch{
	public static void main(String [] args){
		List<Animals> animalList = new ArrayList<Animals>();
		animalList.add(new Animals("Kangaroo", true, false));
		animalList.add(new Animals("Mackrel", false, true));

		print(animalList, a -> a.canHop());
	}

	private static void print(List<Animals> list, Predicate<Animals> checker){
		for(Animals animal : list){
			if(checker.test(animal)){
				System.out.println(animal + " ");	
			}

			System.out.println();
		}
	}
}
