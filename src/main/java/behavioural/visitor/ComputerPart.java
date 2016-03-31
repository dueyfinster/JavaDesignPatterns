package behavioural.visitor;

public interface ComputerPart {
   void accept(ComputerPartVisitor computerPartVisitor);
}
