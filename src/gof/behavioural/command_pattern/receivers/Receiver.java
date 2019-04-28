package gof.behavioural.command_pattern.receivers;

// Receiver is the interface that will be implemented by the classes that actually handle the business logic "to do stuff".
public interface Receiver {
    void on();
    void off();
}
