package org.currentyear;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;



public class Sample {

	public static void main(String[] args) throws ParseException {
		
		
		 Calendar c = Calendar.getInstance();
		 System.out.println(c.getTime());
		 
		c.add(Calendar.DATE,10 );
		 
		  System.out.println(c.getTime());
		  
		 
		
		
		
		
		
		
	}

}
