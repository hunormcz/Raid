import heroes.*;
import java.io.*;

/*
 * ===== Application that creates a team composed of heroes =====
 * == Players have: name, hero type, dmg, armor, hp, skill1, skill2 == 
 */

class Raid {	

  public static void main (String args[]) throws IOException {
	 
	  
	  
	  /*
	   * Read number of players:
	   * playernN function from Readnames class returns number of players - input from user
	   */
	 int pnumbers=ReadNames.playerN();
	  	  
	 // create an array of Hero objects with the length of the playernumber
	 Hero[] heroes = new Hero[pnumbers];	 
	 
	  //Creates an array of string with hero types according to player number
	 String[] teamcomp = Units.unitComposition(pnumbers);
	
	 
	 //Creates an array of String with random names from a predefined list from txt file
	 String[] nameslist =  ReadNames.readFile(pnumbers); 

	 
	/*
	 * Populates the heroes array.
	 * input: list of names, composition of team (hertypes, number of players
	 * returns: heroes array with name, hero type, hp, armor, dmg 
	 */
	 heroes=BuildTeam.build(nameslist, teamcomp, pnumbers);
	
	
	 /*
	  * Prints the following:
	  * 1. Detailed composition of team: types and names (tanks: name 1, name 2... )
	  * 2. Hero stats for each player. (name, type, hp, dmg, armor, skill1, skill2... )
	  */
	 PrintTeam.print(heroes, pnumbers);
	
	/*
	 *Displays detailed hero stats for a player name read from input 
	 */
	 PrintTeam.printherostats(heroes, pnumbers);
	
	 
	//Prints skilldmg by name.skill
	 PrintTeam.printskilldmg(heroes, pnumbers);
	
	
	
		
  }
}