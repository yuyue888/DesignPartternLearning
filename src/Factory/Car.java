package Factory;

/**要创建的对象，由两个具体部件构成
 * Created by ssc on 2017/12/17.
 */
public class Car {
    private Wheel wheel;

    private Engine engine;

    public void run(){
        System.out.print("This is a car with "+ wheel.getName() +" and "+ engine.getName());
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
