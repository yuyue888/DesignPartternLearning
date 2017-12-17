package strategy;

/**
 * 比较策略一：按年龄比较
 * Created by ssc on 2017/11/5.
 */
public class StudentHeightComparator implements MyComparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getHeight() - o2.getHeight() == 0 ? 0 : o1.getHeight() - o2.getHeight()>0 ? 1 : -1;
    }
}
