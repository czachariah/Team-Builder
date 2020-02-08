import java.util.Scanner; 
/**
 * This class is called when running the program.
 * The methods are the different commands that can be run to change the set of team members.
 @author Chris Zachariah (cvz2)
 */
 
public class ProjectManager
{
   Scanner stdin;
   Team cs213;
   
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
   } // run()
   
   private void add()
   {
	   String name;
	   name = stdin.next();
	   
	   String date;
	   date = stdin.next();
	  
	   Date newDate = new Date(date);
	   
	   if (newDate.isValid()) {
		   TeamMember newMember = new TeamMember(name,newDate);
		   cs213.add(newMember);
	   }
	   else 
	   {
		   System.out.println(date + " is not a valid date!");
	   }
   } // add()
   
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
   
   private void print()
   {
	  cs213.print(); 
   } // print()
} //ProjectManager
