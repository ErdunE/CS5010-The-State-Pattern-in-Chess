package states;

import main.ChessGame;

/**
 * Abstract base class representing different states in a chess game.
 * Each state defines different transitions for game phases and scenarios.
 */
public abstract class State {
	protected ChessGame game;

	public State(ChessGame game) {
		this.game = game;
	}

	// initialGame
	public abstract State startGame();
	// normalPlay
	public abstract State normalplay();
	// playerTurnSwitch
	public abstract State PlayerTurnSwitch();
	// check
	public abstract State check();
	// checkmate
	public abstract State checkmate();
}