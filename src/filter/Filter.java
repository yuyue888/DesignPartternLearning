package filter;

import java.util.List;

/**
 * 过滤器模式
 * Created by ssc on 2017/12/24.
 */
public interface Filter<T> {
    List<T> filter(List<T> list);
}
