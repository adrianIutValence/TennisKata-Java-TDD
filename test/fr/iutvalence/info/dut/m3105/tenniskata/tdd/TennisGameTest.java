package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TennisGameTest
{
	
	public static final String LOVE_ALL = "love-all";
	public static final String FIFTEEN_LOVE = "fifteen-love";	
	public static final String LOVE_FIFTEEN = "love-fifteen";
	public static final String FIFTEEN_ALL = "fifteen-all";
	
	private TennisGame theTennisGameUnderTestRightNow;

	@Before
	public void newTennisGame(){
		this.theTennisGameUnderTestRightNow = new TennisGame();
	}
	
	@Test
	public void weAreMakingSureThatAGameThatJustBegunReturnAScoreEqualsToTheSusdescribedStringLoveAll(){
		Assert.assertEquals(this.theTennisGameUnderTestRightNow.getScore(), TennisGameTest.LOVE_ALL);
	}
	
	@Test
	public void weChangeTheScoreIfThePlayerThatServedWonAPointReturnEqualsToTheSusdescribedStringFifteenLove(){
		this.theTennisGameUnderTestRightNow.serverScores();
		Assert.assertEquals(this.theTennisGameUnderTestRightNow.getScore(), TennisGameTest.FIFTEEN_LOVE);
	}
	
	@Test
	public void weChangeTheScoreIfThePlayerThatReceivedWonAPointReturnEqualsToTheSusdescribedStringFifteenLove(){
		this.theTennisGameUnderTestRightNow.receiverScores();
		Assert.assertEquals(this.theTennisGameUnderTestRightNow.getScore(), TennisGameTest.LOVE_FIFTEEN);
	}
	
	@Test
	public void aGameWithTheScoreFifteenToFifteenMustHaveAScoreEqualsToTheStringFeefteenAll(){
		this.theTennisGameUnderTestRightNow.receiverScores();
		this.theTennisGameUnderTestRightNow.serverScores();
		Assert.assertEquals(this.theTennisGameUnderTestRightNow.getScore(), TennisGameTest.FIFTEEN_ALL);
	}
}
