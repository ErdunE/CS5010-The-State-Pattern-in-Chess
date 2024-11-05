package states;

import main.*;

public abstract class State {
	
	ChessGame game;
	
	public State(ChessGame game) {
		this.game = game;
	}
	
	//here is where you write the methods you will want overridden by each
	//specific state's behavior

	/**
	 * method that will be called on State object, but depending on the current State object will work
	 * differently. Additionally, if it returns true that means we should change our state to the next state.
	 *
	 */
	public abstract String work();
}
