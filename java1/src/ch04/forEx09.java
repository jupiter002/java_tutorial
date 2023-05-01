package ch04;

public class forEx09 {
	public static void main(String[] args) {
		// 반복문 속 조건문 <=> 조건문 속 반복문
	for(int a=1; a<11; a++) {	//for문의 조건식이 true일때 실행
		if(a%2 == 0) {			//if문의 조건식이 true일때 실행
								// % : %연산자는 나누고 난 후에 나머지값을 구하는 연산자
			System.out.println(a+" : 짝수");
		}
		else {	// if문의 조건식이 false일때 실행
			System.out.println(a+" : 홀수");
		}	// if문 종료
	}	//for문 종료
	
	
	
	
	
	}
}
