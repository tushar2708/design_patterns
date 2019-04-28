package gof.behavioural.command_pattern.receivers;

public class BulbReceiver implements Receiver {

    @Override
    public void on() {
        System.out.println("bulb is on");
    }

    @Override
    public void off() {
        System.out.println("bulb is off");
    }
}
