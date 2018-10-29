package java101;

import People.*;

public class Encapsulation {

	public static void main(String[] args) {
		Person1 p1 = new Person1("Juan");
	  //Person2 p2 = new Person2("Pedro"); //not visible (protected)
		Person3 p3 = new Person3("Luis"); 
		System.out.println(p1.name);

	  //System.out.println(p3.name); //not visible
		System.out.println(p3.getName());
	}
}


