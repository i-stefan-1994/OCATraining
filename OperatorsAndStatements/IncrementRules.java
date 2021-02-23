public class IncrementRules{
	public static void main(String [] args){
		
		//++x pre-increment => value is incremented then returned
		//x++ post-increment -> value is returned, then incremented

		int c = 0;
		System.out.println(++c); //1
		System.out.println(c++); //1
		System.out.println(c); //2
		System.out.println(c--);//2
		System.out.println(c);//1
		System.out.println(c--); //Value is returned as is even if it's the last operation
	}
}
