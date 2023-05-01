package day05;

public class Score {
	public static void main(String[] args) {
		double scoreList[][] = {{1.1,2.2},{3.3,4.4},{5.5,6.6},{7.7,8.8}};
		//4년 학점 평균
		double sum = 0;
		int i, j;
		for(i=0; i<scoreList.length; i++) {
			for(j=0; j<scoreList[i].length; j++) {
			sum+=scoreList[i][j];
		}
			}
		System.out.println(sum/8);
		System.out.println(scoreList);
		
	}
}
