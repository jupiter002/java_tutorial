package day05;

public class for01 {
	public static void main(String[] args) {
		int i=0;
		int sum=0;
		for(i=1; i<11; i++) {
			System.out.print(i);
			sum+=i;
			if(i<10) {
				System.out.print("+");
			}
			else {
				System.out.println("=");
				System.out.println(sum);
			}
		
		
	}

}
}