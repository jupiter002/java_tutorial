package day08;

public class Circle {
	private int x,y,radius;
	public Circle(int x, int y, int radius) {
		// TODO Auto-generated constructor stub
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	public boolean equals(Object obj) {
		Circle circle = (Circle) obj;	// obj는 최상위 객체 Object이기 때문에 Circle로 다운캐스팅해서 받아줘야 함.
		if(circle.x==x && circle.y==y) {
			return true;
		}
		return false; 
	}
	
	public static void main(String[] args) {
		Circle circle = new Circle(10,10,100);
		Circle circle1 = new Circle(10,110,50);
		if(circle.equals(circle1)) {
			System.out.println("같아요");
		}
		else {
			System.out.println("달라요");
		}
	
		
	}
	
	
	
	
	
}
