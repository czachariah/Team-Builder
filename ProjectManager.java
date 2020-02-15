import java.util.Scanner; 
/**
 * This class is called when running the program.
 * The methods are the different commands that can be run to change the set of team members.
 @author Chris Zachariah (cvz2)
 @author Anthony Topol (at877)
 */
public class ProjectManager
{
   Scanner stdin;
   Team cs213;
   
   /**
    * This method will be used to run the main program. The rest of the private methods
    * are the accepted commands that will be used to manipulate the team.
    */
   public void run()
   {
	   System.out.println("Let's start a new team!");
	   stdin = new Scanner(System.in);
	   cs213 = new Team();
	   
	   boolean done = false;
	   while (!done)
	   {
         String command = stdin.next();
         switch (command.charAt(0))  
         {
            case 'A': add();
		    	break;
            case 'R': remove();
            	break;
            case 'P': print();
            	break;
            case 'Q': print(); done = !done; // terminate the program
            	break;
            case 'a': System.out.println("Command '"+ command.charAt(0) +"' is not supported!"); command = stdin.next(); command = stdin.next();
	    		break;
            case 'r': System.out.println("Command '"+ command.charAt(0) +"' is not supported!"); command = stdin.next(); command = stdin.next();
        		break;	
            default: System.out.println("Command '"+ command.charAt(0) +"' is not supported!");	//deal with bad command here 
         } // ends the switch statement 
      } // ends the while loop
      System.out.println("The team is ready to go!");
      stdin.close();
   } // run()
   
   /**
    * This method will be used to add new members to the team.
    * The members must not already be on the team and the starting date must be valid.
    */
   private void add()
   {
	   String name;
	   name = stdin.next();
	   
	   String date;
	   date = stdin.next();
	  
	   Date newDate = new Date(date);
	   
	   if (newDate.isValid()) {
		   TeamMember newMember = new TeamMember(name,newDate);
		   if ((cs213.isEmpty() == false) && (cs213.contains(newMember) == true)) 
		   {
			   System.out.println(newMember.toString() + " is already in the team.");
		   }
		   else
		   {
			   cs213.add(newMember);
			   System.out.println(newMember.toString() + " has joined the team.");
		   }
	   }
	   else 
	   {
		   System.out.println(date + " is not a valid date!");
	   }
   } // add()
   
   /**
    * This method will be used to remove members from the team.
    * The member must be in the team with the matching starting date and the date must be valid.
    */
   private void remove()
   {
	   String name;
	   name = stdin.next();
	   
	   String date;
	   date = stdin.next();
	   
	   Date newDate = new Date(date);
	   
	   if (newDate.isValid()) {
		   TeamMember memberToRemove = new TeamMember(name,newDate);
		   if (cs213.remove(memberToRemove))
		   {
			   System.out.println(memberToRemove.toString() + " has left the team.");
		   }
		   else 
		   {
			   System.out.println(memberToRemove.toString() + " is not a team member.");
		   }
	   }
	   else 
	   {
		   System.out.println(date + " is not a valid date!");
	   }
	   
   } // remove()
   
   /**
    * This method will print the current members in the team.
    */
   private void print()
   {
	  cs213.print(); 
   } // print()
} //ProjectManager
