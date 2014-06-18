package behavioural.strategy;

public class Context {
    private Strategy strategy;

    public Context(final Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(final int a, final int b) {
        return strategy.execute(a, b);
    }

}
