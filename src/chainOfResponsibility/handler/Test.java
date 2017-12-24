package chainOfResponsibility.handler;

/**
 * Created by ssc on 2017/12/24.
 */
public class Test {
    public static void main(String[] args) {
        Handler bigNumberHandler = new BigNumberHandler();
        Handler smallNumberHandler = new SmallNumberHandler();
        Handler NegativeHandler = new NegativeHandler();
        int[] numbers = {1, 20, 13, -10, 24, 5, -14};

        bigNumberHandler.setNextHandle(smallNumberHandler).setNextHandle(NegativeHandler);

        for (int num : numbers) {
            bigNumberHandler.handle(num);
        }
    }
}
