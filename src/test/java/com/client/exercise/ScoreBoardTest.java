package com.client.exercise;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class ScoreBoardTest {

	private static final String LOVE_ALL = "Love All";

	@Test
	public void scoreBoardResultShouldBeLoveAllIfBothPlayersPointsAreZero() {
		ScoreBoard scoreBoard = new ScoreBoard(0,0);
		assertThat(scoreBoard.getResult(), CoreMatchers.is(LOVE_ALL));

	}

}
