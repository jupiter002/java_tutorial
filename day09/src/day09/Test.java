package day09;
import java.util.*;
public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> scoreList = new ArrayList<>();
		int i=0;
		double score=0;
		while(true) {
			scoreList.add(sc.next());
			i++;
			if(i>6)break;
		}
		for(int j=0; j<7; j++) {
			System.out.println(scoreList.get(j));
			switch(scoreList.get(j)) {
			case"a" : score+=4.5; break;
			case"b" : score+=3.5; break;
			case"c" : score+=3.0; break;
			case"d" : score+=2.0; break;
			case"f" : score+=0.0; break;
			}	
		}
		System.out.println(score/scoreList.size());
		
		
		
	}
}
