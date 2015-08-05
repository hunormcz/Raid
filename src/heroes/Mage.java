package heroes;
public class Mage extends Hero{
	
	public static String skill1 = "Holy Fire";
	public static String skill2 = "Persuasion";
	public Mage() {
	dmg = 50;	
	hp = 500;
	type = "healer";
	armor = 2;
	
	
	}
	public static double skill1dmg(double dmg){
		double  x=dmg*1.25;
		return(x);
	}
	public static double skill2dmg(double dmg){
		double  x=dmg+10;
		return(x);
	}

}

	


