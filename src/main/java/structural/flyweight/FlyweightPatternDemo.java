package structural.flyweight;
public final class FlyweightPatternDemo {
   private static final int NUM_CIRCLES = 20;
private static final int ONE_HUNDRED = 100;
   private static final String[] COLOURS = {"Red", "Green", "Blue", "White", "Black"};
   
   private FlyweightPatternDemo(){};

   public static void main(final String[] args) {

      for(int i=0; i < NUM_CIRCLES; ++i) {
         Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
         circle.setX(getRandomX());
         circle.setY(getRandomY());
         circle.setRadius(ONE_HUNDRED);
         circle.draw();
      }
   }
   private static String getRandomColor() {
      return COLOURS[(int) (Math.random()*COLOURS.length)];
   }
   private static int getRandomX() {
      return (int) (Math.random()*ONE_HUNDRED);
   }
   private static int getRandomY() {
      return (int) (Math.random()*ONE_HUNDRED);
   }
}
