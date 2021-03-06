public class StaticAndInstanceVariables{

	private String name = "Azorel";
	public static void first(){}
	public static void second(){}
	public static void third(){
		try{
		//	StaticAndInstanceVariables s = new StaticAndInstanceVariables();
		//	System.out.println(s.name);
		//only compiles by using a reference variable

		System.out.println(name);

		}catch(Exception e){
			System.out.println("Instance members can't be called from static members");
		}
	}

	public static void main(String [] args){


		first();
		second();
		third();
		//does not even compile, because instance members/variables can't be called from static/class members
		
	}
}
