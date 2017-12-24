package Factory;

/**
 * 抽象工厂类，定义抽象方法
 *
 * 抽象工厂方法：围绕一个超级工厂创建其他工厂，生产出成系列的对象
 * Created by ssc on 2017/12/17.
 */
public abstract class AbstractCarFactory {
    abstract Car createCar();
}
