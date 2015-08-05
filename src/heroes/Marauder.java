package heroes;
public class Marauder extends Hero{
	
	public static String skill1 = "Bash";
	public static String skill2 = "Electrify";
	public Marauder() {
	dmg = 57;	
	hp = 650;
	type = "tank";
	armor = 4;
	
	
	
	}
	public static double skill1dmg(double dmg){
		double  x=dmg*1.30;
		return(x);
	}
	public static double skill2dmg(double dmg){
		double  x=dmg+2;
		return(x);
	}


}