package java101;

public class Main{

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		long c = 0;
		
		c = a;
		b = (int) c;
		
		System.out.println(c);
		
		int max = Integer.MAX_VALUE; //Wrapper
		
		System.out.println(max);
		
		int desborde = ++max; //max++ //int desborde = max = max +1 //remember: ++max y max++
		
		long l = max;
		l = l + 1;
		
		System.out.println(desborde);
		System.out.println(l); //max = max+1 ya está desbordado.
		
		Utils.saludar();
		
	}
}
