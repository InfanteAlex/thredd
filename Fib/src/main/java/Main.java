

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * The application's entry point
 *
 * @author Alex Infante
 */
public class Main {

    /**
     *
     * Main method for the program where an instance of the Fib class is made
     * allowing for the two different Fibonacci methods are called and their
     * runtimes are displayed.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(" ");

        Fib fibb = new Fib();

        int n = 30;

        long startTime = System.nanoTime();
        for (int i = 0; i <= n; i++) {
            if (i == 0) {

            }
            System.out.print(fibb.fibonacciRecurse(i) + " ");

        }
        long endTime = System.nanoTime();
        System.out.println(" ");
        System.out.println(endTime - startTime);
        System.out.println(" ");

        fibb.fibonacciIerative(n);
    }

}
