package ch04;

public class forEx07 {
	public static void main(String[] args) {
		//for문 속 for문
		int a;
		int b;
		
		for(a=1; a<10; a++) {		
			System.out.println("구구단은 비둘기단");
			for(b=1; b<10; b++) {
				System.out.println(a+"X"+b+"="+a*b);
								// () 수학에서 연산 우선순위 가장 높다.
			}
		}
		
		
	}
}
