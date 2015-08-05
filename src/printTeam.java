import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

import heroes.*;

class PrintTeam {
	public void print (Hero[] heroes, int pnumbers){
	
		//Team composition
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
		
		
		
		//Hero stats
		System.out.println();
		String input;
		String classname;
		String classtype=null;
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
		System.out.println("Total Team Dmg: "+totaldmg);
		
	}
	
	
	
	//Print hero stats for hero name
		public void printherostats(Hero[] heroes, int pnumbers) throws IOException{
			String input = null; 
			String name=null;
			
			
			BufferedReader stdin = new BufferedReader ( new InputStreamReader( System.in ) );
			Boolean valid=false;
			String classname=null;
			String classtype=null;
			//read input
			System.out.println("Enter player name to display hero stats: 'x' to cancel");
		
			//validate input
			input = stdin.readLine();
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
		
		
		
		
	//Print skill dmg by name.skill
	public void printskilldmg(Hero[] heroes, int pnumbers) throws IOException{
		String input = null; 
		String name=null;
		String skill=null;
		double dmg=0;
		BufferedReader stdin = new BufferedReader ( new InputStreamReader( System.in ) );
		Boolean valid=false;
		String classname=null;
		String classtype=null;
		//read input
		System.out.println("Enter Name and Skill for details: (name.skill), 'x' to cancel");
	
		//validate input
		input = stdin.readLine();
		if (input.equals("x")){valid=true;
		System.out.println("Canceled by user!");}
		while (!valid)
		{
				//split string
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
							if (Extract.skill1name(heroes[i]).equals(skill)){
							dmg= Extract.skill1dmg(heroes[i]);
							}
							 
							else if (Extract.skill2name(heroes[i]).equals(skill)){
							dmg= Extract.skill2dmg(heroes[i]);
							}
						  
						  }
					  }
						  
				}
			
			//error message invalid input
			if (!valid) 
			{
			System.out.println("Invalid input! Please enter name and skill in the following format: playername.skillname ");
			input = stdin.readLine();
			}
			else{System.out.println(name+"-Skill "+skill+" Damage: "+dmg);}
		}
		
	}	
	
}
