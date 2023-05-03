package Quiz;

public class wonToEuro extends converter {
	
	public wonToEuro(double ratio) {
		this.ratio=ratio;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double convert(double src) {
		// TODO Auto-generated method stub
		return src/ratio;
	}

	@Override
	public String srcString() {
		// TODO Auto-generated method stub
		return "원";
	}

	@Override
	public String destString() {
		// TODO Auto-generated method stub
		return "유로";
	}

}
