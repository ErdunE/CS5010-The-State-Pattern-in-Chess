package states;

import main.ChessGame;

public class AttackingState extends State {
    public AttackingState(ChessGame game) {
        super(game);
    }

    @Override
    public String work() {
        System.out.println("we are in a Attacking State.");
        // pseudocode: do work to remove piece that is being attacked from the board and then return true to
        // move to the next state.
        return "NormalPlay";
    }
}
