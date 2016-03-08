package behavioural.chainofresponsibility;

public enum LogLevels {
    INFO(0),
    ERROR(1),
    DEBUG(2);
    
    private int level;

    LogLevels(final int level) {
        this.level = level;
    }
    
    public int getLevelCode() {
        return level;
    }
}
