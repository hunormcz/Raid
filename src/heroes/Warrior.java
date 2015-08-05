package heroes;
public class Warrior extends Hero{
	public static String skill1 = "Stomp";
	public static String skill2 = "Bash";
		
	public Warrior() {
	dmg = 57;	
	hp = 700;
	type = "tank";
	armor = 5;
	
	
	}
	public static double skill1dmg(double dmg){
		double  x=dmg+10;
		return(x);
	}
	public static double skill2dmg(double dmg){
		double  x=dmg+20;
		return(x);
	}


}


//1. Warrior
//tank
//
//2. Marauder
//tank
//
//3. Mage
//healer
//
//4. Warlock
//healer
//
//5. Assasin
//dps
//
//6. Ranger
//dps

	


