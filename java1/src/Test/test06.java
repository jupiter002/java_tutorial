package Test;

public class test06 {
	public static void main(String[] args) {
		int a,b;
		for(a=1; a<6; a++) {
			for(b=1; b<6-a; b++) {
				System.out.print(" ");
			}
			for(b=0; b<a; b++) {
				System.out.print("*");
			}
			System.out.println();			
			
		}
		
		
		
		
	}
}
