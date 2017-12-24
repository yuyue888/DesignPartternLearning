package chainOfResponsibility.filterChain;

/**
 * Created by ssc on 2017/12/24.
 */
public interface Filter {
    void doFilter(String request ,String response,FilterChain filterChain);
}
