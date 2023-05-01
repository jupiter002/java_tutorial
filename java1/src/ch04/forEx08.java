package ch04;

public class forEx08 {
	public static void main(String[] args) {
		// for문 속 for문 2개
		int a;
		for(a=1; a<=5; a++) {
			for(int x=1; x<6; x++) {
				System.out.println(a+"//"+x);
			}		// x의 종료.
			for(int y=1; y<6; y++) {
				System.out.println(a+" hello");
		}			// y의 종료.
			}		//a의 종료.
//		int b;
//		for(b=1; b<6; b++) {
//			for(int x=1; x<6; x++) {
//				System.out.println(b+""+x);
//			}
//			for(int x=1; x<6; x++) {	// x는 로컬변수여서 서로 안겹침
//				System.out.println(b+""+x);
//			}
//		}
//		
		int c;
		int x;
		for(c=1; c<6; c++) {
			for(x=1; x<6; x++) {
				System.out.println(c+"//"+x);
			}
			for(x=1; x<6; x++) {	// x는 사용영역이 다르기 때문에 안겹침
				System.out.println(c+"--"+x);
				
			}
		}
		
		
		
		
	}
}
