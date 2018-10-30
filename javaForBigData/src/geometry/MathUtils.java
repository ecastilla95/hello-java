package geometry;


public class MathUtils {
	public final static float PI = 3.1416f;
	
	public static float power(float x, int n) {
		if (n == 0) return 1;
		else if (n > 0) return positivePower(x, n);
		else return 1/positivePower(x, -n);
	}

	private static float positivePower(float x, int n) {
		float result = 1;
		int i = 0;
		for(i=0; i<n; i++) {
			result *= x;
		}
		return result;
	}
}
