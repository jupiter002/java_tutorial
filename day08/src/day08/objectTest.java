package day08;

class Rect{
private int width,height;	// field

public Rect(int width, int height) {
	// TODO Auto-generated constructor stub
	this.width=width;
	this.height=height;
}
public int getWidth() {
	return width;
}

public void setWidth(int width) {
	this.width = width;
}

public int getHeight() {
	return height;
}

public void setHeight(int height) {
	this.height = height;
}
public boolean equals(Object obj) {
	Rect rect = (Rect) obj;
	if(rect.width*rect.height==width*height) {
		return true;
	}
	return false;
}


}
// inner class
class point {
	private int x,y;
	public point(int x,int y) {
	// TODO Auto-generated constructor stub
		this.x=x;
		this.y=y;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	
		
	
	
}



public class objectTest {
	public static void main(String[] args) {
		/*
	 	point point1 = new point(1,1);
	 	point point2 = new point(1,1);
	 	point2.setX(20);
	 	System.out.println(point1.getClass());
	 	System.out.println(point1.getClass().getName());
	 	System.out.println(point1.hashCode());
	 	System.out.println(point2.hashCode());
	 	System.out.println(point1.toString());
	 	System.out.println(point1);
	 	*/
		
		Rect rect1 = new Rect(10,10);
		Rect rect2 = new Rect(50,2);
		System.out.println(rect1.equals(rect1));
		System.out.println(rect2==rect1);
		
	}
}
