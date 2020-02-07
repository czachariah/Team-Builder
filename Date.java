import java.util.*; 
/**
  This class makes the Date object that is used in other classes.
 @author  Chris Zachariah (cvz2)
 */
public class Date 
{
   private int  day;
   private int  month;
   private int  year;
   
   /**
    * This is a parameterized constructor that takes in a date in String from which the information
    * will be converted to forms that can create a new Date object.
    * @param d is a date in String form: month/day/year
    */
   public Date(String d)
   {
	   StringTokenizer dateToConvert = new StringTokenizer(d,"/");
	   month = Integer.parseInt(dateToConvert.nextToken());
	   day = Integer.parseInt(dateToConvert.nextToken());
	   year = Integer.parseInt(dateToConvert.nextToken());
   } // Date()
   
   /**
    * This is a parameterized constructor that takes in a Date object and copies all the same information to the current Data object.
    * @param d is another Data object
    */
   public Date(Date d)
   {
	   day = d.day;
	   month = d.month;
	   year = d.year;
   } // Date()
   
   /**
    * This method will check the date to make sure it is valid.
    * @return true if the date is valid and false otherwise
    */
   public boolean isValid()
   {
	   // months with 31 days
	   if ((month == Month.JAN) || (month == Month.MAR)|| (month == Month.MAY) 
			   || (month == Month.JUL) || (month == Month.AUG) 
			   || (month == Month.OCT) || (month == Month.DEC))
	   {
		   if ((day >= 1) && (day <= Month.DAYS_ODD))
		   {
			   return true;
		   }
		   else 
		   {
			   return false;
		   }
	   }
	   // months with 30 days
	   else if ((month == Month.APR) || (month == Month.JUN) || (month == Month.SEP) 
			   || (month == Month.NOV))
	   {
		   if ((day >= 1) && (day <= Month.DAYS_EVEN))
		   {
			   return true;
		   }
		   else 
		   {
			   return false;
		   }
	   }
	   // February
	   else if (month == Month.FEB)
	   {
		   if ((day >= 1) && (day <= Month.DAYS_FEB))
		   {
			   return true;
		   }
		   // true if 29th and leap year, false otherwise
		   else
		   {
			   if ((day == 29) && (isLeapYear(year)))
			   {
				   return true;
			   }
			   else 
			   {
				   return false;
			   }  
		   } 
	   }
	   // not a valid month
	   else 
	   {
		   return false;
	   }  
   } // isValid
   
   /**
    * This method will check if the year is a leap year.
    * @param year is the year to check
    * @return true if leap year and false otherwise
    */
   public boolean isLeapYear(int year) 
   {
	   if ((year % Month.QUADRENNIAL) == 0)
	   {
		   if ((year % Month.CENTENNIAL) == 0)
		   {
			   if ((year % Month.QUATERCENTENNIAL) == 0)
			   {
				   return true;
			   }
			   else
			   {
				   return false;
			   }
		   }
		   else 
		   {
			   return true;
		   }
	   } 
	   else 
	   {
		   return false;
	   }
   } // isLeapYear()
   
   /**
    * This method will return a String of the Data object in the form: month/day/year
    * @return String of the form: month/day/year
    */
   @Override
   public String toString()
   {
	   return month + "/" + day + "/" + year;
   } // toString()
   
   /**
    * This method will compare another Date object with the current Date object to check to see if all the parameters (day, month and year) are the same.
    * @param a Date object
    * @return true if the other Data object has the same parameters as the current Date object, false otherwise
    */
   @Override
   public boolean equals(Object obj)
   {
	   if (obj instanceof Date) {
		   Date pointer = (Date) obj;
		   if ((pointer.day == day) && (pointer.month == month) && (pointer.year == year)) 
		   {
			   return true;
		   } 
		   else 
		   {
			   return false;
		   }
	   }
       return false;
   }  // equals()
   
   /**
    * This is the testbed main where the constructor and the methods can be tested.
    * @param args
    */
   public static void main(String [] args)
   {
      
   } // main()
} // Date


