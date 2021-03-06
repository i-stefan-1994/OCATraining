
public class StaticVariable2{
	public static void main(String [] args){
	
		StaticVariable v1 = new StaticVariable();
		System.out.println(v1.count);

		v1 = null;
		System.out.println(v1.count);

		//reference is used (v1) instead of object value for static member(field or method)
	}
}
