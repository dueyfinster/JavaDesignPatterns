package structural.bridge;

public final class BridgeDemo {
    private static final int HEIGHT = 100;
    private static final int WIDTH = 100;
    private static final int RADIUS = 10;
    
    private BridgeDemo(){}

    public static void main(final String[] args) {
        Shape redCircle = new Circle(HEIGHT, WIDTH, RADIUS, new RedCircle());
        Shape greenCircle = new Circle(HEIGHT, WIDTH, RADIUS, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }

}
