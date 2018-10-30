package geometry;

import java.util.ArrayList;

public class Main{
	public static void main(String[] args) {
		Triangle t = new Triangle(1);
		Circle c = new Circle(1);
		Square s = new Square(1);
		
		ArrayList<GeometricFigure> list = new ArrayList<GeometricFigure>();
		
		list.add(t);
		list.add(c);
		list.add(s);
		
		for(GeometricFigure i: list) {
			System.out.println(i.toString());
		}
	}
}
