import java.util.List;
import java.util.ArrayList;

public class ConstantVariables{
	
	private final static int NUM_FINAL = 5;
	private static final List<String> values = new ArrayList<>();

	public static void main(String [] args){
		
		System.out.println(NUM_FINAL);
	//	NUM_FINAL = 6; DNC - can't change final variables
		
		values.add("Bors"); //final ref variables can be used, they just can't be changed to point to another object
		System.out.println(values);

	}

}
