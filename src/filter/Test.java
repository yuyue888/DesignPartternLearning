package filter;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ssc on 2017/12/24.
 */
public class Test {
    public static void main(String[] args){
        String s1 = "Hello World !";
        String s2 = "Filter design pattern";
        String s3 = "apple";
        List<String> strings = Arrays.asList(s1 ,s2 ,s3);

        Filter<String> f1 = new UpperFilter();
        Filter<String> f2 = new LengthFilter();

        strings = f1.filter(strings);
        System.out.println("---upper filter---");
        strings.forEach(System.out::println);
        strings = f2.filter(strings);
        System.out.println("---length filter---");
        strings.forEach(System.out::println);
    }
}
