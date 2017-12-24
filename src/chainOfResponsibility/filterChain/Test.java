package chainOfResponsibility.filterChain;

/**
 * Created by ssc on 2017/12/24.
 */
public class Test {
    public static void main(String[] args){
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new UpperCaseFilter()).addFilter(new AddTimeFilter()).doFilter("deal request" ,"deal response");
    }
}
