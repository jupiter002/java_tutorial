package day06;

public class tv {
	// company, year, size
	// showInfo()를 통해서 제품 정보 출력
	public String brand;
	public int year;
	public int inch;
	public tv() {
		
	}
	
	
	
	public tv(String brand, int year, int inch) {
		this.brand=brand;
		this.year=year;
		this.inch=inch;
	}
	public void showInfo() {
		System.out.println("우리집 TV는 "+brand+"이고 "+year+"에 생산되었고 "+inch+"인치 입니다");
		
		
	}
	
	
	
	
}
