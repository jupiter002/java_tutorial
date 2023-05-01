package ch04;

public class whileEx03 {
	public static void main(String[] args) {
		// 구구단
//		int dan,n;
//		for(dan=2; dan<10; dan++) {
//			for(n=1; n<10; n++) {
//				System.out.println(dan+"X"+n+":"+(dan*n));
//			}
//		}
		int a=0;		
		while(a<10) {
			int b=1;		// 항상 초기식의 위치는 조건식의 위 일것.
			while(b<10) {
				System.out.println(a+"X"+b+"="+a*b);
				b++;
			}
				a++;
			
		}
		
		
		
		
	}
}
