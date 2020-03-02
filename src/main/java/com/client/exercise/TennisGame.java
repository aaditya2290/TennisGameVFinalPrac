package com.client.exercise;

public class TennisGame {

	private int firstPlayerPoints;
	private int secondPlayerPoints;

	public String getPoints() {
		return firstPlayerPoints + " - " + secondPlayerPoints;
	}

	public GameBoard getBoard() {
		return new GameBoard();
	}
}
