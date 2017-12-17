package Factory;

/**
 *  测试类
 * Created by ssc on 2017/12/17.
 */
public class Test {
    public static void main(String[] args){
        AbstractCarFactory carFactory = new CheepCarFactory();//如需创建昂贵的车仅需替换具体工厂类即可
        Car expensiveCar = carFactory.createCar();
        expensiveCar.run();
    }
}
