package Model.Paddle;

import Model.GameObject;

public class Paddle extends GameObject {
    private final double width;
    private final double height;
    public Paddle(double[] initialPosition, double width, double height) {
        super(initialPosition);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}

