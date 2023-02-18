package com.malu.blog.helpers;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class ConvertDate {
    private static String textConversion(Date date, String type) {
	    String strDate = "";
	    String format = "yyyy-MM-dd";    if (type.equalsIgnoreCase("time")) {
	      format = "yyyy-MM-dd HH:mm:ss";
	    }
	    if (date != null) {
	      try {
	        DateFormat dateFormat = new SimpleDateFormat(format);
	        strDate = dateFormat.format(date);
	      } catch (Exception e) {
	        System.out.println("can not be converted to text:" + e.getMessage());
	      }    }
	    return strDate;
	  } 
	
	
	 public static Date toDate(String date_as_string) {
		    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		    Date convert = null;
		    try {
		      if (date_as_string != null && !date_as_string.equals("")) {
		        convert = format.parse(date_as_string);
		      }    } catch (ParseException e) {
		      System.out.println("Fail to convert to date: " + e.getMessage());
		    }
		    return convert;
		  }  

	
	public static Date TexttoDate(String date_as_string) {
	    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	    Date convert = null;
	    try {
	    	
	      if (date_as_string != null && !date_as_string.equals("")) {
	        convert = format.parse(date_as_string);
	        return convert;
	        
	      }    } catch (ParseException e) {
	          System.out.println("Fail to convert to date: " + e.getMessage());
	    	  return null;
	
	    }
		return convert;
	  
	  } 
	
	
	public static Date toDateWithHeureMinSec(String date_as_string) {
	    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");   
	    Date convert = null;
	    try {
	      if (date_as_string != null && !date_as_string.equals("")) {
	        convert = format.parse(date_as_string);
	      }    } catch (ParseException e) {
	      System.out.println("Fail to convert to date: " + e.getMessage());
	    }
	    return convert;
	  } 
	  
	  
	  
	  
	  public static String convertDateTimeFormats(Object date) {
	    String strDate = "";    if (date != null) {
	      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	      strDate = sdf.format(date);
	    }    return strDate;
	  } 
	  
	  public static String datetoText(Date date) {
	    return textConversion(date, "");
	  }  
	  
	 
	  public static String DatetoTexts(Date date, String time) { 
	    return textConversion(date, time);
	  }   
	
	  public static String convertDateTimeFormat(Object date) {
		    String strDate = "";    if (date != null) {
		      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		      strDate = sdf.format(date);
		    }    return strDate;
		  } 
		  
		  public static String toText(Date date) {
		    return textConversion(date, "");
		  }
		 
		  
		  public static String LocalDatetoText(LocalDate date) {
		    return textConversionLocalDate(date, "");
		  }
		  private static String textConversionLocalDate(LocalDate date, String type) {

			String strDate = "";
			String format = "yyyy-MM-dd";   
			
			if (type.equalsIgnoreCase("time")) {
			  format = "yyyy-MM-dd HH:mm:ss";
			}
			if (date != null) {
			  try {
				DateFormat dateFormat = new SimpleDateFormat(format);
				strDate = dateFormat.format(date);
			  } catch (Exception e) {
				System.out.println("can not be converted to text:" + e.getMessage());
			  }  
			
			}
			return strDate; 
		}


		public static String toText(Date date, String time) {
		    return textConversion(date, time);
		  } 
		  
		 
		  public static Date now() {
		    Date date = new Date();
		    return date;
		  }  

	  

}
