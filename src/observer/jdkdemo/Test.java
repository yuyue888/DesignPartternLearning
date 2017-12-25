package observer.jdkdemo;


import java.util.Observer;

public class Test {
    public static void main(String[] args){
        Observer stu1 = new StudentObserver("小张");
        Observer stu2 = new StudentObserver("小明");
        TeacherSubject teacher = new TeacherSubject();
        teacher.addObserver(stu1);
        teacher.addObserver(stu2);
        teacher.setHomework("数学题");
        teacher.setHomework("语文题");
    }
}
