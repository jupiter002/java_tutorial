package ch04;

public class forEx05 {
	public static void main(String[] args) {
		// 100까지의 홀수 합
		System.out.println("1~100홀수의 합");
		int sum = 0;
		for(int i=1; i<101; i+=2) {
				sum+=i;
		}
		System.out.println(sum);
		
		System.out.println("--------------");
		
		// 100까지의 짝수 합				
		System.out.println("1~100짝수의 합");
		int sum_1 = 0;
		for(int i=2; i<101; i+=2) {
			sum_1+=i;
		}
		System.out.println(sum_1);
		

	}
}
