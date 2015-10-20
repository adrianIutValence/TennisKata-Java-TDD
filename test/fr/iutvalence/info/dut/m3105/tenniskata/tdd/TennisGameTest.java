package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TennisGameTest
{
	
	
	private TennisGame theTennisGameUnderTestRightNow;

	@Before
	public void newTennisGame(){
		this.theTennisGameUnderTestRightNow = new TennisGame();
	}
	
	@Test
	public void weAreMakingSureThatAGameThatJustBegunReturnAScoreEqualsToTheSusdescribedStringLoveAll(){
		Assert.assertEquals(this.theTennisGameUnderTestRightNow.getScore(), TennisGame.LOVE_ALL);
	}
	
	@Test
	public void weChangeTheScoreIfThePlayerThatServedWonAPointReturnEqualsToTheSusdescribedStringFifteenLove(){
		this.theTennisGameUnderTestRightNow.serverScores();
		Assert.assertEquals(this.theTennisGameUnderTestRightNow.getScore(), TennisGame.FIFTEEN_LOVE);
	}
	
	@Test
	public void weChangeTheScoreIfThePlayerThatReceivedWonAPointReturnEqualsToTheSusdescribedStringFifteenLove(){
		this.theTennisGameUnderTestRightNow.receiverScores();
		Assert.assertEquals(this.theTennisGameUnderTestRightNow.getScore(), TennisGame.FIFTEEN_LOVE);
	}
}
