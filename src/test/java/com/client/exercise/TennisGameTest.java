package com.client.exercise;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TennisGameTest {

	private static final String ZERO_ZERO = "0 - 0";
	private static final String LOVE_ALL = "Love All";

	TennisGame game;

	@Before
	public void setUp() {
		game = new TennisGame();
	}

	@Test
	public void gamePointsShouldBeZeroZeroWhenGameBegins() {
		Assert.assertThat(game.getPoints(), CoreMatchers.is(ZERO_ZERO));
	}

	@Test
	public void scoreBoardShouldDisplayLoveAllWhenGamePointsZeroZero() {
		Assert.assertThat(game.getBoard().getResult(), CoreMatchers.is(LOVE_ALL));
	}
}
