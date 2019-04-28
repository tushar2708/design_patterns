package grasp.low_coupling.right;

public class Lion extends Animal {

    private String name;

    public Lion(String newName){
        super(newName);
        name = newName;
    }

    @Override
    public String toString() {
        return "Lion named " + name;
    }
}

