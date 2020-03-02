package com.client.exercise;

public class ScoreBoard {

	private static final String FIFTEEN_LOVE = "Fifteen Love";
	private static final String LOVE_ALL = "Love All";
	private int firstPlayerPoints;
	private int secondPlayerPoints;

	public ScoreBoard(int firstPlayerPoints, int secondPlayerPoints) {
		this.firstPlayerPoints = firstPlayerPoints;
		this.secondPlayerPoints = secondPlayerPoints;
	}

	public String getResult() {
		if (firstPlayerPoints == 1 && secondPlayerPoints == 0) {
			return FIFTEEN_LOVE;
		} else if (firstPlayerPoints == 0 && secondPlayerPoints == 0) {
			return LOVE_ALL;
		} else {
			return "";
		}
	}

}
