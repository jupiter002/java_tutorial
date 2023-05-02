package day06;

public class circle {
	int radius;
	String name;
	
	
	// overload
	public circle() {
//		System.out.println("나는 circle 입니다.");
	}
	public circle(int r, String n) {
		radius = r;
		name = n;
		
	}
	
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	
}
