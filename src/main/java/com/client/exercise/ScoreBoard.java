package com.client.exercise;

import com.client.exercise.constants.PointsToScoreMapper;

public class ScoreBoard {

	private static final String LOVE_ALL = "Love All";
	private int firstPlayerPoints;
	private int secondPlayerPoints;

	public ScoreBoard(int firstPlayerPoints, int secondPlayerPoints) {
		this.firstPlayerPoints = firstPlayerPoints;
		this.secondPlayerPoints = secondPlayerPoints;
	}

	public String getResult() {
		String result;

		if (firstPlayerPoints > 0 || secondPlayerPoints > 0) {
			result = PointsToScoreMapper.getScore(firstPlayerPoints) + " "
					+ PointsToScoreMapper.getScore(secondPlayerPoints);
		} else {
			return LOVE_ALL;
		}

		return result;
	}

}
