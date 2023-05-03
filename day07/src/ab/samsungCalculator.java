package ab;

public class samsungCalculator extends calculator {

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
		double sum = 0;
		int total = nums.length;
		for(int i=0; i<total; i++) {
			sum=sum+nums[i];
		}
		return (sum/total);
	}
}
