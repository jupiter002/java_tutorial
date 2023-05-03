package ab;

public class lgCalculator extends calculator {

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		return a-b;
	}

	@Override
	public double average(int[] nums) {
		double sum=0;
		int total = nums.length;
		for(int num:nums) {
			sum+=num;
		}
		return sum/total;
	}
	
	
	
	

}
