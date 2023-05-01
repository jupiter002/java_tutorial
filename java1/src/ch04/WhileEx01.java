package ch04;

public class WhileEx01 {
	public static void main(String[] args) {
		// while문
		// for문 <=> while문 바꿔보기
		// 중첩 while문은 잘 안쓰임
		int a = 0;		// 초기식
		while(a<3) {	// 조건식
			System.out.println("hello");
			a++;		// 증감식
		}// while문 종료

		int b=0;
		while(b<3) {
			b++;			//증감식의 위치는 실행문의 위 아래 상관없음.
			System.out.println("hi");
		}
		
		
		
		
		
	}
}
