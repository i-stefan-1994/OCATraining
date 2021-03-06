package pond.duck;

public class MotherDuck{
	String noise = "quack";
	void quack(){
		System.out.println(noise);
	}

	private void makeNoise(){
		quack();
	}

	//default access modifier = allows usage from within the class and package
}
