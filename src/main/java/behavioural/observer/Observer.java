package behavioural.observer;

public interface Observer {
    
    /*
     * The action to perform when the subject is updated.
     */
    public void update (Subject subject);
    
    /*
     * Returns the current state.
     */
    public int getState ();
}