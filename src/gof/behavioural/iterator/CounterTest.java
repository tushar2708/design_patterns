package gof.behavioural.iterator;

import java.util.Enumeration;

public class CounterTest {

    public static void main(String[] args){
        Enumeration counter = new CountIterator();

        while (true){
            if (counter.hasMoreElements()){
                System.out.println(counter.nextElement());
            } else {
                break;
            }
        }
    }


}
