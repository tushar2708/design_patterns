package grasp.low_coupling.wrong;

public class Lion {

    private String name;

    Lion(String newName){
        name = newName;
    }

    @Override
    public String toString() {
        return "Lion found " + name;
    }
}
