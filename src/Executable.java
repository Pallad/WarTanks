package executable;

public interface Executable {
    boolean preCheckAction(Object _obj);
    void execAction(Object _obj);
    void rollbackAction(Object _obj);
}
