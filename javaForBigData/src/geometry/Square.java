package geometry;

public class Square implements GeometricFigure{
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

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}
	
}
