package strategy;

/**
 * 测试
 * 在策略模式（Strategy Pattern）中，一个类的行为或其算法可以在运行时更改
 * Created by ssc on 2017/11/5.
 */
public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("小明", 160, 50);
        Student student2 = new Student("小红", 150, 60);
        Student student3 = new Student("小刚", 155, 55);
        Student student4 = new Student("小王", 180, 70);
        Student student5 = new Student("小李", 170, 80);
        Student[] students = {student1, student2, student3, student4, student5};
        MySort mySort = new SimpleSort();
        System.out.println("--学生按身高排序--");
        mySort.sort(students);
        for(Student student :students){
            System.out.println(student);
        }
        System.out.println("--学生按体重排序--");
        mySort.sort(students,new StudentWeightComparator()); //仅需更换策略即可
        for(Student student :students){
            System.out.println(student);
        }
    }
}
