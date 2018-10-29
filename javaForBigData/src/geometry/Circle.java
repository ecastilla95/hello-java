package geometry;

public class Circle extends GeometricFigure{
	float radius;
	
	@Override
	public double calculateArea(float radius) {
		return MathUtils.PI*radius*radius;
	}
	
	@Override
	public double calculatePerimeter(float side) {
		return 2*MathUtils.PI*radius;
	}
	
	public Circle(String radius) {
		this.radius = Float.parseFloat(radius);
	}
	
	public Circle(float radius) {
		this.radius = radius;
	}
}
