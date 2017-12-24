package filter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 长度过滤器
 * Created by ssc on 2017/12/24.
 */
public class LengthFilter implements Filter<String> {
    @Override
    public List<String> filter(List<String> list) {
        return list.stream().filter(s->s.length()>10).collect(Collectors.toList());
    }
}
