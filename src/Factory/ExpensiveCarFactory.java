package Factory;

/**
 * 具体工厂实现类，根据具体需求创建对象
 * 昂贵汽车的工厂
 * Created by ssc on 2017/12/17.
 */
public class ExpensiveCarFactory extends AbstractCarFactory {
    @Override
    Car createCar() {
        Car car = new Car();
        car.setEngine(new ExpensiveEngine());
        car.setWheel(new ExpensiveWheel());
        return car;
    }
}
