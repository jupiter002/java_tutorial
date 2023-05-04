package day08;

class myPoint{
	private int x,y;
	
	public myPoint(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x=x;
		this.y=y;
		
	}
	public boolean equals(Object obj) {
		myPoint point = (myPoint) obj;
		if(x==point.x && y==point.y) {
		return true;
		
	}

		return false;
}
}

public class EqualsTest {
	public static void main(String[] args) {
		myPoint mypoint = new myPoint(1,1);
		myPoint mypoint1 = new myPoint(1,1);
		myPoint mypoint2 = mypoint;
		System.out.println(mypoint==mypoint1);
		System.out.println(mypoint==mypoint2);
		System.out.println(mypoint.equals(mypoint1));
		System.out.println(mypoint.equals(mypoint2));
	}
}
