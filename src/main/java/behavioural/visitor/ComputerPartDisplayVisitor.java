package behavioural.visitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

   @Override
   public void visit(final Computer computer) {
      System.out.println("Displaying Computer.");
   }

   @Override
   public void visit(final Mouse mouse) {
      System.out.println("Displaying Mouse.");
   }

   @Override
   public void visit(final Keyboard keyboard) {
      System.out.println("Displaying Keyboard.");
   }

   @Override
   public void visit(final Monitor monitor) {
      System.out.println("Displaying Monitor.");
   }
}
