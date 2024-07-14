
public class BasketballTeam extends SportsTeam{
	
	private int fieldGoals;
	private int fieldGoalsAttempted;
	private int freeThrows;
	private int freeThrowsAttempted;
	
	public double fieldGoalPercentage;
	public double freeThrowPercentage;
	
	public BasketballTeam() { //(1)
		super();
		this.fieldGoals = 0;
		this.fieldGoalsAttempted = 0;
		this.freeThrows = 0;
		this.freeThrowsAttempted = 0;
	} //end empty-argument constructor
	
	
	public BasketballTeam(String teamName, String teamMascot, String headCoach) { //(2)
		super();
		this.fieldGoals = 0;
		this.fieldGoalsAttempted = 0;
		this.freeThrows = 0;
		this.freeThrowsAttempted = 0;
		
	} //end preferred constructor
	
	//getters and setters

	public double getFieldGoalPercentage() {
		return fieldGoalPercentage;
	} //end getFieldGoalPercentage

	public void setFieldGoalPercentage(double fieldGoalPercentage) {
		this.fieldGoalPercentage = fieldGoalPercentage;
	} //end setFieldGoalPercentage

	public double getFreeThrowPercentage() {
		return freeThrowPercentage;
	} //end getFreeThrowPercentage

	public void setFreeThrowPercentage(double freeThrowPercentage) {
		this.freeThrowPercentage = freeThrowPercentage;
	} //end setFreeThrowPercentage

	public int getFieldGoals() {
		return fieldGoals;
	} //end getFieldGoals

	public void setFieldGoals(int fieldGoals) {
		this.fieldGoals = fieldGoals;
	} //end setFieldGoals

	public int getFieldGoalsAttempted() {
		return fieldGoalsAttempted;
	} //end getFieldGoalsAttempted

	public void setFieldGoalsAttempted(int fieldGoalsAttempted) {
		this.fieldGoalsAttempted = fieldGoalsAttempted;
	} //end setFieldGoalsAttempted

	public int getFreeThrows() {
		return freeThrows;
	} //end getFreeThrows

	public void setFreeThrows(int freeThrows) {
		this.freeThrows = freeThrows;
	} //end setFreeThrows

	public int getFreeThrowsAttempted() {
		return freeThrowsAttempted;
	} //end getFreeThrowsAttempted

	//Questions 3-5
	
	public double fieldGoalPercentage() { //(3)
		return fieldGoals / fieldGoalsAttempted;
	} //end fieldGoalPercentage
	
	public double freeThrowPrecentage() { //(4)
		return freeThrows/freeThrowsAttempted;
	} //end freeThrowPrecentage
	
	public void setStats(int wins, int losses, int fieldGoalsAttempted, int freeThrows, int freeThrowsAttempted) {
		
	} //end setStats
	
	public String getStats() { //(5) 
		//would this be a String or double??
		return "Win percentage: " + getWinPercentage + "Field goal percentage: " + fieldGoalPercentage + "Free throw percentage: " + freeThrowPercentage;
	} //end getStats
	

} //end class

