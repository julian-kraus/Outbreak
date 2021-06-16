package Controller;

import Controller.AudioPlayer.AudioPlayer;
import Controller.Collision.Collision;
import Controller.GameController.GameController;
import Controller.Steering.MouseSteering;
import GameView.GameViewInterface;
import Model.ModelInterface;
import View.GameView.Dimension2D;
import View.GameViewInterface;

public class ControllerInterface {

    private ModelInterface modelInterface;
    private GameViewInterface gameViewInterface;
    private AudioPlayer audioPlayer;
    private Collision collision;
    private GameController gameController;
    private MouseSteering mouseSteering;

    public void setAudioPlayer(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    public void setCollision(Collision collision) {
        this.collision = collision;
    }

    public void setGameController(GameController gameController) {
        this.gameController = gameController;
    }

    public void setMouseSteering(MouseSteering mouseSteering) {
        this.mouseSteering = mouseSteering;
    }

    public void playBackgroundMusic(){
        audioPlayer.playBackgroundMusic();
    }

    public void stopBackgroundMusic(){
        audioPlayer.stopBackgroundMusic();
    }

    public void setUpGame(){
        this.gameController.setUp();
    }

    public void evaluateCollisions(){
    }

    public void startGame(){
        this.gameController = new GameController(new Dimension2D(100, 100));
        setUpGame();
    }
}

