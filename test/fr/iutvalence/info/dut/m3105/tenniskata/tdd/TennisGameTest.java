package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TennisGameTest
{	
	//TODO move all that in an enumeration
	public static final int[][] SCORES = {{0,0},
		{0,1},
		{0,2},
		{0,3},
		{1,0},
		{1,1},
		{1,2},
		{1,3},
		{2,0},
		{2,1},
		{2,2},
		{2,3},
		{3,0},
		{3,1},
		{3,2}};
	
	public static final String[] SCORES_STRING = {"love-all",
		"love-fifteen",
		"love-thirty",
		"love-forty",
		"fifteen-love",
		"fifteen-all",
		"fifteen-thirty",
		"fifteen-forty",
		"thirty-love",
		"thirty-fifteen",
		"thirty-all",
		"thirty-forty",
		"forty-love",
		"forty-fifteen",
		"forty-thirsty"};
	
	private TennisGame theTennisGameUnderTestRightNow;

	@Before
	public void newTennisGame(){
		this.theTennisGameUnderTestRightNow = new TennisGame();
	}
	
	
	@Test
	public void allScoresBellowThreeToThreeShouldWorks(){
		for (int[] score : SCORES) {
			//TODO
		}
	}
}
