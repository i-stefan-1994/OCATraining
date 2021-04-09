import java.util.ArrayList;
import java.util.List;

public class TraditionalChecker{
	public static void main(String [] args){
		List<Animals> animalList = new ArrayList<>();
		animalList.add(new Animals("kangaroo", true, false));
		animalList.add(new Animals("spider", false, false));
		animalList.add(new Animals("bunny", true, false));
		animalList.add(new Animals("fish", false, true));

		print(animalList, new CheckHopper());
	}

	public static void print(List<Animals> animalList, CheckHopper checker){
		for(Animals animal : animalList){
			if(checker.test(animal)){
				System.out.println(animal);
			}
		}
	}

}
