
public class class01 {
	private String major;
	private int year;
	public class01(String major, int year) {
		this.major=major;
		this.year=year;	
	}
	
	public String getMajor() {
		return major+"학부";
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public static void main(String[] args) {
		class01 class1 = new class01("경영",23);
		System.out.println(class1.getMajor()+" "+class1.getYear()+"학번");
		
		
		
	}
	
	
	


	
}	





