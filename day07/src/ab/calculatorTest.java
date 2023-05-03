package ab;

public class calculatorTest {
	public static void main(String[] args) {
		int nums [] = {98,88,76};
		samsungCalculator samsung = new samsungCalculator();
		System.out.println(samsung.add(10, 23));
		System.out.println(samsung.average(nums));
		
		lgCalculator lg = new lgCalculator()
				;
		System.out.println(lg.add(10, 23));
		
		
		
		
		
	}
}
