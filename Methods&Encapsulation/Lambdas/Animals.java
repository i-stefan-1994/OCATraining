public class Animals{
	private String species;
	private boolean canHop;
	private boolean canSwim;

	public Animals(String species, boolean canHop, boolean canSwim){
		this.species = species;
		this.canHop = canHop;
		this.canSwim = canSwim;
	}

	public boolean canHop(){
		return canHop;
	}

	public boolean canSwim(){
		return canSwim;
	}

	public String toString(){
		return species;
	}
}
