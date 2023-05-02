package day05;

import java.util.Arrays;

public class test01 {
	public static void main(String[] args) {
for(int k=0; k<5; k++) {
		int lotto[] = new int[6];
		System.out.print("로또번호 : ");
		// 로또 번호는 중복되면 안된다.
			for(int i=0; i<lotto.length; i++) {
				lotto[i] = (int)(Math.random()*45)+i;
				for(int j=0; j<i; j++) {	// 중복 처리
					if(lotto[i]==lotto[j]) {
						i--;
						break;
			
			}
			}
			
//			System.out.print((int)(Math.random()*45+1)+" ");
		}	//filltering	/	sorting
		Arrays.sort(lotto);
		
			for(int j=0; j<lotto.length; j++) {
				System.out.print(lotto[j]+",");
		}
			System.out.println();
}

	}
}
