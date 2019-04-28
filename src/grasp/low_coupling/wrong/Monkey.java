package grasp.low_coupling.wrong;

public class Monkey {

    private String name;

    Monkey(String newName){ name = newName;}

    @Override
    public String toString() { return "Monkey found " + name;}
}
