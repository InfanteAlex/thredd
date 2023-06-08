/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * This class has the two different methods for the Fibonacci sequence. One using
 * recursion and one using iteration.
 *
 * @author alexa
 */
class Fib {

    /**
     * The Fibonacci Sequence starts with 0 and 1 and continues by adding the
     * the last 2 previous numbers. This continues over and over until it
     * reaches the given endpoint n. This method uses recursion which in order
     * to find the nth element you must find n-1 and n-2. This continues until n
     * equals 1 or less. As the n number increases the runtime quickly grows as well
     * because it must recalculate the same numbers repeadedly.
     * 
     *
     * @param n the number given by the user that marks the endpoint of the
     * sequence. The program will stop at the nth number in the sequence.
     *
     * @return  The sequence starts at 0 and 1 if the number is less than
     * or equal to 1. It is used to start the sequence with 0 and 1.
     * <p>
     * The sequence is continued by adding n - 1 and n - 2 which are the 2
     * previous numbers in the sequence.
     *
     */
    public static int fibonacciRecurse(int n) {
        if (n <= 1) {
            return n;
        } else {
            return (fibonacciRecurse(n - 1) + fibonacciRecurse(n - 2));
        }

    }

    /**
     * The Fibonacci Sequence starts with 0 and 1 and continues by adding the
     * the last 2 previous numbers. And this continues over and over until it
     * reaches the given endpoint n. This method uses iteration which stores the result and previous 
     * number in the sequence as variables which allows the sequence to progress without having to find
     * previous values.
     *
     *
     * @param n the number given by the user that marks the endpoint of the
     * sequence. the program will stop at the nth number in the sequence.
     */
    public static void fibonacciIerative(int n) {
        long startTime1 = System.nanoTime();

        int first = 0;
        int sec = 1;

        System.out.print(first + " " + sec + " ");
        for (int i = 2; i <= n; i++) {
            int next = first + sec;
            System.out.print(next + " ");
            first = sec;
            sec = next;
        }
        long endTime1 = System.nanoTime();
        System.out.println(" ");
        System.out.println(endTime1 - startTime1);
    }
}
