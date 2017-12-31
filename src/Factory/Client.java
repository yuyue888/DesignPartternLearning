package Factory;

/**
 *  测试类
 * Created by ssc on 2017/12/17.
 */
public class Client {
    public static void main(String[] args){
        Car car1 = CarProducer.getCar("cheep");
        car1.run();
        Car car2 = CarProducer.getCar("expensive");
        car2.run();
    }
}
