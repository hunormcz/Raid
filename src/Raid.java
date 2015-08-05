import heroes.*;
import java.io.*;



class Raid {	

  public static void main (String args[]) throws IOException {
	 
	 // read number of players
	 int pnumbers=ReadNames.playerN();
	  	  
	 // build team composition
	 String[] teamcomp = Units.unitComposition(pnumbers);
	
	 // build team names from file
	 String[] nameslist =  ReadNames.readFile(pnumbers); 

	 
	 //build team array and assign names
	 Hero[] heroes = new Hero[pnumbers];
	 
	 //ArrayList<Hero> heroes = new ArrayList<Hero>();
	 heroes=BuildTeam.build(nameslist, teamcomp, pnumbers);
	
	//print team
	 PrintTeam.print(heroes, pnumbers);
	
	//print hero stats by name
	 PrintTeam.printherostats(heroes, pnumbers);
	
	//print skilldmg by name.skill
	 PrintTeam.printskilldmg(heroes, pnumbers);
	
	
	
		
  }
}