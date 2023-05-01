package ch04;

public class forEx04 {
	public static void main(String[] args) {
//		int sum = 0;
////		sum = (sum+1);
////		sum = (sum+2);
////		sum = (sum+3);
////		sum = (sum+4);
////		sum = (sum+5);
////		System.out.println(sum);
		
		int sum_1 = 0;
		for(int sum=1; sum<6; sum++) {
				sum_1+=sum;
		
		}
		
		System.out.println(sum_1);
		
		// ---------------------------------
		
		int sum_2= 1;
		int a;
		for(a=2; a<6; a++) {
				sum_2+=a;
		
		}
		System.out.println(sum_2);
		
		// ---------------------------------
		
		int sum_3 = 0;
		for(int b = 1; b<101; b++) {
				sum_3+=b;
			
		}
		System.out.println(sum_3);
		
		
		
	}
}

