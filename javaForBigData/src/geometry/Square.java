package geometry;

public class Square extends GeometricFigure{
	float side;
	
	@Override
	public double calculateArea(float side) {
		return side*side;
	}
	
	@Override
	public double calculatePerimeter(float side) {
		return 4*side;
	}
	
	public Square(String side) {
		this.side = Float.parseFloat(side);
	}
	
	public Square(float side) {
		this.side = side;
	}
}
