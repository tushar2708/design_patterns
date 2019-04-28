package gof.structural;

import gof.creational.factory.PerforceClient;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Map;

public class Task {

    List<String> servers;
    List<NetworkDrive> networkDrives;
    List<PerforceClient> perforceClients;

    public Task(Map<String, String> config){
        /*
        Prepare the lists of servers, network drives, and perforce clients,
         using their respective factories (eg. NetworkDriveFactory & PerforceClientFactory).
         */
    }

    public boolean VerifyServer(){
        InetAddress ip;
        String hostname;
        try {

            ip = InetAddress.getLocalHost();

            // Fetch current system's hostname
            hostname = ip.getHostName();

        } catch (UnknownHostException e) {
            e.printStackTrace();
            // Fail if unable to get the hostname
            return false;
        }

        /*
        Below statement returns true if the list of applicable "servers"
        has the current hostname, else returns false.
         */
        return servers.contains(hostname);

    }

    public void ExecuteTask(){

        // sync all perforce clients
        for(PerforceClient perforceClient : perforceClients){
            perforceClient.sync();
        }

        // mount all network drives
        for(NetworkDrive networkDrive : networkDrives){
            networkDrive.mount();
        }
    }
}
