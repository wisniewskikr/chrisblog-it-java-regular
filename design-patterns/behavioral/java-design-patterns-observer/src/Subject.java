

import java.util.ArrayList;
import java.util.List;

// Subject class
class Subject {
    
    private List<Observer> observers = new ArrayList<>();
    private String message;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setMessage(String message) {
        this.message = message;
        notifyAllObservers();
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

}