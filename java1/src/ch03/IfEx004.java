package ch03;

public class IfEx004 {
	public static void main(String[] args) {
		int a = 100;
		int b = 100;
		int c = 99;
		
		if (a>100 || b>100 || c>100) {
			System.out.println("잘못 입력하였습니다.");
		}
		else {
			System.out.println("국어점수는"+ a + "점입니다.");
			System.out.println("영어점수는"+ b + "점입니다.");
			System.out.println("수학점수는"+ c + "점입니다.");
		}
	}
}
