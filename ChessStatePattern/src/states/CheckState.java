package states;

import main.ChessGame;

public class CheckState extends State{
    public CheckState(ChessGame game) {
        super(game);
    }

    @Override
    public String work() {
        System.out.println("We are in the Check State");
        // pseudocode: print out white in check or black in check and return to normalplaystate
        return "NormalPlay";
    }
}
