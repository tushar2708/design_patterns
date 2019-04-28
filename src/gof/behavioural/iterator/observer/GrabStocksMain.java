package gof.behavioural.iterator.observer;

public class GrabStocksMain {

    public static void main(String[] args){

        // create a subject
        StockGrabber stockGrabber = new StockGrabber();

        StockObserver obs1 = new StockObserver(stockGrabber);
        StockObserver obs2 = new StockObserver(stockGrabber);
//        StockObserver obs3 = new StockObserver(stockGrabber);
//        StockObserver obs4 = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(100.00);
        stockGrabber.setAaplPrice(200.00);
        stockGrabber.setGoogPrice(300.00);

    }

}
