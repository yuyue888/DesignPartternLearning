package observer.simpledemo;

public class StudentObserver implements Observer {
    private String name ;

    public StudentObserver() {}

    public StudentObserver(String name) {
        this.name = name ;
    }

    @Override
    public void update(String msg) {
        System.out.println(name + ":" +msg);
    }
}
