package day07;

public class colorPoint extends point {
	private String color;
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showcolorPoint() {
		System.out.println(color+" / ");
		this.showPoint();
	}
	
}
