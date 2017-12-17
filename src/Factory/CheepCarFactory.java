package Factory;

/**
 * 具体工厂实现类，根据具体需求创建对象
 * 便宜汽车的工厂
 * Created by ssc on 2017/12/17.
 */
public class CheepCarFactory extends AbstractCarFactory {
    @Override
    Car createCar() {
        Car car = new Car();
        car.setWheel(new CheepWheel());
        car.setEngine(new CheepEngine());
        return car;
    }
}
