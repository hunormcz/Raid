

public class Units {

	//define unit types (# of tank/healer/dps)
	public String[] unitComposition (int players){
		String[] playerComposition;
		playerComposition = new String[players+1];
		
		//tanks
		int tanks;
		if (players <= 5) 
				{tanks = 1;
				}
		else 
		{
			tanks = 2;
		}
		
		for (int i=0; i < tanks; i++)
		{
			playerComposition[i]="Tank";
		}
		//healers
		int healers = players / 5;
		for (int i=healers; i < tanks+healers; i++)
		{
			playerComposition[i]="Healer";
		}
		
		
		//dps
		int dps = players - (tanks+healers);
		for (int i=healers+tanks; i < players; i++)
		{
			playerComposition[i]="DPS";
		}
		
		return playerComposition;
			
		
	}

}