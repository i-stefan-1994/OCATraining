public class FinalizeExample{
	protected void finalize(){
		System.out.println("Calling finalize");
	}

	public static void main(String [] args){
		FinalizeExample f = new FinalizeExample();
	}

	//finalize may or may not run, when f is eligible for garbage collection
	//finalize is run every time garbage collection runs
}
