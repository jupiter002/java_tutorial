package Quiz;

import java.util.Scanner;

public abstract class converter {
	abstract public double convert(double src);
	abstract public String srcString();
	abstract public String destString();
	protected double ratio;
	
	public void converting() {
		Scanner sc = new Scanner(System.in);
		System.out.println(srcString()+"을 "+destString()+"로 바꿔줍니다.");
		System.out.println(srcString()+"을 입력하세요.");
		double inputValue = sc.nextDouble();
		double result = convert(inputValue);
		System.out.println("변환결과 :"+String.format("%.2f",result)+destString()+"입니다.");
		System.out.println("변환결과 :"+Math.round(result*100)/100.0+destString()+"입니다.");
	}
}
