package Factory;

/**
 * 具体工厂实现类，根据具体需求创建对象
 * 昂贵汽车的工厂
 * Created by ssc on 2017/12/17.
 */
public class ExpensiveCarFactory extends AbstractCarFactory {
    private static ExpensiveCarFactory expensiveCarFactory;

    private ExpensiveCarFactory(){}

    public static ExpensiveCarFactory getInstance(){
        if(expensiveCarFactory == null){
            expensiveCarFactory = new ExpensiveCarFactory();
        }
        return expensiveCarFactory;
    }

    @Override
    Wheel getWheel() {
        return new ExpensiveWheel();
    }

    @Override
    Engine getEngine() {
        return new ExpensiveEngine();
    }
}
