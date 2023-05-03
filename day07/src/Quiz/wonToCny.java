package Quiz;

public class wonToCny extends converter {
	public wonToCny(double ratio) {
		this.ratio=ratio;
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
		return "위안";
	}
public static void main(String[] args) {
	wonToCny cnconverting = new wonToCny(193);
	cnconverting.converting();
}
}
