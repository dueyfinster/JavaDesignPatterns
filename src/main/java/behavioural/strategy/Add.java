package behavioural.strategy;

/**
 * @author Neil Grogan
 *
 * Adds two numbers together.
 */
public class Add implements Strategy {

    /**
     * Adds two numbers, a and b.
     *
     * @param a - first number to add.
     * @param b - second number to add.
     * @return result of addition.
     */
    public int execute(final int a, final int b) {
        return a+b;
    }

}
