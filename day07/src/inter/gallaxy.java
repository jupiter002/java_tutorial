package inter;

public class gallaxy implements mobilePhoneInterface, mp3 {

	@Override
	public void sendCall() {
		System.out.println("띵동");
		
	}

	@Override
	public void receivecCall() {
		System.out.println("문자왔숑");
		
	}
	
	public void samsungPay() {
		System.out.println("삼성페이 찌익");
	}

	@Override
	public void sendSMS() {
		System.out.println("SMS 보낼 수 있음");
		
	}

	@Override
	public void receiveSMS() {
		System.out.println("SMS 받을 수 있음");
		
	}

	@Override
	public void stop() {
		System.out.println("music stop");
		
	}

	@Override
	public void play() {
		System.out.println("music start");
		
	}
	
}
