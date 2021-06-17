package Model;

public abstract class GameObject {
    private double[] position;

    public GameObject(double[] initialPosition) {
        this.position = initialPosition;
    }

    public void setPosition(double[] position) {
        this.position = position;
    }

    public double[] getPosition() {
        return position;
    }

}
