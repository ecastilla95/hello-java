package Sets;

public class Thing implements Comparable<Thing> {

	String name = "";
	
	public Thing(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Thing other) {
		return this.name.compareTo(other.name);
	}

	@Override
	public String toString() {
		return "Thing [name=" + name + "]";
	}

}
