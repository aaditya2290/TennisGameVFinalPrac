package com.client.exercise;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class ScoreBoardTest {

	private static final String FIFTEEN_LOVE = "Fifteen Love";
	private static final String LOVE_ALL = "Love All";

	@Test
	public void scoreBoardResultShouldBeLoveAllIfBothPlayersPointsAreZero() {
		ScoreBoard scoreBoard = new ScoreBoard(0,0);
		
		assertThat(scoreBoard.getResult(), CoreMatchers.is(LOVE_ALL));
	}
	
	@Test
	public void scoreBoardResultShouldBeFifteenLoveIfFirstPlayerPointsIsOne(){
		ScoreBoard scoreBoard = new ScoreBoard(1, 0);
		assertThat(scoreBoard.getResult(), CoreMatchers.is(FIFTEEN_LOVE));
	}

}
