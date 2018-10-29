package geometry;

public class Main extends GeometricFigure{
	float radius;
	
	@Override
	public double calculateArea(float radius) {
		return MathUtils.PI*radius*radius;
	}
	
	@Override
	public double calculatePerimeter(float side) {
		return 2*MathUtils.PI*radius;
	}
	
	public Main(String radius) {
		this.radius = Float.parseFloat(radius);
	}
	
	public Main(float radius) {
		this.radius = radius;
	}
}
