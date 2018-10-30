package map;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		String stuff = "Imagine having to program in Java (This meme was made by the Scala Programmers Gang)";
		
		HashMap<Character, Integer> letters = new HashMap<>();
		
		for(char c: stuff.toLowerCase().toCharArray()) {
			try {
				Integer k = new Integer(letters.get(c).intValue()+1);
				letters.put(c, k);
			} catch (NullPointerException e) {
				letters.put(c, 1);
			}
		}
		System.out.println(letters);

	}

}
