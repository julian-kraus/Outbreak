package Model.Building;

import Model.GameObject;

public class Building extends GameObject {
    private final double width;
    private final double height;
    Building(double[] initialPosition, double width, double height){
        super(initialPosition);
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
