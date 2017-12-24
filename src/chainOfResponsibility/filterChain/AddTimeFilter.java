package chainOfResponsibility.filterChain;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ssc on 2017/12/24.
 */
public class AddTimeFilter implements Filter {
    @Override
    public void doFilter(String request, String response, FilterChain filterChain) {
        String datetime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        System.out.println("request:[" + datetime + "]" + request);
        filterChain.doFilter(request, response);
        System.out.println("response:[" + datetime + "]" + response);
    }
}
