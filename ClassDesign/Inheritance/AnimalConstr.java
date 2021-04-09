public class AnimalConstr{
	private int age;
	private String name;

	public AnimalConstr(int age, String name){
		super();
		this.age = age;
		this.name = name;
	}

	public AnimalConstr(int age){
		super();
		this.age = age;
		this.name = null;
	}

	public String getName(){
		return this.name;
	}

	public int getAge(){
		return this.age;
	}

	public static void main(String [] args){
		Gorilla gorilla1 = new Gorilla(2);
		Gorilla gorilla2 = new Gorilla();
		
		System.out.println("First gorilla name: " + gorilla1.getName());
		System.out.println("First gorilla age " + gorilla1.getAge());
		System.out.println("Second gorilla name " + gorilla2.getName());
		System.out.println("Second gorilla age: " + gorilla2.getAge());

	}
}

class Gorilla extends AnimalConstr{
	public Gorilla(int age){
		super(age, "Bob");
	}

	public Gorilla(){
		this(4);
	}
}
