package grasp.low_coupling.right;

public class Animal {

    private String name;

    Animal(String newName){
        name = newName;
    }

    @Override
    public String toString() {
        return "Animal named " + name;
    }
}
