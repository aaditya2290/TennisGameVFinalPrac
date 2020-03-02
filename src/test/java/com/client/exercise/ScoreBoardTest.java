package com.client.exercise;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class ScoreBoardTest {

	private static final String THIRTY_ALL = "Thirty All";
	private static final String THIRTY_FORTY = "Thirty Forty";
	private static final String FIFTEEN_LOVE = "Fifteen Love";
	private static final String LOVE_ALL = "Love All";

	@Test
	public void scoreBoardResultShouldBeLoveAllIfBothPlayersPointsAreZero() {
		ScoreBoard scoreBoard = new ScoreBoard(0, 0);

		assertThat(scoreBoard.getResult(), CoreMatchers.is(LOVE_ALL));
	}

	@Test
	public void scoreBoardResultShouldBeFifteenLoveIfFirstPlayerPointsIsOne() {
		ScoreBoard scoreBoard = new ScoreBoard(1, 0);

		assertThat(scoreBoard.getResult(), CoreMatchers.is(FIFTEEN_LOVE));
	}

	@Test
	public void scoreBoardResultShouldBeThirtyFortyIfFirstPlayerPointsIsTwoSecondPlayerPointsIsThree() {
		ScoreBoard scoreBoard = new ScoreBoard(2, 3);

		assertThat(scoreBoard.getResult(), CoreMatchers.is(THIRTY_FORTY));
	}

	@Test
	public void scoreBoardResultShouldBeThirtyAllIfBothPlayersPointsAreTwo() {
		ScoreBoard scoreBoard = new ScoreBoard(2, 2);

		assertThat(scoreBoard.getResult(), CoreMatchers.is(THIRTY_ALL));
	}

}
