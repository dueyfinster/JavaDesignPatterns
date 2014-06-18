package behavioural.observer;

public interface Subject {
    
    /*
     * Attach an observer to this subject.
     * @param observer The observer to attach.
     */
    public void attach (Observer observer);
    
    /*
     * Detach an observer from this subject.
     * @param observer The observer to detach.
     */
    public void detach (Observer observer);
    
    /*
     * Notify all observers of a change to this subject's state.
     */
    public void notifyOservers ();
    
    /*
     * Get the state of this subject.
     */
    public int getState ();
    
    /*
     * Set the state of this subject.
     * @param The state to set.
     */
    public void setState (int state);
}
