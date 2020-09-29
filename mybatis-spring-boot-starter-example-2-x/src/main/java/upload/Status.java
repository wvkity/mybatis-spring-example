package upload;

public enum Status {
    WAITING,
    RUNNING,
    PAUSE,
    SHUTDOWN;
    
    public int getValue() {
        return ordinal() + 1;
    }
}
