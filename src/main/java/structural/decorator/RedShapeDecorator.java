package structural.decorator;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(final Shape decoratedShape) {
        super(decoratedShape);
    }
    
    public void draw(){
        decoratedShape.draw();
        setRedBorder();
    }
    
    
    private void setRedBorder(){
        System.out.println("Border Color: Red");
    }

}
