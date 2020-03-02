package com.client.exercise;

import com.client.exercise.constants.PointsToScoreMapper;

public class ScoreBoard {

	private int firstPlayerPoints;
	private int secondPlayerPoints;

	public ScoreBoard(int firstPlayerPoints, int secondPlayerPoints) {
		this.firstPlayerPoints = firstPlayerPoints;
		this.secondPlayerPoints = secondPlayerPoints;
	}

	public String getResult() {
		String result;

		if (firstPlayerPoints == secondPlayerPoints) {
			result = PointsToScoreMapper.getScore(firstPlayerPoints) + " All";
		} else {
			result = PointsToScoreMapper.getScore(firstPlayerPoints) + " "
					+ PointsToScoreMapper.getScore(secondPlayerPoints);
		}

		return result;
	}

}
