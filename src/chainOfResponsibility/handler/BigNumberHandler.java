package chainOfResponsibility.handler;

/**
 * Created by ssc on 2017/12/24.
 */
public class BigNumberHandler extends Handler {
    @Override
    public void handle(int number) {
        if (number > 10) {
            System.out.println("BigNumberHandler deal this number :" + number);
        } else {
            if (this.getNextHandle() != null) {
                this.getNextHandle().handle(number);
            }
        }
    }
}
