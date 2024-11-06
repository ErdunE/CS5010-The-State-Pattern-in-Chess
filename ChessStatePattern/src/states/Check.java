package states;
import main.*;
/*
    Author: Kai
    Version:6.Oct.2024
 */
public class CheckState extends  State{
     private ChessGame game;
     private String currentPlayer;
     public CheckState(ChessGame game){
        super(game);
    }
    @Override
    public State startGame() {
        throw new UnsupportedOperationException("Game already started.");
    }

    @Override
    public State normalplay() {
        System.out.println("Not check now.");
        return new normalplay;
        // in check state, normalplay means switch to normalplay state
    }

    @Override
    public State checkMate() {
        System.out.println("Transitioning to Checkmate State");
        //is this print out necessary?
        return new checkMate;
        // in check state, normalplay means switch to checkmate state
    }

    @Override
    public State check() {
        System.out.println("Player" + game.getCurrentPlayer() + "is Checked");
        return new PlayerTrunSwitchState;
        //turn to playerTurn after print out.
    }

    @Override
    public State PlayerTurnSwitch() {
        throw new UnsupportedOperationException("Please make your move. ");
    }
}
