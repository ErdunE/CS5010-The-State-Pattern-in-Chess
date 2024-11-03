package states;
import main.*;
/**
 * @author Xinyu Wang
 * @version 9/15/2024
 * The {@code State} class is the abstract superclass representing the state of the game.
 */
public abstract class State {
	
	ChessGame game;
	private boolean check;
	private boolean checkMate;
	private String currentState;

	public State(ChessGame game) {
		this.game = game;
	}

	/**
	 * Set the state to check.
	 * Set the boolean value of check to true.
	 */
	public void setCheck() {
		this.check = true;
	}

	/**
	 * Set the state to normal play state.
	 * Set the boolean value of check to false.
	 */
	public void setEscape() {
		this.check = false;
	}

	/**
	 * Set the state to checkmate.
	 * Set the boolean value of checkmate to true.
	 */
	public void setCheckMate() {
		this.checkMate = true;
	}

	/**
	 * Return if it is in check state.
	 * @return boolean.
	 */
	public boolean isCheck() {
		return this.check;
	};

	/**
	 * Return if it is in checkmate state.
	 * @return boolean.
	 */
	public boolean isCheckMate() {
		return this.checkMate;
	};

	/**
	 * Return the current state.
	 * @return String.
	 */
	public String getCurrentState() {
		return this.currentState;
	}

	/**
	 * Set the current state.
	 * @param currentState a string that represent the current state
	 */
	public void setCurrentState(String currentState) {
		this.currentState = currentState;
	}
}
