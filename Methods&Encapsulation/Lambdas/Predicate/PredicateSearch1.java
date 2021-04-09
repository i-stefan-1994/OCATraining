import java.util.*;
import java.util.function.*;

public class PredicateSearch1{
	public static void main(String [] args){
		List<Animal> animalList = new ArrayList<Animal>();
		animalList.add(new Animal("Ox", true, true));
		animalList.add(new Animal("Mackarel", false, true));
		animalList.add(new Animal("Rabbit", true, false));
		
		print(animalList, a -> a.canSwim());

		for(Animal animal : animalList){
			System.out.println(animal);
		}

		System.out.println(animalList);

		Animal animal = new Animal("Test", true, false);
		System.out.println(animal.getName());

	}

	private static void print(List<Animal> list, Predicate<Animal> checker){
		for(Animal animal : list){
			if(checker.test(animal)){
				System.out.println(animal + " ");
			}

			System.out.println();
		}
	}
}
