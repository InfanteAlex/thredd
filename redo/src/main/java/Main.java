
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alexa
 */
public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int[] bigList = new int[200000000];

        for (int i = 0; i <= bigList.length - 1; i++) {
            int r = random.nextInt((10 - 1) + 1) + 1;
            bigList[i] = r;

        }
        long startTimeSingle = System.nanoTime();
        System.out.println("Sum using a single thread " + single(bigList));
        long endTimeSingle = System.nanoTime();
        long durationSingle = (endTimeSingle - startTimeSingle) / 1000000;
        System.out.println("Time using a thread  single " + durationSingle);

        int sum = 0;
        threadz t1 = new threadz(bigList, 0, 50000000);
        threadz t2 = new threadz(bigList, 50000000, 150000000);
        threadz t3 = new threadz(bigList, 150000000, 200000000);
        Thread run1 = new Thread(t1);
        Thread run2 = new Thread(t2);
        Thread run3 = new Thread(t3);
        long startTimeParallel = System.nanoTime();
        run1.start();
        run2.start();
        run3.start();

        try {

            run1.join();
            run2.join();
            run3.join();

            sum = +t1.getSum() + t2.getSum() + t3.getSum();
            System.out.println("Sum with multiple threads " + sum);
            long endTimeParallel = System.nanoTime();
            long durationParallel = (endTimeParallel - startTimeParallel) / 1000000;

            System.out.println("Time using multiple threads " + durationParallel + " miliseconds");
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static int single(int[] list) {

        int sum = 0;
        for (int num : list) {
            sum += num;

        }
        return sum;
    }

}
