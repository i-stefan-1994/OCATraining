public class AccessingArrays{
	public static void main(String [] args){
		String [] arr1 = {"Slytherin", "Gryffindor", "Ravenclaw", "Hufflepuff"};

		//array size
		System.out.println(arr1.length);

		//element accessing
		for(int i = 0; i <arr1.length; i++){
			System.out.println(arr1[i]);
		}
	}
}
