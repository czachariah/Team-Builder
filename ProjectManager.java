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
            default: System.out.println("Command '"+ command.charAt(0) +"' is not supported");	//deal with bad command here 
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
	   
	   System.out.println("adding "+ name + " " + date);
      	//must check if the date is valid
	//must call the contains() method to check if a given 
	//team member is in the team already
   } // add()
   
   private void remove()
   {
	   String name;
	   name = stdin.next();
	   
	   String date;
	   date = stdin.next();
	   
	   System.out.println("removing "+ name + " " + date);
      //must check if the date is valid
	   
   } // remove()
   
   private void print()
   {
	   System.out.println("printing");
      //must check if the team has 0 members. 
   } // print()
} //ProjectManager
