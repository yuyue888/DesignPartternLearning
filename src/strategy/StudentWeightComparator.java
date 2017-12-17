package strategy;

/**
 * 比较策略二：按身高比较
 * Created by ssc on 2017/11/5.
 */
public class StudentWeightComparator implements MyComparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getWeight() - o2.getWeight() == 0 ? 0 : o1.getWeight() - o2.getWeight() > 0 ? 1 : -1;
    }
}
