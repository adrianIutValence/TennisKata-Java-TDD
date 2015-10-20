package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{
	@Test
	public void weAreMakingSureThatAGameThatJustBegunReturnAScoreEqualsToTheSusdescribedStringLoveAll(){
		TennisGame theTennisGameUnderTestRightNow = new TennisGame();
		Assert.assertEquals(theTennisGameUnderTestRightNow.getScore(), "love-all");
		
	}
	
	@Test
	public void weChangeTheScoreIfThePlayerThatServedWonAPointReturnEqualsToTheSusdescribedStringFifteenLove(){
		TennisGame theTennisGameUnderTestRightNow = new TennisGame();
		theTennisGameUnderTestRightNow.serverScores();
		Assert.assertEquals(theTennisGameUnderTestRightNow.getScore(), "fifteen-love");
	}
}
