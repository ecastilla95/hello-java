package strings;

import org.apache.commons.lang3.StringUtils;

public class Main {
	public static void main(String[] args) {
		String hello = "Hello World";
		int length = hello.length() - hello.replace("a", "").replace("e", "").replace("i", "").replace("o", "").replace("u", "").length();
		System.out.println(length);
		
		// better way:
		System.out.println(countVowels(hello));

		
		String course = "Java course";
		System.out.println(new StringBuilder(course).reverse().toString());
		
		String tongueTwister = "El cielo está enladrillado. ¿Quién lo desenladrillará? -El desenladrillador que lo desenladrille, buen desenladrillador será";
		System.out.println(StringUtils.countMatches(tongueTwister, "ladrill"));
	}
	
	public static int countVowels(String str) {
		int total = 0;
		char[] chain = str.toCharArray();
		
		for(char c: chain) {
			switch(c) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':{
					total++;
					break;
				}
				default: break;
			}
		}
		return total;
	}
}
