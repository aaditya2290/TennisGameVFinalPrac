package com.client.exercise;

import com.client.exercise.constants.PointsToScoreMapper;

public class ScoreBoard {

	private static final String ALL = " All";
	private Player firstPlayer;
	private Player secondPlayer;

	public ScoreBoard(Player firstPlayer, Player secondPlayer) {
		this.firstPlayer = firstPlayer;
		this.secondPlayer = secondPlayer;
	}

	public String getResult() {
		String result;

		if (firstPlayer.getPoints() == secondPlayer.getPoints()) {
			result = PointsToScoreMapper.getScore(firstPlayer.getPoints()) + ALL;
		} else {
			result = PointsToScoreMapper.getScore(firstPlayer.getPoints()) + " "
					+ PointsToScoreMapper.getScore(secondPlayer.getPoints());
		}

		return result;
	}

}
