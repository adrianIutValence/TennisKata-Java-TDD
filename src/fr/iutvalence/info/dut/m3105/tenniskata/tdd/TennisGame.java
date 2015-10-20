package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{
	public static final String[] SCORES = {"love", "fifteen"};

	private int serverScore;
	private int receiverScore;
	
	
	public TennisGame() {
		this.serverScore = 0;
		this.receiverScore = 0;
	}

	public String getScore() {
		return this.formatScore(this.serverScore, this.receiverScore);
	}

	public void serverScores() {
		this.serverScore += 1;
	}

	public void receiverScores() {
		this.receiverScore += 1;		
	}

	private static String formatScore(int serverScore, int receiverScore) {
		if(SCORES[serverScore] == SCORES[receiverScore])
			return SCORES[serverScore] + "-all";
		return SCORES[serverScore] + "-" + SCORES[receiverScore];
	}

	
}
