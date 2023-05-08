package day09;
import java.util.*;

class office{
	private String name;
	private String tel;
	public office(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
}




public class officeMap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer,office> office1 = new HashMap<>();
		office1.put(1, new office("시청","02-111-1111"));
		office1.put(2, new office("고용노동부","02-111-1111"));
		office1.put(3, new office("동사무소","02-111-1111"));
		office1.put(4, new office("","02-111-1111"));
		office1.put(5, new office("시청","02-111-1111"));
		
	}
	
	
	

}
