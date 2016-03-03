package structural.bridge;

public class GreenCircle implements DrawAPI {

    @Override
    public void drawCircle(final int radius, final int x, final int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
    }

}
