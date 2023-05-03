package point;

// inner class
class point{
	private int x,y;
	
	public point() {
		this.x=0;
		this.y=0;
	}
	public point(int x, int y) {
		this.x=x;
		this.y=y;
		
	}
	public void showpoint() {
		System.out.println("("+x+","+y+")");
	}
}
class colorpoint extends point{
	private String color;

	public colorpoint(int x, int y, String color) {
		super();	// main함수에서 10,10이 출력이 안되는 이유 : 매개변수의 값을 받아주는 메서드가 없기 때문에 super메서드에 x,y를 넣어줘야 10,10이 출력된다.
		this.color=color;
		
	}
	
	public void showColorPoint() {
		System.out.println(color);
		this.showpoint();
	}	
}


public class superTest {
	public static void main(String[] args) {
		colorpoint colorpoint = new colorpoint(10,10,"red");
		colorpoint.showColorPoint();
	}

}