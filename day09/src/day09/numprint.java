package day09;
import java.util.*;
public class numprint {
		public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> print1 = new ArrayList<>();
	
	while(true) {
		int num = sc.nextInt();
		if(num==-1) {
			break;
		}
		print1.add(num);
		System.out.println(print1);
	}
	int biggest = print1.get(0);
	for(int i=0; i<print1.size(); i++) {
		if(print1.get(i) > biggest) {
			biggest = print1.get(i);
		}
	}
	System.out.println("가장 큰 숫자는 === "+biggest);
	}
}