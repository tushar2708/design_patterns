package gof.creational.factory;

public class PerforceFactory {

    /* Eager Initialization, as no parameters are required
       and this factory instance will always be required for program execution.
     */
    private static PerforceFactory ourInstance = new PerforceFactory();

    private PerforceFactory() { }

    public static PerforceFactory getInstance()
    {
        return ourInstance;
    }

    public PerforceClient createPerforceClient(String workspaceName, String specificPath) {
        if (specificPath.isEmpty()) {
            return new CompleteSyncClient(workspaceName);
        } else {
            return new PathSyncClient(workspaceName, specificPath);
        }
    }
}
