package wrapperclasses;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarClassDemo {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println("Formatted date using calendar instance : "+sdf.format(cal.getTime()));
		
		System.out.println(" Todays date"+cal.get(Calendar.DAY_OF_MONTH));

	}

}
