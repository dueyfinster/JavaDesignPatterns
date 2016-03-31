package behavioural.visitor;

public class Keyboard implements ComputerPart {

   @Override
   public void accept(final ComputerPartVisitor computerPartVisitor) {
      computerPartVisitor.visit(this);
   }
}
