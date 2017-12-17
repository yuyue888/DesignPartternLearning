package strategy;

/**
 * 比较策略接口
 * Created by ssc on 2017/11/5.
 */
public interface MyComparator<T> {
    int compare(T o1 , T o2);
}
