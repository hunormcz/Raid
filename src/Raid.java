import heroes.*;
import java.io.*;



class Raid {	

  public static void main (String args[]) throws IOException {
	 BufferedReader stdin = new BufferedReader ( new InputStreamReader( System.in ) );
	 // read number of players
	 int pnumbers=ReadNames.playerN();
	  	  
	 // build team composition
	 Units unit = new Units();
	 PrintTeam team = new PrintTeam();
	 String[] teamcomp = unit.unitComposition(pnumbers);
	 
	 String[] nameslist =  ReadNames.readFile(pnumbers); 

	 
	 //build team array and assign names
	 Hero[] heroes = new Hero[pnumbers];
	 
	 //ArrayList<Hero> heroes = new ArrayList<Hero>();
	 heroes=BuildTeam.build(nameslist, teamcomp, pnumbers);
	
	//print team
	team.print(heroes, pnumbers);
	
	//print hero stats by name
	team.printherostats(heroes, pnumbers);
	
	//print skilldmg by name.skill
	team.printskilldmg(heroes, pnumbers);
	
	
	
		
  }
}