package creational.singleton;

/**
 * @author Neil Grogan
 * A Singleton enforces the fact this class can only be instantiated once.
 * Provides a useful single point of data.
 * 
 */
public enum Singleton {
    INSTANCE;
    
    public Singleton getInstance(){
        return INSTANCE;
    }
}
