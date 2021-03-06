package com.m.myfirstgame;

public class GameController {
    private GameActivity context;
    private GameSurfaceView view;
    private Game game;
    private Ball ball;
    private float speedX;
    private float speedY;
    private float gravity;

    public GameController(GameActivity context, float speedX, float speedY, float gravity) {
        this.context = context;
        this.view = new GameSurfaceView(context, this);
        this.speedX = speedX;
        this.speedY = speedY;
        this.gravity = gravity;
    }

    public void update() {
        ball.updatePosition();
    }

    public Game getGame() {
        return this.game;
    }

    public void start() {
        game = new Game(this.view.getSurfaceWidth(), this.view.getSurfaceHeight(), speedX, speedY, gravity);
        ball = game.getBall();
    }

    public GameSurfaceView getView() {
        return view;
    }
}
