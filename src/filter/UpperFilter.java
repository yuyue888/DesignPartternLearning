package filter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 大写过滤器
 * Created by ssc on 2017/12/24.
 */
public class UpperFilter implements Filter<String> {
    @Override
    public List<String> filter(List<String> list) {
        return list.stream().map(String::toUpperCase).collect(Collectors.toList());
    }
}
