package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{

	private static final String FIFTEEN_LOVE = "fifteen-love";
	private static final String LOVE_ALL = "love-all";
	
	private String score;
	
	

	public TennisGame() {
		this.score = LOVE_ALL;
	}

	public String getScore() {
		return this.score;
	}

	public void serverScores() {
		this.score = FIFTEEN_LOVE;
	}


	
}
