import processing.core.PApplet;

public class Ball {
    public static final int DIAMETER = 20;
    private int xAxisPosition;
    private int yAxisPosition;
    private int speed;


    public Ball(int xAxisPosition, int yAxisPosition, int speed) {
        this.xAxisPosition = xAxisPosition;
        this.yAxisPosition = yAxisPosition;
        this.speed = speed;
    }


    public void move() {
        xAxisPosition += speed;
    }

    public void draw(PApplet pApplet) {
        pApplet.ellipse(xAxisPosition, yAxisPosition, DIAMETER, DIAMETER);

    }
}
