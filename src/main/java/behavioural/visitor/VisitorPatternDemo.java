package behavioural.visitor;

public final class VisitorPatternDemo {
   private VisitorPatternDemo(){};

   public static void main(final String[] args) {

      ComputerPart computer = new Computer();
      computer.accept(new ComputerPartDisplayVisitor());
   }
}
