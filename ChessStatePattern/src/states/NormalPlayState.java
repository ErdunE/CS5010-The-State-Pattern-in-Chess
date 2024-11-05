package states;

import main.*;
/**
 * Here is a single state class. You will need to add
 * more for this assignment. The states are arguably the most
 * important part of the assignment to understand, so please
 * work on implementing the states as reliably as possible.
 */

public class NormalPlayState extends State {
	
	public NormalPlayState(ChessGame game) {
		super(game);
	}

	@Override
	public String work() {
		System.out.println("we are in a normal play state.");
		// also include code here to decide between black and white moves

		// pseudocode:
		// if (piece that is being moved is moving to a square with a piece in it) {
		//		return "Attack"; // to change to attack state.
		//	}
		// if (piece is being moved to a square with a king in it){
		// 		return "Check"; // to change to check state.
		// }
		// if (piece is being moved to a square with a king in it and the kind can not avoid capture)
		// 		return "Mate"; // to change to the mate state
		// }
		// else{
		// 		return "NormalPlay"; // if we want to stay in the current NormalPlay state.
		// }

		// for now I am just saying checkmate to not enter an infinite loop. The above is how this method should be
		// implemented
		return "CheckMate";
	}
}
