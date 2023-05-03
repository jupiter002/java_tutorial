package inter;

public class phoneTest {
	public static void main(String[] args) {
		gallaxy gallaxy22 = new gallaxy();
		gallaxy22.sendCall();
		gallaxy22.receivecCall();
		gallaxy22.samsungPay();
		gallaxy22.sendSMS();
		gallaxy22.receiveSMS();
		gallaxy22.stop();
		gallaxy22.play();
		
		System.out.println("------------------");
		
		iphone iphone14 = new iphone();
		iphone14.sendCall();
		iphone14.receivecCall();
		iphone14.printLogo();
		
		phoneInterface myPhone = new gallaxy();	// interface
		phoneInterface myPhone1 = new iphone();
		
		
	}
}
