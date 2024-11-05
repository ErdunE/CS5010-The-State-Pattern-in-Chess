package states;

import main.ChessGame;

public class GameStart extends State{
    public GameStart(ChessGame game) {
        super(game);
    }

    @Override
    public String work() {
        // put any initialization work here.
        System.out.println("We are in the GameStart stage.");
        return "NormalPlay";
    }

}
