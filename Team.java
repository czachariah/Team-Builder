/**
  This method makes the team of members.
  The methods are used to add to, remove from or print from the current set of team members.
 @author  Chris Zachariah (cvz2)
 */
public class Team 
{
   private final int NOT_FOUND = -1;
   private final int GROW_SIZE = 4; //initial and grow size
   private TeamMember [] team;
   private int numMembers;
   
   /**
    * This is the default constructor where an array of Team Members will be initialized.
    */
   public Team()
   {
      team = new TeamMember[GROW_SIZE];
   }
   
   private int find(TeamMember m)
   {
       return 1;
   }
   
   private void grow()
   {
       
   }
   /**
    * This method will check if team is empty or not.
    * @return true if empty or false otherwise
    */
   public boolean isEmpty()
   {
       if (team[0] == null)
       {
    	   return true;
       } else {
    	   return false;
       }
   } // isEmpty()
   
   public void add(TeamMember m)
   {     
            
   }
   
   public boolean remove(TeamMember m)
   {
       return true;
   } 
   
   public boolean contains(TeamMember m)
   {
      return true;
   } 
   
   public void print()
   {
      //set up a for loop and call the toString() method
   } 
}
