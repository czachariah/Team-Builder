import java.util.*; 
/**
  This class makes the Date object that is used in other classes.
 @author  Chris Zachariah (cvz2)
 @author Anthony Topol (at877)
 */
public class Date 
{
   private int  day;
   private int  month;
   private int  year;
   
   /**
    * This is a parameterized constructor that takes in a date in String form, from which the information
    * will be converted to a new Date object.
    * @param d is a date in String form: month/day/year
    */
   public Date(String d)
   {
	   try 
	   {
		   StringTokenizer dateToConvert = new StringTokenizer(d,"/");
		   month = Integer.parseInt(dateToConvert.nextToken());
		   day = Integer.parseInt(dateToConvert.nextToken());
		   
		   // make sure that the year is 4 digits long
		   String yearToCheck = dateToConvert.nextToken();
		   if (yearToCheck.length() == 4)
		   {
			   year = Integer.parseInt(yearToCheck);
		   }
		   else 
		   {
			   month = 0;
			   day = 0;
			   year = 0;
			   throw new ArithmeticException();
		   }  
	   } 
	   catch (Exception e)
	   {
		   /*
		    * Do nothing here.
		    * This error will create an object with the attributes 0/0/0
		    * which will not pass the isValid() check when running the main program
		    */
	   }
	   
   } // Date()
   
   /**
    * This is a parameterized constructor that takes in a Date object and copies all the same information to the current Data object.
    * @param d is another Data object
    */
   public Date(Date d)
   {
	   this.day = d.day;
	   this.month = d.month;
	   this.year = d.year;
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
   } // isValid()
   
   /**
    * This method will check if the year is a leap year.
    * @param year is the year to check
    * @return true if it is a leap year and false otherwise
    */
   private boolean isLeapYear(int year) 
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
    * @param obj is a Date object
    * @return true if the other Data object has the same parameters as the current Date object, false otherwise
    */
   @Override
   public boolean equals(Object obj)
   {
	   if (obj instanceof Date) {
		   Date pointer = (Date) obj;

		   if ((pointer.day == this.day) && (pointer.month == this.month) && (pointer.year == this.year)) 
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
    * @param args are the arguments to test
    */
   public static void main(String [] args)
   {
	   // test the first Date constructor
	   Date first = new Date ("9/10/2011");		
	   System.out.println(first.toString()); // no problems
	   
	   // test the second Date constructor
	   Date second = new Date(first);
	   System.out.println(second.toString()); // no problems
	   
	   // test the isValid() methods
	   System.out.println(first.isValid());		// true
	   System.out.println(second.isValid());	// true
	   
	   Date third = new Date("2/29/19");
	   System.out.println(third.isValid());	// error, false
      
	   // some errors when creating Date
	   Date fourth = new Date("2-3-4");		// error
	   Date fifth = new Date("2/3/-2004");	// error
	   System.out.println(fourth.isValid());		// false
	   System.out.println(fifth.isValid());			// false
	   
	   // test the equals() method with existing objects 
	   System.out.println(first.equals(second));		// true
	   System.out.println(second.equals(first));		// true
	   
	   // testig the equal() method with new Date object
	   Date sixth = new Date("3/28/1999");			
	   System.out.println(second.equals(sixth));		// false
   } // main()
} // Date


