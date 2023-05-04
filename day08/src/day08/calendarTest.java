package day08;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class calendarTest {
	public static void main(String[] args) {
		
	Calendar now = Calendar.getInstance();
	int year = now.get(Calendar.YEAR);
	int month = now.get(Calendar.MONTH);
	int day = now.get(Calendar.DAY_OF_WEEK);
	int date = now.get(Calendar.DAY_OF_MONTH);
	int hourOfDay = now.get(Calendar.HOUR_OF_DAY);
	int hour = now.get(Calendar.HOUR);
	int ampm = now.get(Calendar.AM_PM);
	int min = now.get(Calendar.MINUTE);
	int sec = now.get(Calendar.SECOND);
	
	System.out.println(now.getTime());
	SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd - HH:mm:ss");
	System.out.println(sdf.format(now.getTime()));
	
	System.out.println(ampm==0?"오전":"오후"+" "+hour+":"+hourOfDay+":"+min+":"+sec);
	String monthArray [] = {"jan","feb","mar","apr","may","jun","july","aug","sep","oct","nov","dec"};
	
	String dayArray[] = {"sun","mon","tue","wed","thu","fri","sat"};
	
	System.out.println(year+"/"+monthArray[month]+"/"+day+"/"+date+"/"+dayArray[day-1]);
	
	
}
}