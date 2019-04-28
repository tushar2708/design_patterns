package gof.behavioural.iterator.observer;

import java.util.ArrayList;

public class StockGrabber implements Subject {

    private ArrayList<Observer> observers;



    private double ibmPrice,  aaplPrice,  googPrice;

    public StockGrabber(){
        observers = new ArrayList<Observer>();
    }



    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        int obIndex = observers.indexOf(o);
        System.out.println("Observer " + (obIndex+1) + " deleted.");
        observers.remove(obIndex);
    }

    @Override
    public void notifyObserver() {
        for (Observer o: observers){
            o.update(ibmPrice, aaplPrice, googPrice);
        }
    }




    public double getIbmPrice() {
        return ibmPrice;
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObserver();
    }

    public double getAaplPrice() {
        return aaplPrice;
    }

    public void setAaplPrice(double aaplPrice) {
        this.aaplPrice = aaplPrice;
        notifyObserver();
    }

    public double getGoogPrice() {
        return googPrice;
    }

    public void setGoogPrice(double googPrice) {
        this.googPrice = googPrice;
        notifyObserver();
    }
}
