package geometry;

import java.lang.Math;

public class Triangle extends GeometricFigure{
	float side;
	float height;
	
	@Override
	public double calculateArea(float side) {
		return (Math.sqrt(3)/4)*side*side;
	}
	
	@Override
	public double calculatePerimeter(float side) {
		return 3*side;
	}
	
	public Triangle(String side, String height) {
		this.side = Float.parseFloat(side);
		this.height = Float.parseFloat(height);
	}
	
	public Triangle(float side, float height) {
		this.side = side;
		this.height = height;
	}
}
