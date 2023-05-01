package ch04;

public class continueEx01 {
	public static void main(String[] args) {
		// continue문
		// 반복문(for, while, do-while)돌아가서 실행
		// 증감식, 조건식으로 바로 간다.
		// 반복을 종료하지않고 계속 실행한다는 점이 break문과 다름.
		// 예외 처리기능
		int a;
		for(a=1; a<11; a++) {
			if(a==3) {	// 3은 출력하지 않음
				continue;
			}
			System.out.println(a);
		}
		
		
		
		
		
	}
}
