package grasp.low_coupling.wrong;

public class ListAnimals {

    private Monkey theMonkey;
    private Lion theLion;

    ListAnimals(Monkey monkey, Lion lion){
        theMonkey = monkey;
        theLion = lion;
    }

    public void displayAnimals(){
        System.out.println(theMonkey);
        System.out.println(theLion);
    }

    public static void main(String[] srgs){
        Monkey monkey = new Monkey("Max");
        Lion lion = new Lion(("Tom"));

        ListAnimals listAnimals = new ListAnimals(monkey, lion);
        listAnimals.displayAnimals();

    }

}
