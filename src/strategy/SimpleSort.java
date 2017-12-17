package strategy;

/**
 * 排序简单实现（冒泡）
 * Created by ssc on 2017/11/5.
 */
public class SimpleSort implements MySort {
    private MyComparator comparator;

    public SimpleSort() {
        this.comparator = new StudentHeightComparator();
    }

    @Override
    public <T extends MyComparable> void sort(T[] o) {
        buttonSort(o);
    }

    @Override
    public <T extends MyComparable> void sort(T[] o, MyComparator<T> myComparator) {
        this.comparator = myComparator;
        buttonSort(o);
    }

    private <T extends MyComparable> void buttonSort(T[] o){
        boolean swapped = true ;
        for (int i = 1; i < o.length && swapped; i++) {
            swapped = false;
            for (int j = 0; j < o.length - i; j++) {
                if (this.comparator.compare(o[j] ,o[j+1]) >0 ){
                    T tmp = o[j];
                    o[j] = o[j+1];
                    o[j+1] =tmp;
                    swapped = true;
                }
            }
        }
    }

}
