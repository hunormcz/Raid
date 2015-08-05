import java.util.Random;

import heroes.*;
public class BuildTeam{
	
	
	//populate heroes array
	public static Hero[] build(String[] names, String[] team, int pnumbers){
		Random rnd = new Random();
		Hero[] heroes = new Hero[pnumbers];
		int r = rnd.nextInt(100);
		for (int i=0; i<pnumbers; i++){
			r = rnd.nextInt(100);
			
			switch (team[i]){
			case "Tank":
				if ((i+1)%2==0){
					Warrior warrior = new Warrior();
					warrior.name=names[i];
					heroes[i]=warrior;
					}
				else{
					Marauder marauder = new Marauder();
					marauder.name=names[i];
					heroes[i]=marauder;
					}
				break;
			case "Healer":
				if ((i+1)%2==0){
					Mage mage = new Mage();
					mage.name=names[i];
					heroes[i]=mage;
					}
				else{
					Warlock warlock = new Warlock();
					warlock.name=names[i];
					heroes[i]=warlock;
					}	
				break;
			case "DPS":
				if (r%2==0){
					Assasin assasin = new Assasin();
					assasin.name=names[i];
					heroes[i]=assasin;
					}
				else{
					Ranger ranger = new Ranger();
					ranger.name=names[i];
					heroes[i]=ranger;
					}
				break;
				
			}
			
		}
		return(heroes);	
		
		
		
	}
	
	
}
//1. Warrior
//tank
//2. Marauder
//tank
//3. Mage
//healer
//4. Warlock
//healer
//5. Assasin
//dps
//6. Ranger
//dps