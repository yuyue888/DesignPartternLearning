package strategy;

/**
 * 排序接口
 *
 * Created by ssc on 2017/11/5.
 */
public interface MySort {
    <T extends MyComparable> void sort(T[] o);

    <T extends MyComparable> void sort(T[] o , MyComparator<T> myComparator);
}
