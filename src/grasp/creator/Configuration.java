package grasp.creator;

import gof.structural.Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Configuration {

    private List<Task> tasks;

    private List<Map<String, String>> loadConfig(String filename){
        List<Map<String, String>> configList = new ArrayList<>();

        /*
        Read config from "filename", and prepare a list of "HashMap"s
        */

        return configList;
    }


    public Configuration(String filename){

        List<Map<String, String>> taskConfigs = loadConfig(filename);

        /*
         Create Task objects from configuration Maps,
         & add them to "tasks" list, one by one.
         */
        for (Map<String, String> taskConfig : taskConfigs){
            tasks.add(new Task(taskConfig));
        }
    }

    public void runTasks(){
        /*
         Run each task one by one, by calling it's ExecuteTask() method
         */
        for (Task task: tasks){
            task.ExecuteTask();
        }
    }
}
