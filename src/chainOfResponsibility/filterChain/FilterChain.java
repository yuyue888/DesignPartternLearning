package chainOfResponsibility.filterChain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ssc on 2017/12/24.
 */
public class FilterChain {
    private List<Filter> filters = new ArrayList<>();
    private int cursor =0 ;

    public FilterChain addFilter(Filter filter) {
        this.filters.add(filter);
        return this;
    }

    public void doFilter(String request ,String response) {
        if (cursor < filters.size()) {
            filters.get(cursor++).doFilter(request,response, this);
        }
    }
}
