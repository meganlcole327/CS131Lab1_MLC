
public abstract class SportsTeam { //(1)
	
	protected String teamName;
	protected String teamMascot;
	protected String headCoach;
	protected int wins;
	protected int loses;
	double getWinPercentage;
	double getStats;
	
	public void Team() { //(2)
		this.teamName = " ";
		this.teamMascot = " ";
		headCoach = " ";
		this.wins = 0;
		this.loses = 0;
		this.getWinPercentage = 0.0;
		this.getStats = 0.0;
		
	} //end empty-argument constructor
	
	public void Team(String teamName, String teamMascot, String headCoach) { //(3)
		this.teamName = teamName; 
		this.teamMascot = teamMascot;
		this.headCoach = headCoach;
		this.wins = 0; 
		this.loses = 0;
		this.getWinPercentage = 0.0;
		this.getStats = 0.0;
	} //end preferred constructor 

	//Getters and Setters

	public String getTeamName() {
		return teamName;
	} //end getTeamName

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	} //end setTeamName

	public String getTeamMascot() {
		return teamMascot;
	} //end getTeamMascot

	public void setTeamMascot(String teamMascot) {
		this.teamMascot = teamMascot;
	} //end setTeamMascot

	public String getHeadCoach() {
		return headCoach;
	} //end getHeadCoach

	public void setHeadCoach(String headCoach) {
		this.headCoach = headCoach;
	} //end setHeadCoach

	public int getWins() {
		return wins;
	} //end getWins

	public void setWins(int wins) {
		this.wins = wins;
	} //end setWins

	public int getLoses() {
		return loses;
	} //end getLoses

	public void setLoses(int loses) {
		this.loses = loses;
	} //end setLoses

	public double getGetWinPercentage() { //(4)
		return wins/(wins+loses);
	} //end getGetWinPercentage

	public void setGetWinPercentage(double getWinPercentage) {
		this.getWinPercentage = getWinPercentage;
	} //end setGetWinPercentage

	

} //end class

