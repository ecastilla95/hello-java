package javaForBigData;

public class ChangeTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChangeTest test = new ChangeTest();
		Person p = new Person();
		p.name = "Juan";
		test.changeName(p, "Luis");
		System.out.println(p.name);
	}

	void changeName(Person pers, String other) {
		pers.name = other;
	}
}
