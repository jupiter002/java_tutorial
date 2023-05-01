package ch04;

public class labelEx01 {
	public static void main(String[] args) {
		int a, b;
		aa:for(a=1; a<6; a++) {	// aa라는 이름을 붙여줌.
			for(b=1; b<6; b++) {
				if(b==3) {
					break aa;	// aa실행문을 중지
				}
				System.out.println(a+"--"+b);
			}
		}
		
		
		
		
	}
}
