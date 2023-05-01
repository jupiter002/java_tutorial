package ch03;

public class IfEx003 {
	public static void main(String[]args) {
		int a = 98;
		int b = 89;
		int c = 89;
		int d = (a+b+c);
		String score;
		
			System.out.println("국어점순"+ a + "점입니다.");
			System.out.println("영어점수는"+ b + "점입니다.");
			System.out.println("수학점수는"+ c + "점입니다.");
			System.out.println("총점은"+ d +"점입니다.");
			System.out.println("평균은"+ (d/3) + "입니다.");	
	if (d>=90 & d>101){
		score = "학점은 A입니다";
	}
	else if (d>=80) {
		score = "학점은 B입니다.";
	}
	else if (d>=70) {
		score = "학점은 C입니다.";
	}
	else if (d>=60) {
		score = "학점은 D입니다.";
	}
	else {
		score = "학점은 F입니다.";
	}
	System.out.println(score);
	
	
	}	

}
