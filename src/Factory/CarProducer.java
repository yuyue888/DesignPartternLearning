package Factory;

/**
 * Created by ssc on 2017/12/31.
 */
public class CarProducer {

    public static AbstractCarFactory getFactory(String type){
        if(type.equals("expensive")){
            return ExpensiveCarFactory.getInstance();
        }else if(type.equals("cheep")){
            return CheepCarFactory.getInstance();
        }
        return null;
    }

    public static Car getCar(String type){
        Engine engine = getFactory(type).getEngine();
        Wheel wheel = getFactory(type).getWheel();
        Car car = new Car();
        car.setEngine(engine);
        car.setWheel(wheel);
        return car;
    }
}
