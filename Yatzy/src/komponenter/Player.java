package komponenter;

public class Player {

	private String playerName;
	private Dice[] ownDice;
	private int score;
	
	public Player() {
		
	}
	public Player(String playerName, Dice [] ownDice, int score) {
		this.playerName = playerName;
		this.ownDice = ownDice;
		this.score = score;
	}
	
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public Dice[]  getOwnDice() {
		return ownDice;
	}
	public void setOwnDice(Dice[] ownDice) {
		this.ownDice = ownDice;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}
