package Test;

public class test16 {
	public static void main(String[]args) {
		int a,b;
		for(a=0; a<5; a++) {
			int i=0;
			i+=2;
			for(b=5-a; b>0; b--) {
				System.out.print(" ");
			}
			for(b=0; b<a*i+1; b++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
		
	}
}
