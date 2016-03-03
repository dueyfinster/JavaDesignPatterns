package structural.bridge;

public class Circle extends Shape {
    private final int x;
    private final int y;
    private final int radius;

    protected Circle(final int x, final int y, final int radius, final DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }

}
