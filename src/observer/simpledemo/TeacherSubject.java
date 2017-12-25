package observer.simpledemo;

import java.util.ArrayList;
import java.util.List;

public class TeacherSubject implements Subject {

    List<Observer> observers = new ArrayList<>();

    String info ;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(observer -> observer.update(info));
    }

    public void setHomework(String info){
        this.info=info;
        System.out.println("今天的作业是"+info);
        this.notifyObserver();
    }
}
