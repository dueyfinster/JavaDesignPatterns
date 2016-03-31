package behavioural.visitor;

public class Mouse implements ComputerPart {

   @Override
   public void accept(final ComputerPartVisitor computerPartVisitor) {
      computerPartVisitor.visit(this);
   }
}
