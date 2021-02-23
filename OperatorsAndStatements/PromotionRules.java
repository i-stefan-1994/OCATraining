public class PromotionRules{
	public static void main(String [] args){
		//1. If two values have same data type, java promotes smaller to larger
		int i = 1;
		long l = 25L;
		long r = l * i;
		System.out.println(r);
		//2. If one value is integral, and the other is floating point, java promotes integral to floating point
		int in = 24;
		double d = 12.5;
		double f = d * in;
		System.out.println(f);

		//3. Smaller data types (byte, short, char) are automatically promoted to int when they're used with binary arithmetic operators. This does not occur when they're used with unary arithmetic operators

		byte b = 5;
		b++; // byte remains byte
		short s = 6;
		int res = b + s; //byte and short are automatically promoted to int
		System.out.println(res);

		//4. After all promotion has occured, and all operands are the same data type, result will be the same data taype as its promoted operands

	}
}
