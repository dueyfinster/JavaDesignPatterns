package behavioural.strategy;

public class Multiply implements Strategy {

    public int execute(final int a, final int b) {
        return a*b;
    }

}
