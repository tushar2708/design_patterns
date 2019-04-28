package gof.behavioural.command_pattern;

import gof.behavioural.command_pattern.commands.Command;
import gof.behavioural.command_pattern.commands.NoCommandSetException;

public class Invoker {

    private Command command;

    public Invoker() {
    }

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() throws NoCommandSetException {
        if (this.command == null){
            throw new NoCommandSetException();
        }
        this.command.execute();
    }

    public void undoCommand() throws NoCommandSetException {

        if (this.command == null){
            throw new NoCommandSetException();
        }
        this.command.undo();
    }

}
