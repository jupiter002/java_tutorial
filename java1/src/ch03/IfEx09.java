package ch03;

public class IfEx09 {
	public static void main(String[] args) {
		// 변수 : 선언된 블럭(영역,지역)
		//				블럭이 닫히면 자동으로 삭제된다.
		int a = 100;
		if( a>0 ) {
			int x = 1000;
			System.out.println(a);
			System.out.println(x);
		}//if문 종료 >> int x : 자동삭제
		System.out.println(a);
//		System.out.println(x); if문 밖에서는 사용 못함.
	}//main종료
}
