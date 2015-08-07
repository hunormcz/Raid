import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

import heroes.*;

class PrintTeam {
	public static void print (Hero[] heroes, int pnumbers){
	
		//Print Detailed composition of team: types and names (tanks: name 1, name 2... )
		
		int isnew=0;
		System.out.println("The team composition is: ");
		
		for (int i=0; i<pnumbers; i++){
			if (isnew==0){
				System.out.println(heroes[i].type+"s: ");
				System.out.println(isnew+1+". "+heroes[i].name);
			}
			else{
				System.out.println(isnew+1+". "+heroes[i].name);
			}
			
			

			isnew++;
			if (i<pnumbers-1){
			if (heroes[i].type!=heroes[i+1].type){
				isnew=0;}
			}
		}
		
		
		
		//Print Hero stats for every player
	
		
		System.out.println();
		double totaldmg=0; 
		
		System.out.println("Hero stats: ");
				
		for (int i=0; i<pnumbers; i++){
			System.out.println(i+1+"."+heroes[i].name+" Type:"+heroes[i].type);
			System.out.println("hp: "+heroes[i].hp+" Armor:"+heroes[i].armor+" dmg:" +heroes[i].dmg);
			totaldmg=totaldmg+heroes[i].dmg;
			
			// print skillname and skill dmg
			System.out.println("Skill 1:"+Extract.skill1name(heroes[i])+" dmg: "+Extract.skill1dmg(heroes[i]));
			System.out.println("Skill 2:"+Extract.skill2name(heroes[i])+" dmg: "+Extract.skill2dmg(heroes[i]));
			
	
		}//for end
		
		System.out.println();
		//Print total team dmg
		System.out.println("Total Team Dmg: "+totaldmg);
		
	}
	
	
	
	/*
	 * Print hero stats for a single hero name read from console
	 */
		
	public static void printherostats(Hero[] heroes, int pnumbers) throws IOException{
			String input = null; 
			
			
			
			BufferedReader stdin = new BufferedReader ( new InputStreamReader( System.in ) );
			//read input
			System.out.println();
			System.out.println("Enter player name to display hero stats: 'x' to cancel");
			input = stdin.readLine();
			
			//exit if input = x
			if (input.equals("x")){
				System.out.println("Canceled by user!");	
			}
		else {
			//find player by name	  
			for (int i=0; i< pnumbers; i++){
				  if (heroes[i].name.equals(input)){
					System.out.println(i+1+"."+heroes[i].name+" Type:"+heroes[i].type);
					System.out.println("hp: "+heroes[i].hp+" Armor:"+heroes[i].armor+" dmg:" +heroes[i].dmg);
					
					
					// print skillname and skill dmg
					System.out.println("Skill 1:"+Extract.skill1name(heroes[i])+" dmg: "+Extract.skill1dmg(heroes[i]));
					System.out.println("Skill 2:"+Extract.skill2name(heroes[i])+" dmg: "+Extract.skill2dmg(heroes[i]));
					//exit loop
					i=pnumbers-1;
					  
				  }
			}
		}
		
			
			
	}
		
		

	/*
	 * Print skill dmg by name.skill
	 */
	public static void printskilldmg(Hero[] heroes, int pnumbers) throws IOException{
		String input = null; 
		String name=null;
		String skill=null;
		double dmg=0;
		BufferedReader stdin = new BufferedReader ( new InputStreamReader( System.in ) );
		Boolean valid=false;
	
		//read input
		System.out.println();
		System.out.println("Enter Name and Skill for details: (name.skill), 'x' to cancel");
		input = stdin.readLine();
		
		//exit if input = x
		if (input.equals("x")){valid=true;
		System.out.println("Canceled by user!");}
		
		/*
		 * Validate input: 
		 * Repeat until input is in correct format or "x" to cancel 
		 */
		
		while (!valid)
		{
				//split string to name and skillname
				if (input != null && !input.isEmpty()){
					  
					String[] parts = input.split(Pattern.quote("."));
					name = parts[0];
					try {
					skill = parts[1];
					} catch (Exception e) {
						// TODO: handle exception
					} 
					  
					//find player by name	  
					for (int i=0; i< pnumbers; i++){
						  if (heroes[i].name.equals(name)){
							  valid=true;  
							
							/*
							 * check if skillname is skill1 or skill2
							 * get skilldmg for correct skill  
							 */
							if (Extract.skill1name(heroes[i]).equals(skill)){
							dmg= Extract.skill1dmg(heroes[i]);
							}
							 
							else if (Extract.skill2name(heroes[i]).equals(skill)){
							dmg= Extract.skill2dmg(heroes[i]);
							}
						  
						  }
					  }
						  
				}
			
			//error message for invalid input
			if (!valid) 
			{
			System.out.println("Invalid input! Please enter name and skill in the following format: playername.skillname ");
			input = stdin.readLine();
			}
			
			// Print skillname and Damage
			else{System.out.println(name+"-Skill "+skill+" Damage: "+dmg);}
		}
		
	}	
	
}
