package ch04;

public class forEx11 {
	public static void main(String[] args) {
		int a, b;
		for(a=1; a<6; a++) {
			for(b=1; b<6; b++) {
				if(b==3) {	// 가까운 for문 종료시킴
							// b for문 종료.
					break;
				}
			}
			System.out.println(a+"--"+b);
			
		}
		
		
		
		
	}
}
