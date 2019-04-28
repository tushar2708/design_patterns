package gof.behavioural.command_pattern.commands;

import gof.behavioural.command_pattern.receivers.Receiver;

public class TurnOnCommand implements Command {

    private Receiver receiver;

    public TurnOnCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.on();

    }

    @Override
    public void undo() {
        receiver.off();
    }
}
