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
	   for (int i = 0 ; i < team.length ; i++)
	   {
		   if ((team[i] != null) && (team[i].equals(m)))
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
       } 
       else 
       {
    	   return false;
       }
   } // isEmpty()
   
   /**
    * This method will add a new member to the team as long as this person already does not exist in the team to begin with.
    * @param m
    */
   public void add(TeamMember m)
   {     
	   if (contains(m))
	   {
		   System.out.println(m.toString() + " is already in the team.");
	   }
	   else 
	   {
		   int newPlace = NOT_FOUND;
		   for (int i = 0 ; i < team.length ; i++)
		   {
			   if (team[i] == null)
			   {
				   newPlace = i;
				   break;
			   }
		   }
		   
		   if (newPlace == NOT_FOUND)
		   {
			   grow();
			   // try to add the person 
		   }
		   else
		   {
			   team[newPlace] = m;
			   numMembers++;
		   }
	   }
   } // add()
   
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
	   if (isEmpty()) 
	   {
		   System.out.println("We have 0 team members!");
	   }
	   else 
	   {
		   System.out.println("We have the following " + numMembers +" team member(s): ");
		   for(int i = 0 ; i < numMembers ; i++) 
		   {
			   System.out.println(team[i].toString());
		   }
		   System.out.println("-- end of the list --");
	   }
   } // print()
}// Team
