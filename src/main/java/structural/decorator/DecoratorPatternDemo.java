package structural.decorator;

public final class DecoratorPatternDemo {
    
    private DecoratorPatternDemo(){}

    public static void main(final String[] args) {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Square());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nSquare of red border");
        redRectangle.draw();

    }

}
