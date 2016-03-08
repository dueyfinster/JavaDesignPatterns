package structural.proxy;
public final class ProxyPatternDemo {

    private ProxyPatternDemo(){}

   public static void main(final String[] args) {
      Image image = new ProxyImage("test_10mb.jpg");

      //image will be loaded from disk
      image.display(); 
      System.out.println("");

      //image will not be loaded from disk
      image.display();
   }
}
