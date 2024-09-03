package ch2;

public class CircleArea {
	public static double circle(double radius) {
		final double PI = 3.14;
		double circleArea = radius * radius * PI;
		
		
		return circleArea;
	}
	
	public static void main(String[] args) {
		double radius = 20.0;
		
		System.out.println("원의 면적 = " + circle(radius));
		
	}
}
