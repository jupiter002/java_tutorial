package inter;

public class iphone implements mobilePhoneInterface {

	@Override
	public void sendCall() {
		System.out.println("아이폰 신호음이 울립니다.");
		
	}

	@Override
	public void receivecCall() {
		System.out.println("전화 왔어요.");
		
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receiveSMS() {
		// TODO Auto-generated method stub
		
	}
	
}