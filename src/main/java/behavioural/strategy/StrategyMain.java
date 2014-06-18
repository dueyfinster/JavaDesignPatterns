package behavioural.strategy;

final class StrategyMain {

    private static final int FIRST_NUMBER = 10;
    private static final int SECOND_NUMBER = 5;

    private static Context context;

    private StrategyMain(){}

    public static void main(final String[] args) {
         // Three contexts following different strategies
        context = new Context(new Add());
        int resultA = context.executeStrategy(FIRST_NUMBER, SECOND_NUMBER);
 
        context = new Context(new Subtract());
        int resultB = context.executeStrategy(FIRST_NUMBER, SECOND_NUMBER);
 
        context = new Context(new Multiply());
        int resultC = context.executeStrategy(FIRST_NUMBER, SECOND_NUMBER);
        
        context = new Context(new Divide());
        int resultD = context.executeStrategy(FIRST_NUMBER, SECOND_NUMBER);
 
        System.out.println("Result A : " + resultA);
        System.out.println("Result B : " + resultB);
        System.out.println("Result C : " + resultC);
        System.out.println("Result D : " + resultD);

    }

}
