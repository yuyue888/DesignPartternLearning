package chainOfResponsibility.filterChain;

/**
 * Created by ssc on 2017/12/24.
 */
public class UpperCaseFilter implements Filter {
    @Override
    public void doFilter(String request ,String response,FilterChain filterChain) {
        System.out.println(request.toUpperCase());
        filterChain.doFilter(request,response);
        System.out.println(response.toUpperCase());
    }
}
