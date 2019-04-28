package gof.creational.factory;

public class CompleteSyncClient extends PerforceClient {

    String workspaceName;

    public CompleteSyncClient( String workspaceName){
        this.workspaceName = workspaceName;
    }

    public void sync(){
        // P4 SDK call for "P4 sync"
    }

    public void forceSync(){
        // P4 SDK call for "P4 sync -f"
    }

}
