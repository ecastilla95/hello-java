package javaForBigData;

public class Factorial{

	public static void main(String[] args) {
		System.out.println(factorial(3));
		System.out.println(factorial(4));
		
		System.out.println(factorial2(3));
		System.out.println(factorial2(4));
		
		System.out.println(factorial3(3));
		System.out.println(factorial3(4));
		
	}
	public static int factorial(int i) {
		if (i == 0) {
			return 1;
			} 
		else {
			return (i * factorial(i-1));
			}
		
	}
	
	public static int factorial2(int i) {
		int result = 1;
		while(i != 0) {
			result *= i;
			i--;
		}
		return result;
	}
	
	public static int factorialTail(int n, int a) {
		if (n==0) {
			return a;
		}
		else {
			return factorialTail(n-1, n*a);
		}
	}
	
	public static int factorial3(int n) {
		return factorialTail(n, 1);
	}
}
