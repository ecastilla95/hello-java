package strings;

import java.util.Arrays;
import org.apache.commons.lang3.StringUtils;

public class Main2 {
	public static void main(String[] args) {
	String prep = "a, ante, bajo, con, contra, de, desde, en, entre, hacia, hasta, para, por, según, sin, sobre, tras, durante, mediante";
	
	
	String[] array = prep.split(",");
	int length = array.length;
	
	int i = 0;
	for(i = 0; i < length; i++) {
		array[i] = array[i].trim();
		if (array[i].length() >= 3) array[i] = array[i].toUpperCase();
		}
	
	Arrays.sort(array);
	String string = StringUtils.join(array, ';');
	System.out.println(string);
	
	}
	
}
