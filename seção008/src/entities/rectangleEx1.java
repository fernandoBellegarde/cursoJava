package entities;

public class rectangleEx1 {

	public double a;
	public double b;
	
	public double area() {
		return a * b;
		
	}
	
	public double perimeter() {
		return (a*2) + (b*2);
		
	}
	
	public double diagonal() {
		return Math.sqrt(((a*a) + (b*b)));
		
	}
	
	

	

	
}
