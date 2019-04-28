package gof.behavioural.command_pattern.receivers;

public class MotorReceiver implements Receiver {

    @Override
    public void on() {
        System.out.println("motor is on");
    }

    @Override
    public void off() {
        System.out.println("motor is off");
    }
}
