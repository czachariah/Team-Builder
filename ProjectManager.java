import java.util.Scanner; 
/**
 @author Chris Zachariah (cvz2)
 */
 
public class ProjectManager
{
   Scanner stdin;
   Team cs213;
   public void run()
   {
	   stdin = new Scanner(System.in);
	   boolean done = false;
	   while ( !done )
	   {
         String command = stdin.next();
        
         if (command.length() != 1) // make sure that the command is formatted correctly
         {
        	 if (command.charAt(1) != ' ')
        	 {
        		 
        	 }
        	 System.out.println("here");
         }
         switch (command.charAt(0))  
         {
            case 'A': add();
		    	break;
            case 'R': remove();
            	break;
            case 'P': print();
            	break;
            case 'Q': print(); done = !done;
            	break;
            default: System.out.println("Command '"+ command.charAt(0) +"' is not supported");	//deal with bad command here 
         } // ends the switch statement 
      } // ends the while loop
      //write java code before you terminate the program
      System.out.println("The team is ready to go!");
   } // run()
   
   private void add()
   {
	   System.out.println("adding");
      	//must check if the date is valid
	//must call the contains() method to check if a given 
	//team member is in the team already
   } // add()
   
   private void remove()
   {
	   System.out.println("removing");
      //must check if the date is valid
	   
   } // remove()
   
   private void print()
   {
	   System.out.println("printing");
      //must check if the team has 0 members. 
   } // print()
} //ProjectManager
