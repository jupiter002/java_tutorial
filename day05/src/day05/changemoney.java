package day05;

public class changemoney {
	public static void main(String[] args){
		//50000, 10000, 5000, 1000, 500, 100, 50 ,10
		// 배열은 규칙이 없는것에 규칙을 만들때 사용
		int money = 1002310;
		int money_paper[] = {50000,10000,5000, 1000, 500, 100, 50 ,10};
		for(int i=0; i<money_paper.length; i++) {
			
				int j=money/money_paper[i];
				money = money-j*money_paper[i];
				System.out.print(money_paper[i]+"원 ");
				System.out.println(j+"장");
				}
		for(int i=0; i<money_paper.length; i++) {
			System.out.println(money_paper[i]+"원 "+money/money_paper[i]+"장");
			money = money % money_paper[i];
		}
	}
}