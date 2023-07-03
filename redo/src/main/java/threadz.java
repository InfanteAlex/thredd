
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.LongStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alexa
 */
public class threadz implements Runnable {

    private int[] list;
    private int start;
    private int end;
    private int su1m = 0;

    public threadz(int[] list, int start, int end) {
        this.list = list;
        this.end = end;
        this.start = start;

    }

    @Override
    public void run() {

        su1m = getValue(start, end);

    }

    public int getValue(int start, int end) {

        int sum = 0;
        for (int i = start; i < end; i++) {

            sum += list[i];

        }

        return sum;

    }

    public int getSum() {

//        this.su1m += getValue();
        return su1m;
    }

}
