package wrapperclasses;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
	
		Date d = new Date();
		
		System.out.println("Current time : "+d.toString());
		
		//To display dates in specific format
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println("Formatted date "+sdf.format(d));
		
		SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		System.out.println("Formatted date "+sd.format(d));
	}

}
