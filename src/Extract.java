import java.util.regex.Pattern;

import heroes.*;

public class Extract{
	
	public static String skill1name(Hero hero){
		String skillname=null;
		String classname=null;
		String classtype=null;
		
		String[] parts = hero.getClass().getName().split(Pattern.quote("."));
		classname = parts[0];
		try {
		classtype = parts[1];
		} catch (Exception e) {
			// TODO: handle exception
		} 
		switch (classtype){
		case "Assasin":
			skillname=Assasin.skill1;
			break;
		case "Mage":
			skillname=Mage.skill1;
			break;	
		case "Marauder":
			skillname=Marauder.skill1;
			break;		
		case "Ranger":
			skillname=Ranger.skill1;
			break;	
		case "Warlock":
			skillname=Warlock.skill1;
			break;	
		case "Warrior":
			skillname=Warrior.skill1;
			break;		
		}
		
		
		return(skillname);
		
	}
	public static String skill2name(Hero hero){
		String skillname=null;
		String classname=null;
		String classtype=null;
		
		String[] parts = hero.getClass().getName().split(Pattern.quote("."));
		classname = parts[0];
		try {
		classtype = parts[1];
		} catch (Exception e) {
			// TODO: handle exception
		} 
		switch (classtype){
		case "Assasin":
			skillname=Assasin.skill2;
			break;
		case "Mage":
			skillname=Mage.skill2;
			break;	
		case "Marauder":
			skillname=Marauder.skill2;
			break;		
		case "Ranger":
			skillname=Ranger.skill2;
			break;	
		case "Warlock":
			skillname=Warlock.skill2;
			break;	
		case "Warrior":
			skillname=Warrior.skill2;
			break;		
		}
		
		return(skillname);
		
	}
	public static double skill1dmg(Hero hero){
		double skilldmg=0;
		String classname=null;
		String classtype=null;
		
		String[] parts = hero.getClass().getName().split(Pattern.quote("."));
		classname = parts[0];
		try {
		classtype = parts[1];
		} catch (Exception e) {
			// TODO: handle exception
		} 
		switch (classtype){
		case "Assasin":
			skilldmg=Assasin.skill1dmg(hero.dmg);
			break;
		case "Mage":
			skilldmg=Mage.skill1dmg(hero.dmg);
			break;	
		case "Marauder":
			skilldmg=Marauder.skill1dmg(hero.dmg);
			break;		
		case "Ranger":
			skilldmg=Ranger.skill1dmg(hero.dmg);
			break;	
		case "Warlock":
			skilldmg=Warlock.skill1dmg(hero.dmg);
			break;	
		case "Warrior":
			skilldmg=Warrior.skill1dmg(hero.dmg);
			break;	
		}
		return(skilldmg);
		
	}
	
	public static double skill2dmg(Hero hero){
		double skilldmg=0;
		String classname=null;
		String classtype=null;
		
		String[] parts = hero.getClass().getName().split(Pattern.quote("."));
		classname = parts[0];
		try {
		classtype = parts[1];
		} catch (Exception e) {
			// TODO: handle exception
		} 
		switch (classtype){
		case "Assasin":
			skilldmg=Assasin.skill2dmg(hero.dmg);
			break;
		case "Mage":
			skilldmg=Mage.skill2dmg(hero.dmg);
			break;	
		case "Marauder":
			skilldmg=Marauder.skill2dmg(hero.dmg);
			break;		
		case "Ranger":
			skilldmg=Ranger.skill2dmg(hero.dmg);
			break;	
		case "Warlock":
			skilldmg=Warlock.skill2dmg(hero.dmg);
			break;	
		case "Warrior":
			skilldmg=Warrior.skill2dmg(hero.dmg);
			break;	
		}
		return(skilldmg);
		
	}
	
}