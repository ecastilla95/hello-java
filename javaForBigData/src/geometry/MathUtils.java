package geometry;


public class MathUtils {
	public static float PI = 3.1416f;
	
	public static float power(float x, int n) {
		float result = 1;
		int i = 0;
		for(i=0; i<n; i++) {
			result *=x;
		}
		return result;
	}
}
