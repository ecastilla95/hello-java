package geometry;

import java.lang.Math;

public class Triangle implements GeometricFigure{
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
	
	public Triangle(String side) {
		this.side = Float.parseFloat(side);
		this.height = (float) (Math.sqrt(3)/4)*this.side;
	}
	
	public Triangle(float side) {
		this.side = side;
		this.height = (float) (Math.sqrt(3)/4)*this.side;
	}

	@Override
	public String toString() {
		return "Triangle [side=" + side + ", height=" + height + "]";
	}
	
}
