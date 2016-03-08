package structural.flyweight;
import java.util.HashMap;

public final class ShapeFactory {
   private static final HashMap<String, Shape> CIRCLE_MAP = new HashMap();
   
   private ShapeFactory() {}

   public static Shape getCircle(final String color) {
      Circle circle = (Circle) CIRCLE_MAP.get(color);

      if(circle == null) {
         circle = new Circle(color);
         CIRCLE_MAP.put(color, circle);
         System.out.println("Creating circle of color : " + color);
      }
      return circle;
   }
}
