package behavioural.visitor;

public class Monitor implements ComputerPart {

   @Override
   public void accept(final ComputerPartVisitor computerPartVisitor) {
      computerPartVisitor.visit(this);
   }
}
