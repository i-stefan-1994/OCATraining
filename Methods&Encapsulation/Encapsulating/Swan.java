public class Swan{
	private int eggs;

	public int getNrEggs(){
		return eggs;
	}

	public void setNrEggs(int eggs){	//setter
		if(eggs >= 0){	//guard condition
			this.eggs = eggs;
		}
	}
}
