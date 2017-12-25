package observer.jdkdemo;

import java.util.Observable;

public class TeacherSubject extends Observable {

    private String info;

    public void setHomework(String info) {
        this.info = info;
        System.out.println("老师布置" + info);
        setChanged();
        notifyObservers(info);
    }

    public String getInfo() {
        return info;
    }
}
