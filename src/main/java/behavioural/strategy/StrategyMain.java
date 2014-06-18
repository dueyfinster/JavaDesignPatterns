package behavioural.strategy;

public class StrategyMain {

    private static Context context;

    public static void main(String[] args) {
         // Three contexts following different strategies
        context = new Context(new Add());
        int resultA = context.executeStrategy(10,5);
 
        context = new Context(new Subtract());
        int resultB = context.executeStrategy(10,5);
 
        context = new Context(new Multiply());
        int resultC = context.executeStrategy(10,5);
        
        context = new Context(new Divide());
        int resultD = context.executeStrategy(10,5);
 
        System.out.println("Result A : " + resultA );
        System.out.println("Result B : " + resultB );
        System.out.println("Result C : " + resultC );
        System.out.println("Result D : " + resultD );

    }

}
