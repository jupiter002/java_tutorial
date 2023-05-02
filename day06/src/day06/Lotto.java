package day06;
import java.util.Scanner;

import java.util.Arrays;

public class Lotto {
	public Lotto() {
		
	}
	public void howMany(int many) {
		for(int i=0; i<many; i++);
			makeLotto();
	}
	public Lotto(int many) {
		howMany(many);
	}
	private void makeLotto() {
		
	int lotto[] = new int[6];
	Scanner sc = new Scanner(System.in);
	// 로또 번호는 중복되면 안된다.
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+i;
			for(int j=0; j<i; j++) {	// 중복 처리
				if(lotto[i]==lotto[j]) {
					i--;
					break;
		
		}
		}
		
//		System.out.print((int)(Math.random()*45+1)+" ");
	}	//filltering	/	sorting
	Arrays.sort(lotto);
	
		for(int j=0; j<lotto.length; j++) {
			System.out.print(lotto[j]+",");
	}
		System.out.println();
		sc.close();
}

	
	
}
