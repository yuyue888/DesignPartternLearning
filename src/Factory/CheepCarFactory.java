package Factory;

/**
 * 具体工厂实现类，根据具体需求创建对象
 * 便宜汽车的工厂
 * Created by ssc on 2017/12/17.
 */
public class CheepCarFactory extends AbstractCarFactory {
    private static CheepCarFactory cheepCarFactory;

    private CheepCarFactory(){}

    public static AbstractCarFactory getInstance(){
        if(cheepCarFactory == null){
            cheepCarFactory = new CheepCarFactory();
        }
        return cheepCarFactory;
    }

    @Override
    Wheel getWheel() {
        return new CheepWheel();
    }

    @Override
    Engine getEngine() {
        return new CheepEngine();
    }
}
