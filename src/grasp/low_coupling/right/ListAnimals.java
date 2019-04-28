package grasp.low_coupling.right;

import java.util.ArrayList;
import java.util.List;

public class ListAnimals {

    private List<Animal> theAnimals = new ArrayList<>();

    public void addAnimalToZoo(Animal newAnimal){

        theAnimals.add(newAnimal);

    }

    public void displayAnimals(){
        for (Animal animal : theAnimals){
            System.out.println(animal);
        }
    }

    public static void main(String[] args){
        ListAnimals listAnimals = new ListAnimals();

        listAnimals.addAnimalToZoo(new Monkey("Max"));
        listAnimals.addAnimalToZoo(new Lion("Tom"));

        listAnimals.displayAnimals();

    }

}
