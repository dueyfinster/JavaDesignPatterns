package behavioural.observer;

public interface Observer {
    
    /*
     * The action to perform when the subject is updated.
     *
     * @param subject
     */
    void update(Subject subject);
    
    /*
     * Returns the current state.
     */
    int getState();
}
