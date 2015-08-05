package heroes;

public class Ranger extends Hero{
	
	public static String skill1 = "Sear";
	public static String skill2 = "Wave";
	public Ranger() {
	dmg = 65;	
	hp = 400;
	type = "dps";
	armor = 10;
	
	
	}
	public static double skill1dmg(double dmg){
		double  x=dmg*1.25;
		return(x);
	}
	public static double skill2dmg(double dmg){
		double  x=dmg+100;
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

	


