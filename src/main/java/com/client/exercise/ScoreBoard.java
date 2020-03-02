package com.client.exercise;

public class ScoreBoard {

	private static final String LOVE_ALL = "Love All";
	private int firstPlayerPoints;
	private int secondPlayerPoints;

	public ScoreBoard(int firstPlayerPoints, int secondPlayerPoints) {
		this.firstPlayerPoints = firstPlayerPoints;
		this.secondPlayerPoints = secondPlayerPoints;
	}

	public String getResult() {
		if (firstPlayerPoints == 0 && secondPlayerPoints == 0) {
			return LOVE_ALL;
		} else {
			return "";
		}
	}

}
