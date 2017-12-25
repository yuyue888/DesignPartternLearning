package observer.jdkdemo;


import java.util.Observable;
import java.util.Observer;

public class StudentObserver implements Observer {
    private String name ;

    public StudentObserver() {
        this.name = "tom" ;
    }

    public StudentObserver(String name) {
        this.name = name ;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name + ":开始做" + arg);
    }
}
