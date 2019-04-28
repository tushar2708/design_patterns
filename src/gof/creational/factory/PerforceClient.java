package gof.creational.factory;

public class PerforceClient {
    String port;
    String remotePath;
    String localPath;
    String Workspace;

    void Login(String PerforceToken){
        // Login to perforce server
    }

    Boolean VerifyWorkspace(){
        if (isValid(this.Workspace)){
            return true;
        } else{
            return false;
        }
    }

}
