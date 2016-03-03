package structural.decorator;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(final Shape decoratedShape) {
        super(decoratedShape);
    }
    
    public void draw(){
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }
    
    
    private void setRedBorder(final Shape decoratedShape){
        System.out.println("Border Color: Red");
    }

}
