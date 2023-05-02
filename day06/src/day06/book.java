package day06;

public class book {
	// 제목, 작자
	public String title;
	public String author;
	
	
	public book() { // 빈 생성자라도 만들 것 
		this("untitled", "nonamed");
	}
	public book(String title) {
		this.title = title;	//나 자신을 가르킴
		this.author = "작자미상";
	}
	public book(String t, String a) {
	this.title = t;
	this.author = a;
	}
	public void showInfo() {
		System.out.println("제목 :"+title+" 작가는 "+author);
	}
	
}

