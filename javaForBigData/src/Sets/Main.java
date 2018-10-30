package Sets;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		TreeSet<Thing> treeSet = new TreeSet<Thing>();
		
		Thing t1 = new Thing("Pedro");
		Thing t2 = new Thing("Juan");
		Thing t3 = new Thing("Luis");
		Thing t4 = new Thing("Pedro2");
		
		treeSet.add(t1);
		treeSet.add(t2);
		treeSet.add(t3);
		treeSet.add(t4);
		
		System.out.println(treeSet);

	}

}
