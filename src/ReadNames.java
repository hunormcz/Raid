import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;





public class ReadNames {

	/*
	 * read number of players from console
	 */
	public static int playerN() throws IOException
	{
		
		  String input = null; 
		  BufferedReader stdin = new BufferedReader ( new InputStreamReader( System.in ) );
		  int pnumbers=31;
		  boolean valid = false;
		  
		  //validate player input to be integer and divisible by 5 and smaller than 31
		  
		  while ((pnumbers%5!=0)||(!valid)){
			  System.out.println("How many players per team?");
			  input = stdin.readLine();
			  
			  try {
				  pnumbers = Integer.parseInt(input);
				  if ((pnumbers%5 == 0)&&(pnumbers<=30)) valid = true;
			    } catch (NumberFormatException e) {
			        //error
			       
			    }
			  if ((pnumbers%5 != 0)||(!valid)) 
			  {
			  System.out.println("Invalid player number! Player number must be one of the following values: 5, 10, 15, 20, 25, 30 ");	
			  }
		  
		  
		  }
		return pnumbers;
		  
	}
	
	/*
	 * Read names from txt file
	 */
	public static String[] readFile (int players) throws FileNotFoundException
	{
		String[] names;
		String[] namesRandom;
		names = new String[31];
		namesRandom = new String[players];
		
		// Read all names from file to names
		String filePath = new File("").getAbsolutePath();
		Scanner inFile1 = new Scanner(new File(filePath+"/src/names.txt"));
		int i=0;
		
		   while (inFile1.hasNext()) {

			      names[i] = inFile1.next();
			      i++;   
			    }
			    inFile1.close();
			    
		// Randomize names to array for number of players
		Random rnd = new Random();
		int r = rnd.nextInt(players-1);
		
		for (i=0; i<players; i++){
			r = rnd.nextInt(30-i);
			
			namesRandom[i]=names[r];
			
			names[r]=names[30-i];
					
		}	
	
		
		return(namesRandom);	    
	}
	
	
	// NOT USED - assign custom name for a player
	public static String[] customname(String[] players) throws IOException
	{
		String [] newnames; 
		newnames = new String[31];
		newnames=players;
		String input = null;
		String number = null;
		String name = null;
		Boolean valid=false;
		BufferedReader stdin = new BufferedReader ( new InputStreamReader( System.in ) );
		
		input="y";
				while (!valid&&!input.equals("n"))
				{
					System.out.println("Enter player number and name: (number.name)");
					input=stdin.readLine();
					//	split string
					if (input != null && !input.isEmpty()){
			
						
			
						String[] parts = input.split(Pattern.quote("."));
						number = parts[0];
						try {
						name = parts[1];
						} catch (Exception e) {
				
			
				
						// 	TODO: handle exception
						}
						int n=Integer.parseInt(number);
						players[n-1]=name;
						valid=true;
					}
					
					
					//error message invalid input
					if (!valid) 
					{
					System.out.println("Invalid input! Please enter number and name in the following format: palyernumber.playername ");	
					}
							  
		}	 	
		return(newnames);
		
	}
	
	
	
		
		
}
	

	