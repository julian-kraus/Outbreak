package Model.Ball;

import Model.GameObject;

public class Ball extends GameObject {
    private double direction;
    private final double radius;

    Ball(double[] initialPosition, double initialDirection, double radius) {
        super(initialPosition);
        this.direction = initialDirection;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getDirection() {
        return direction;
    }

    public void setDirection(double initialDirection) {
        this.direction = initialDirection;
    }
}
