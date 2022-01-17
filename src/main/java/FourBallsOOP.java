import processing.core.PApplet;

import java.util.ArrayList;

public class FourBallsOOP extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    private final ArrayList<Ball> ballList = new ArrayList<>();

    public static void main(String[] args) {
        PApplet.main("FourBallsOOP", args);
    }


    @Override
    public void settings() {
        super.settings();

        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        for (int i = 1; i <= 4; i++) {
            ballList.add(new Ball(1, (HEIGHT * i / 5), i));
        }
    }

    @Override
    public void draw() {
        for (Ball ball : ballList) {
            ball.move();
            ball.draw(this);
        }

    }
}
