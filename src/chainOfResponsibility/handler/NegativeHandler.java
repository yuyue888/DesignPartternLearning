package chainOfResponsibility.handler;

/**
 * Created by ssc on 2017/12/24.
 */
public class NegativeHandler extends Handler {
    @Override
    public void handle(int number) {
        if(number < 0){
            System.out.println("NegativeHandler deal this number:"+number);
        }else {
            if(this.getNextHandle() != null){
                this.getNextHandle().handle(number);
            }
        }
    }
}
