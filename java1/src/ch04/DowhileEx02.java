package ch04;

public class DowhileEx02 {
	public static void main(String[] args) {
		// while문을 뒤집은
		// 무조건 한번은 실행한다.
		// 무조건 한번은 실행한다 => 조건이 false여도 실행.
		int a=0;
		while(a<3) {
			a++;
			System.out.println("hello");
		}
		
		
		//dp=while문

		int b=0;
		do {
			
			System.out.println("hi");
			b++;
		}while(b<3);
		
	}
}
