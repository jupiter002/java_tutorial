package Quiz;

public class colorTv extends tv {
	private int color;
	
	public colorTv(int size, int color) {
		super(size);
		this.color=color;
	}
		
		
	public int getColor() {
		return color;
	}


	public void showInfo() {
		System.out.println(size+"inch "+color+"color");

	}
	
	
	public static void main(String[] args) {
		colorTv Tv = new colorTv(66,3840);
		Tv.showInfo();
		
	}
}
