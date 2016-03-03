package structural.bridge;

public abstract class Shape {
    protected final DrawAPI drawAPI;

    protected Shape(final DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
