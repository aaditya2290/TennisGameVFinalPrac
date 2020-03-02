package com.client.exercise;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest {

	@Test
	public void gamePointsShouldBeZeroZeroWhenGameBegins() {
		TennisGame game = new TennisGame();

		Assert.assertThat(game.getPoints(), CoreMatchers.is("0 - 0"));
	}
}
