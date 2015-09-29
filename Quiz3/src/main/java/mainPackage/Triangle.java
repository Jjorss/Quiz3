package mainPackage;

public class Triangle extends GeometricObject{

	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	// Constructs a default constructor for Triangle
	public Triangle() {
		
	}
	// Constructs a constructor with three parameters for Triangle
	// parameters (doubles) are the three side lengths of the triangles 
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	// getArea gets the area of the Triangle it is called on
	// returns calculated area in the form of a double
	@Override
	public double getArea() {
		double p = getPerimeter() / 2;
		double a = p - getSide1();
		double b = p - getSide2();
		double c = p - getSide3();
		double x = p * a * b * c;
		return Math.sqrt(x);
	}

	// getPerimeter returns the perimeter of the Triangle it was called on
	@Override
	public double getPerimeter() {
		return getSide1() + getSide2() + getSide3();
	}
	
	// toString returns a string describing the Triangle it was called on
	// provides side lengths, area, and perimeter.
	public String toString() {
		return "This triangle side lengths are " + this.getSide1() + ", " + this.getSide2() + ", and "
				+ this.getSide3() + "." + "\nThe area is " + this.getArea() + "." + "\nThe perimeter is "
				+ this.getPerimeter() + ".";
	}

	// Getter for side1
	public double getSide1() {
		return side1;
	}
	// Getter for side2
	public double getSide2() {
		return side2;
	}
	// Getter for side3
	public double getSide3() {
		return side3;
	}	
}
