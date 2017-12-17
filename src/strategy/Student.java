package strategy;

/**
 * 定义一个学生类
 * Created by ssc on 2017/11/5.
 */
public class Student implements MyComparable<Student> {
    private int height;

    private int weight;

    private String name;

    private MyComparator<Student> comparator = new StudentHeightComparator();//deafult comparator

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyComparator<Student> getComparator() {
        return comparator;
    }

    public void setComparator(MyComparator<Student> comparator) {
        this.comparator = comparator;
    }

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age, int weight) {
        this.height = age;
        this.weight = weight;
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    @Override
    public int compareTo(Student o) {
        return comparator.compare(this, o);
    }

    @Override
    public String toString() {
        return "(name:" + this.name + ",height:" + this.height + ",weight:" + this.weight + ")";
    }
}
