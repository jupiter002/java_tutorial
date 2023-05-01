package ch04;

public class forEx02 {
	public static void main(String[] args) {
		// for(초기식; 조건식; 증감식){실행코드}
		// 실행순서: 초기식 >> 조건식 >> 실행코드 >> 증감식 >> 조건식 >> 실행코드 >> 증감식 >> 조건식
		// 초기식 : 처음 단 한번만 실행
		// 조건식 : 조건식의 결과가 true일때 실행문 실행, 몇번 반복하는지 알수 있다.
		// 증감식 : 증감함. 대입연산자가 사용된다.
		// 조건식이 false일때 for문 종료.
		
		

	// 0~5까지 출력
//		for(int b=0; b<=5; b++) {
//			System.out.println(b);
//		}
		for(int c=1; c<101; c++) {		
			System.out.println(c);
		}
		
//		int c=1;
//		for(; c<101; c++) {		문법상 사용가능하지만 이렇게 사용하지말것		
//			System.out.println(c);
	}

}


