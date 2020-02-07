/**
  This class makes the team of members.
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
   } // Team()
   
   /**
    * This private method is used to iterate through the team and find a specific team member.
    * @param m
    * @return index in the team array if the team member is found else -1
    */
   private int find(TeamMember m)
   {
       for (int i = 0 ; i < numMembers ; i++) 
       {
    	   if (team[i].equals(m)) 
    	   {
    		   return i;
    	   }
       }
	   return NOT_FOUND;
   } // find()
   
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
	   team[0] = m;
	   numMembers++;
   }
   
   public boolean remove(TeamMember m)
   {
       return true;
   } 
   
   /**
    * This method will tell the user if a specific team member is already inside the team.
    * @param m
    * @return true if the member is already in the team and false otherwise
    */
   public boolean contains(TeamMember m)
   {
      if (find(m) != NOT_FOUND) 
      {
    	  return true;
      }
      else
      {
    	  return false;
      }
   } // contains
   
   /**
    * This method will print out all the current team members.
    */
   public void print()
   {
	   if (team[0] != null) 
	   {
		   System.out.println("We have 0 team members!");
	   }
	   else 
	   {
		   System.out.println("We have the following team members: ");
		   for(int i = 0 ; i < numMembers ; i++) 
		   {
			   team[i].toString();
		   }
		   System.out.println("-- end of the list --");
	   }
   } // print()
}// Team
