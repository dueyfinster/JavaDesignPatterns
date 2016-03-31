package behavioural.template;
public class Hurling extends Game {

   @Override
   void endPlay() {
      System.out.println("Hurling Game Finished!");
   }

   @Override
   void initialize() {
      System.out.println("Hurling Game Initialized! Start playing.");
   }

   @Override
   void startPlay() {
      System.out.println("Hurling Game Started. Enjoy the game!");
   }
}
