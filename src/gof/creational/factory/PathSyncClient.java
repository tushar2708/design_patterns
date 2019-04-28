package gof.creational.factory;

public class PathSyncClient extends PerforceClient {

    String workspaceName;
    String SpecificPath;

    public PathSyncClient(String workspaceName, String specificPath){
        this.workspaceName = workspaceName;
        this.SpecificPath = specificPath;
    }

    public void sync(){
        // P4 SDK call for "P4 sync //depot/path/"
    }

    public void forceSync(){
        // P4 SDK call for "P4 sync -f //depot/path/"
    }

}
