import processing.core.PApplet;

public class TryProcessing extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    public static final int position = HEIGHT / 5;
    int ball1 = 1;
    int ball2 = 1;
    int ball3 = 1;
    int ball4 = 1;

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        getEllipse();
    }

    private void getEllipse() {
        int speedPerFrame = 0, yPosition = 0;
        drawEllipse(ball1 += ++speedPerFrame, ++yPosition);
        drawEllipse(ball2 += ++speedPerFrame, ++yPosition);
        drawEllipse(ball3 += ++speedPerFrame, ++yPosition);
        drawEllipse(ball4 += ++speedPerFrame, ++yPosition);
    }

    private void drawEllipse(int x, int y) {
        ellipse(x, y * position, DIAMETER, DIAMETER);
    }

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }
}
