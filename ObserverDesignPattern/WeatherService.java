package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherService implements Subject{
    List<Observer> observers = new ArrayList<Observer>();
    private String data ;
    @Override
    public void registerObserver(Observer observer) {
        // TODO Auto-generated method stub
        observers.add(observer);
        //throw new UnsupportedOperationException("Unimplemented method 'registerObserver'");
    }

    @Override
    public void removeObserver(Observer observer) {
        // TODO Auto-generated method stub
        observers.remove(observer);  // Using 'remove' method instead of 'contains' for better performance.
        //throw new UnsupportedOperationException("Unimplemented method 'removeObserver'");
    }

    @Override
    public void notifyObservers(String data) {
        // TODO Auto-generated method stub
        this.data = data;
        for(Observer observer: observers){
            observer.update(this.data);
        }
    }

    public void setData(String data) {
        notifyObservers(data);
    }
    
}
