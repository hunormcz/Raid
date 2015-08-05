package heroes;

public class Assasin extends Hero{
	
	public static String skill1 = "Splash";
	public static String skill2 = "Dagger";
	public Assasin() {
	dmg = 60;	
	hp = 570;
	type = "dps";
	armor = 6;
	
	
	}
	public static double skill1dmg(double dmg){
		double x=dmg*1.30;
		return(x);
	}
	public static double skill2dmg(double dmg){
		double  x=dmg+50;
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

	


