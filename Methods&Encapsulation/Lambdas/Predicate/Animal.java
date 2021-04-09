public class Animal{
	private String name;
	private boolean hop;
	private boolean swim;

	public Animal(String name, boolean hop, boolean swim){
		this.name = name;
		this.hop = hop;
		this.swim = swim;
	}

	public String getName(){
		return this.name;
	}

	public boolean canHop(){
		return this.hop;
	}

	public boolean canSwim(){
		return this.swim;
	}


	public String toString(){
		return name;
	}

}
