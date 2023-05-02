package day06;

public class circleTest {
	public static void main(String[]args) {
		
		circle gong = new circle(30,"축구공");
		System.out.println(gong.name+"의 넓이는"+gong.getArea()+"입니다");
		
		
		
		circle circle = new circle();
		circle.name="써클";
		circle.radius=10;
		circle.getArea();
		System.out.println(circle.name+"의 넓이는"+circle.getArea()+"입니다.");
		
		
		circle pizza = new circle();
		pizza.name = "도미노피자";
		pizza.radius = 25;
		System.out.println(pizza.name+"의 넓이는 "+pizza.getArea()+"입니다");
	}
}
