package behavioural.iterator;

public final class IteratorPatternDemo {
  
private IteratorPatternDemo(){}

   public static void main(final String[] args) {
      final NameRepository namesRepository = new NameRepository();

      for(final Iterator iter = namesRepository.getIterator(); iter.hasNext();){
         final String name = (String) iter.next();
         System.out.println("Name: " + name);
      }
   }
}
