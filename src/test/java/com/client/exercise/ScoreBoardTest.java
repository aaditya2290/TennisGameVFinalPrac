package com.client.exercise;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class ScoreBoardTest {

	@Test
	public void scoreBoardResultShouldBeLoveAllIfBothPlayersPointsAreZero() {
		ScoreBoard scoreBoard = new ScoreBoard(0,0);
		assertThat(scoreBoard.getResult(), CoreMatchers.is("Love All"));

	}

}
