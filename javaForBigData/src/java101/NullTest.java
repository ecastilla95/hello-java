package java101;

public class NullTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NullTest test = new NullTest();
		Person p = new Person();
		p.name = "Juan";
		test.changeName(p, "Luis");
		System.out.println(p.name);
	}

	void changeName(Person pers, String other) {
		pers = null;
	}
}
