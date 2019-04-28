package grasp.creator;

public class Bike {

    Wheel wheel;
    Frame frame;

    public Bike(Wheel wheel, Frame frame){
        this.wheel = wheel;
        this.frame = frame;
    }

    public Bike(int wheelWidth, int frameLength){
        this.wheel = new Wheel(wheelWidth);
        this.frame = new Frame(frameLength);
    }

    public static void main(String[] args){

        /* Bad object creation. the job if creation of Wheel/Frame should be given to Bike class, bcz
        1. It's the only class that uses it.
        2. It can have all the details required to create a wheel
         */
        Wheel wheel = new Wheel(24);
        Frame frame = new Frame(52);
        Bike bike = new Bike(wheel, frame);

        /*
        Better design, allows end user to provide parameters, instead of forcing them to create parts.
         */
        Bike bike2 = new Bike(24, 52);
    }

}
