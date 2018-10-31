package lambdas;

public class Main {
	public static void main(String[] args) {
		
		Adder<Integer> adder = (a, b) -> a + b ;	
		System.out.println(adder.add(1, 2));
		
		Adder<Float> adder2 = (a, b) -> a + b ;	
		System.out.println(adder2.add(1.234f, 2.345f));
		
		SoccerPlayer sp = () -> {System.out.println("Kicked the ball!");};
		
		sp.kick();
	}
	
}
