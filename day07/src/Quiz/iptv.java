package Quiz;

public class iptv extends colorTv{
private String ip;
	public iptv(String ip, int size, int color) {
		super(size, color);
		this.ip=ip;
	}

		public String getip(String ip) {
			return ip;
		}
	
		public void showInfo() {
			System.out.println("ip adress: "+ip+" "+size+"inch "+this.getColor()+"color");
			System.out.print("ip adress: "+ip+" ");
			super.showInfo();
		}
		
		
		
		public static void main(String[] args) {
			iptv lgtv = new iptv("192.168.200.11",82,7680);
			lgtv.showInfo();
			
					
		}
		
		
		
	}

