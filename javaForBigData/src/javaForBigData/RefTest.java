package javaForBigData;

public class RefTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RefTest test = new RefTest();
		Person p = new Person();
		p.name = "Juan";
		test.changeName(p, "Luis");
		System.out.println(p.name);
	}

	void changeName(Person pers, String other) {
		pers = new Person();
		pers.name = other;
	}
}
