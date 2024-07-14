//This is our NonPlayer Character that inherits
// from GameCharacter it represent objects the game controls 
// (as opposed to objects a human player controls).
// @author - Megan Cole
// @version 1.3
// Lab1
// CS131ON
//

import java.util.Random;

public class NonPlayerCharacter extends GameCharacter{ //(1) NonPlayerCharacter inherits from parent class GameCharacter
	
	private boolean active;
	private String intelligenceType;
	
	//public String reportStructure;
	//public String introduce;
	//public String exclaim;
	
	public NonPlayerCharacter() { //(3)
		super();
		intelligenceType = "AVERAGE";
		active = false;
		
	} //end empty argument constructor
	
	public NonPlayerCharacter(String id, String personality, boolean actice, String intelligenceType) { //(4)
		super();
		setActive(active);
		setIntelligenceType(intelligenceType);
		
	} //end preferred constructor
	
	//Getters and Setters //(2)

	public boolean isActive() {
		return active;
	} //end isActive

	public void setActive(boolean active) {
		this.active = active;
	} //end setActive

	public String getIntelligenceType() {
		return intelligenceType;
	} //end getIntelligenceType

	public void setIntelligenceType(String intelligenceType) {
		this.intelligenceType = intelligenceType;
	} //end setIntelligenceType

	public String reportStructure() { //(5)
	
		StringBuilder sb = new StringBuilder("==================================\n");
		sb.append("UniqueID: "+getUniqueID()+"\n");
		sb.append("Personality: "+getPersonality()+"\n");
		sb.append("==================================\n");
		sb.append("Active: "+ isActive()+ "\n");
		sb.append("Intelligence: " + getIntelligenceType() + "\n");
		sb.append("==================================\n");
	
		return sb.toString();
		
	} //end reportStructure

	public String introduce() { //(6)
		return "Hello, my name is " + getUniqueID();
	} //end introduce
	
	public static String exclaim() { //(7)
		String[] exclaim = {"Dag Gummit", "Doggone it",  "Holy cow", "Jeez",  "Well cheese and crackers"};//(7)
		Random r = new Random();
		int index = r.nextInt(exclaim.length);
		return exclaim[index];
			
	}//end exclaim

}//end class

