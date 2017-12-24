package chainOfResponsibility.handler;

/**
 * Created by ssc on 2017/12/24.
 */
public abstract class Handler {
    private Handler nextHandle;

    public Handler setNextHandle(Handler handler){
        this.nextHandle = handler;
        return this.nextHandle;
    }

    public Handler getNextHandle() {
        return nextHandle;
    }

    public abstract void handle(int number);
}
