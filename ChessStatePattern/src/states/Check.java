package states;
import main.*;
/*
    Author: Kai
    Version:6.Oct.2024
 */
public class CheckState extends  State{
     private ChessGame game;
     public CheckState(ChessGame game){
        super(game);
    }
    @Override
    public State startGame() {
        throw new UnsupportedOperationException("Game already started.");
        /**
         * This function will throw an exception because the game already started.
         */
    }

    @Override
    public State normalplay() {
        throw new UnsupportedOperationException("Player" + game.getCurrentPlayer() + "is Checked now");
        /**
         * This function will throw an exception because player is checked now.
         */
    }

    @Override
    public State checkMate() {
        System.out.println("Player" + game.getCurrentPlayer() + "unable to resolve the current situation. ");
        System.out.println("Transitioning to Checkmate State");
        return new checkMateState;
        /**
         * This function is called when transitioning from Check to checkMate.
         * Return checkMate
         * @return State.
         */
    }

    @Override
    public State check() {
        System.out.println("Problem solved，player" + game.getCurrentPlayer() + "is not checked now.");
        return new NormalPlayState;
        /**
         * This function is called when transitioning from CheckState to NormalPlayState.
         * Return NormalPlayState
         * @return State.
         */
    }

    @Override
    public State PlayerTurnSwitch() {
        throw new UnsupportedOperationException("Please make your move. ");
        /**
         * This function will throw an exception because player is checked now.
         */
    }
}
