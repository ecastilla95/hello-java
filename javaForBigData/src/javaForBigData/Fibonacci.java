package javaForBigData;

public class Fibonacci{

	public static void main(String[] args) {
		System.out.println(fibonacci(3));
		System.out.println(fibonacci(4));
		System.out.println(fibonacci(5));
		
		System.out.println(fibonacci2(3));
		System.out.println(fibonacci2(4));
		System.out.println(fibonacci2(5));
	}
	
	public static int fibonacci(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	public static int fibonacci2(int n) {
		int a = 1;
		int b = 1;
		int aux = 0;
		while (n != 0 && n != 1) {
			aux = b;
			b = a+b;
			a = aux;
			n--;
		}
		return b;
	}
	
}
