/**
 This class will store the private attributes, name and the startDate, of a team member, which can then be accessed by public methods.
 @author Chris Zachariah (cvz2) 
 */
public class TeamMember 
{
   private String name;
   private Date   startDate;
   
   /**
    * This is the parameterized constructor for the TeamMember class.
    * @param nm is the name of the person
    * @param date is the starting date (Date object)
    */
   public TeamMember(String nm, Date date)
   {
       name = nm;
       startDate = date;
   } // TeamMember()
   
   /**
    * This method gets the startDate of the current Team Member.
    * @return the startDate
    */
   public Date getStartDate()
   {
      return startDate;
   } // getStartDate();
   
   /**
    * This method will compare another TeamMember object with the current TeamMember object to check to see if all the parameters (name and startDate) are the same.
    * @param obj is a TeamMember object
    * @return true if the other TeamMember object has the same parameters as the current TeamMember object, false otherwise
    */
   public boolean equals(Object obj)
   {
	   if (obj instanceof TeamMember) 
	   {
		   TeamMember pointer = (TeamMember) obj;
		  
		   if ((this.name.equals(pointer.name)) && (this.getStartDate().equals(pointer.getStartDate())))
		   {
			   return true;
		   }
	   }
       return false;
   } // equals()
   
   /**
    * This method will print the contents of the current TeamMember's attributes.
    * @return the name and startDate in String form
    */
   public String toString()
   {
	   return name + " " + startDate;
   } // toString()

   /**
    * This is the testbed main where the constructor and the methods can be tested.
    * @param args are the arguments to test
    */
   public static void main(String [] args)
   {
      
   } // main()
} // TeamMemeber
