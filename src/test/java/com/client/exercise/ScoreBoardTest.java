package com.client.exercise;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

public class ScoreBoardTest {

	private static final String THIRTY_ALL = "Thirty All";
	private static final String THIRTY_FORTY = "Thirty Forty";
	private static final String FIFTEEN_LOVE = "Fifteen Love";
	private static final String LOVE_ALL = "Love All";

	private Player firstPlayer;
	private Player secondPlayer;
	private ScoreBoard scoreBoard;

	@Before
	public void setUp() {
		firstPlayer = new Player();
		secondPlayer = new Player();
		scoreBoard = new ScoreBoard(firstPlayer, secondPlayer);
	}

	@Test
	public void scoreBoardResultShouldBeLoveAllIfBothPlayersPointsAreZero() {

		assertThat(scoreBoard.getResult(), CoreMatchers.is(LOVE_ALL));
	}

	@Test
	public void scoreBoardResultShouldBeFifteenLoveIfFirstPlayerPointsIsOne() {

		firstPlayer.setPoints(1);

		assertThat(scoreBoard.getResult(), CoreMatchers.is(FIFTEEN_LOVE));
	}

	@Test
	public void scoreBoardResultShouldBeThirtyFortyIfFirstPlayerPointsIsTwoSecondPlayerPointsIsThree() {

		firstPlayer.setPoints(2);
		secondPlayer.setPoints(3);

		assertThat(scoreBoard.getResult(), CoreMatchers.is(THIRTY_FORTY));
	}

	@Test
	public void scoreBoardResultShouldBeThirtyAllIfBothPlayersPointsAreTwo() {

		firstPlayer.setPoints(2);
		secondPlayer.setPoints(2);

		assertThat(scoreBoard.getResult(), CoreMatchers.is(THIRTY_ALL));
	}

}
