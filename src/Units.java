

public class Units {

	//define unit types (# of tank/healer/dps)
	public static String[] unitComposition (int players){
		String[] playerComposition;
		playerComposition = new String[players+1];
		
		// # of tanks required
		
		int tanks;
		if (players <= 5) 
				{tanks = 1;
				}
		else 
		{
			tanks = 2;
		}
		
		//Populate string with Tanks
		for (int i=0; i < tanks; i++)
		{
			playerComposition[i]="Tank";
		}
		
		//# of healers required
		int healers = players / 5;
		for (int i=tanks; i < tanks+healers; i++)
		{
			playerComposition[i]="Healer";
		}
		
		
		//# of dps required
		for (int i=healers+tanks; i < players; i++)
		{
			playerComposition[i]="DPS";
		}
		
		return playerComposition;
			
		
	}

}