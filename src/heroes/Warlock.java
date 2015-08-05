package heroes;
public class Warlock extends Hero{
	
	public static String skill1 = "Apocalypse";
	public static String skill2 = "Range";	
	
	public Warlock() {
	dmg = 45;	
	hp = 450;
	type = "healer";
	armor = 1;
	
	
	}
	public static double skill1dmg(double dmg){
		double  x=dmg*3;
		return(x);
	}
	public static  double skill2dmg(double dmg){
		double  x=dmg+2;
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

	


