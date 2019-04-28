package gof.behavioural.command_pattern;

import gof.behavioural.command_pattern.commands.Command;
import gof.behavioural.command_pattern.commands.NoCommandSetException;
import gof.behavioural.command_pattern.commands.TurnOnCommand;
import gof.behavioural.command_pattern.receivers.BulbReceiver;
import gof.behavioural.command_pattern.receivers.MotorReceiver;
import gof.behavioural.command_pattern.receivers.Receiver;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private Invoker invoker;

    private List<Command> commandList = new ArrayList<>();


    public static void main(String[] args) {

        Client client = new Client();
        client.run();
    }

    private void run() {

        // Use command pattern

        Invoker invoker = new Invoker();

        Receiver bulb = new BulbReceiver();
        Command command1 = new TurnOnCommand(bulb);
        commandList.add(command1);


        Receiver motor = new MotorReceiver();
        Command command2 = new TurnOnCommand(motor);
        commandList.add(command2);

        // Execute commands
        commandList.forEach(commandBackup -> {
            invoker.setCommand(commandBackup);
            try {
                invoker.executeCommand();
            } catch (NoCommandSetException e) {
                e.printStackTrace();
            }
        });


        // Time to undo
        commandList.forEach(commandBackup -> {
            invoker.setCommand(commandBackup);
            try {
                invoker.undoCommand();
            } catch (NoCommandSetException e) {
                e.printStackTrace();
            }
        });


    }

}
