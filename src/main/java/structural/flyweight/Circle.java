package structural.flyweight;

public class Circle implements Shape {
    private int x;
    private int y;
    private int radius;
    private String colour;
    
    public Circle(final String colour) {
        this.colour = colour;
    }

    public void setX(final int x){
        this.x = x;
    }

    public void setY(final int y){
        this.y = y;
    }
    
    public void setRadius(final int radius){
        this.radius = radius;
    }
    
    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Colour : " + colour + ", x : " + x + ", y :" + y + ", radius :" + radius);
    }
}
