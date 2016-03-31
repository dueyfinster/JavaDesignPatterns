package behavioural.template;

public final class TemplatePatternDemo {

   private TemplatePatternDemo() {};

   public static void main(final String[] args) {

      Game game = new Hurling();
      game.play();

      System.out.println();

      game = new Football();
      game.play();
   }
}
