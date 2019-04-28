package grasp.low_coupling.right;

public class Monkey extends Animal {

    private String name;

    public Monkey(String newName){
        super(newName);
        name = newName;
    }

    @Override
    public String toString() {
        return "Monkey named " + name;
    }
}

