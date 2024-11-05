package states;

import main.ChessGame;

/**
 * The {@code CheckmateState} class represents the end state of the game when
 * the King is in checkmate. This state means that the game is over and
 * one of the players has won.
 *
 *  @author Erdun E
 *  @version 1.0
 *  @since 2024-10-31
 */
public class CheckmateState extends State {
    public CheckmateState(ChessGame chessGame) {
        super(chessGame);
    }


    @Override
    public String work() {
        System.out.println("We are in the checkmate state.");
        // print "Game over" maybe say who won and exit the program in this method itself, before return statement.
        System.exit(0);
        return "";
    }

    // Placeholder for actions that will be taken in the checkmate state.

    // Placeholder method indicating the game is over in the checkmate state.
}

