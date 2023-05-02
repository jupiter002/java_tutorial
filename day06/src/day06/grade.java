package day06;

public class grade {
	//kor, eng, mat
	// 평균 출력
	public double kor;
	public double eng;
	public double mat;
	public grade() {
		
	}
	public grade(double kor, double eng, double mat) {
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
	}
	public double avg(double digit) {
//		double num = 1;
//		for(int i=0; i<digit; i++) {
//			num=num*10;
//		}
		double num = Math.pow(10, digit);
		double avg_1 = Math.round(((kor+eng+mat)/3)*num);
		
		return avg_1/num;
		
	}
//	System.out.println("나의 평균은"+(double)(kor+eng+mat)/3+"입니다");
	
	
}