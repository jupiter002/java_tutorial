package Quiz;

public class wonToDollar extends converter{
	
	
	
	
	public wonToDollar(double ratio) {
		this.ratio=ratio;
			
	}

	@Override
	public double convert(double src) {
		return src/ratio;
	}

	@Override
	public String srcString() {
		// TODO Auto-generated method stub
		return	"원";
	}

	@Override
	public String destString() {
		// TODO Auto-generated method stub
		return "달러";
	}
	
}
