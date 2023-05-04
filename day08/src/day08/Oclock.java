package day08;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Oclock {
	public static void main(String[] args) {
		
	Calendar now = Calendar.getInstance();
	
	int nowhour = 22; 
	int nowmin =  now.get(Calendar.MINUTE);
	if(nowhour>6 && nowhour<12) {
		System.out.println("goodmorning "+nowhour+"시"+nowmin+"분");
		}
	else if(nowhour>11 && nowhour<18) {
		System.out.println("goodafternoon "+nowhour+"시"+nowmin+"분");
		}
	else if(nowhour>17 && nowhour<22) {
		System.out.println("goodevening "+nowhour+"시"+nowmin+"분");
		}
	else {
		System.out.println("goodnight "+nowhour+"시"+nowmin+"분");
		}
	
	

	}
}