package Exceptions;

public class Main {
	public static void main(String[] args) {
		int number = 2;
		
		exceptionMethod(number);
		
		try {
			exceptionMethod2(number);
		} catch (CheckedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void exceptionMethod (int number) throws UncheckedException{
		if (number > 1) {
			throw new UncheckedException("Boom");
		} else {
			System.out.println("Didn't throw an exception");
		}
	}
	
	public static void exceptionMethod2 (int number) throws CheckedException{
		if (number > 1) {
			throw new CheckedException("Boom");
		} else {
			System.out.println("Didn't throw an exception");
		}
	}
}
