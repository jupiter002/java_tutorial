package day07;

public class colorPointTest {
	public static void main(String[] args) {
		
	point point = new point();
	point.set(10, 10);
	point.showPoint();	
	
	colorPoint colorpoint = new colorPoint();
	colorpoint.set(30, 30);
	colorpoint.setColor("red");
	colorpoint.showcolorPoint();
}
}