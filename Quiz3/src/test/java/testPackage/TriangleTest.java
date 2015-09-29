package testPackage;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import mainPackage.Triangle;

public class TriangleTest {

	Triangle tri;
	
	@Before
	public void setUp() {
		tri = new Triangle(5, 5, 5);
	}
	// Test the method getArea in class Triangle
	@Test
	public void testArea() {
		System.out.println(tri.getArea());
		assertEquals(tri.getArea(), 10.825, 0.001);
	}
	// Test the method getPerimeter in class Triangle
	@Test
	public void testPerimeter() {
		System.out.println(tri.getPerimeter());
		assertEquals(tri.getPerimeter(), 15, 0.001);
	}
	// Test the method toString in class Triangle
	@Test
	public void testToString() {
		System.out.println(tri.toString());
	}

}
